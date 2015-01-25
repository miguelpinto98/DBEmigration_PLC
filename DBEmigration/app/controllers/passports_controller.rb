require 'popen4'

class PassportsController < ApplicationController
  before_action :set_passport, only: [:show, :edit, :update, :destroy]

  # GET /passports
  # GET /passports.json
  def index
    @passports = Passport.all
  end

  # GET /passports/1
  # GET /passports/1.json
  def show
  end

  # GET /passports/new
  def new
    @passport = Passport.new
  end

  # GET /passports/1/edit
  def edit
  end

  # POST /passports
  # POST /passports.json
  def create
    @passport = Passport.new(passport_params)

    #obter o json
    path = params[:passport]['p_file'].path

    #chamar o java com o json
    java_out = ''
    java_err = Array.new
    status = POpen4::popen4( "java -jar lib/java/Passports.jar #{path}" ) do |stdout, stderr, stdin|
      java_out = stdout.read
      java_err = stderr.readlines
        .select{|e|not e.start_with?('Picked up _JAVA_OPTIONS')}
        .map{|e| e.chop! if e.end_with? "\n"}
    end
    puts "status: #{status.exitstatus}\n\nStdErr:\n#{java_err.to_s}\n\nStdOut.length:\n#{java_out.length}"

    unless java_out.empty?
      File.open("#{path}.rb", 'w') do |f|
        f.write java_out
      end
      begin
        load("#{path}.rb")
      rescue Exception => e
        puts "Exception ao correr o ficheiro ruby gerado pelo java"
        puts "[message]\n#{e.message}"
        print "[minimal-backtrace]\n" + e.backtrace.select{|e|e.include?('RackMultipart')}.join("\n")

      end

=begin
      puts "rails r #{path}.rb"

      status = POpen4::popen4( "rails r #{path}.rb" ) do |stdout, stderr, stdin|
        ruby_out = stdout.read
        ruby_err = stderr.read
      end

      puts status.exitstatus

      puts 'ruby err'
      puts ruby_err
      puts 'ruby out'
      puts ruby_out
=end
    else
      #TODO: mostrar erros do java
    end

    

    #obter output + stderr
    #  se tem output, executar
    #    se deu erro, mostrar erro
    #  senao mostrar stderr, um erro por linha

    respond_to do |format|
      format.html { render :text => "dummy"}
    end

    #respond_to do |format|
    #  if @passport.save
    #    format.html { redirect_to pass_path, notice: 'Passport was successfully created.' }
    #    format.json { render :show, status: :created, location: @passport }
    #  else
    #    format.html { render :new }
    #    format.json { render json: @passport.errors, status: :unprocessable_entity }
    #  end
    #end
  end

  # PATCH/PUT /passports/1
  # PATCH/PUT /passports/1.json
  def update
    respond_to do |format|
      if @passport.update(passport_params)
        format.html { redirect_to @passport, notice: 'Passport was successfully updated.' }
        format.json { render :show, status: :ok, location: @passport }
      else
        format.html { render :edit }
        format.json { render json: @passport.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /passports/1
  # DELETE /passports/1.json
  def destroy
    @passport.destroy
    respond_to do |format|
      format.html { redirect_to passports_url, notice: 'Passport was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_passport
      @passport = Passport.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def passport_params
      params.require(:passport).permit(:number, :year, :municipio, :submitted)
    end
end
