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
    @passport = Passport.new

    #obter o json
    path = params[:passport]['p_file'].path

    #chamar o java com o json
    @erros = Array.new
    java_err = Array.new
    java_out = ''
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
        @erros << 'Ocorreu um erro ao executar a script ruby gerada. Ver o log para detalhes'
      end
    else
      @erros = java_err
    end

    respond_to do |format|
      if @erros.empty?
        format.html { redirect_to pass_path, notice: 'Passports were successfully created.' }
        format.json { render :show, status: :created, location: pass_path }
      else
        flash[:notice] = @erros.join("\n")
        format.html { render :new }
        format.json { render json: @erros, status: :unprocessable_entity }
      end
    end
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
