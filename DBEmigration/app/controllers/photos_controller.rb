class PhotosController < ApplicationController
  before_action :set_photo, only: [:show, :edit, :update, :destroy]

  # GET /photos
  # GET /photos.json
  def index
    @photos = Photo.all
  end

  # GET /photos/1
  # GET /photos/1.json
  def show
  end

  # GET /photos/new
  def new
    @photo = Photo.new
  end

  # GET /photos/1/edit
  def edit
  end

  # POST /photos
  # POST /photos.json
   def create
    if params[:photo].present?
      require 'set'
      require 'zip'

      #Load files
      xsdfile = "public/schemas/foto.xsd"
      zipfile = params[:photo][:file].path
      zipfilename = params[:photo][:file].original_filename
      images = Hash.new

      if(File.extname(zipfilename) == ".zip")
        #Gera string random
        o = [('a'..'z'), ('A'..'Z')].map { |i| i.to_a }.flatten
        @random_string = (0...50).map { o[rand(o.length)] }.join

        Zip::File.open(zipfile) do |zip|
          zip.each do |entry|
            if(File.extname(entry.name) == ".xml")
              @xmlfile = zip.read(entry.name)
            else
              f_path = File.join('public/'+ @random_string, entry.name)
              FileUtils.mkdir_p(File.dirname(f_path))
              zip.extract(entry, f_path) unless File.exist?(f_path)
              images[entry.name] = f_path
            end
          end
        end
      end
    
      xsd = Nokogiri::XML::Schema(File.read(xsdfile))
      doc = Nokogiri::XML(@xmlfile)

      #Erros
      erros = []
      xsd.validate(doc).each do |error|
        erros.push(error.message)
      end

      if xsd.valid?(doc)
        #Create photo
        nfotos = doc.xpath("count(//foto)").to_i

        for i in 1..nfotos
          photo = Photo.new
          #path
          ficheiro = doc.xpath("//foto[#{i}]/@ficheiro").text
          f = File.open(images[ficheiro])
          photo.path = f
          f.close
          
          #date
          quando = doc.xpath("//foto[#{i}]/quando/@data").text
          photo.date = quando unless quando.empty?
          
          #fact
          facto = (doc.xpath("//foto[#{i}]/facto")).text
          photo.fact = facto unless facto.empty?
          
          #caption
          legenda = (doc.xpath("//foto[#{i}]/legenda")).text
          photo.caption = legenda unless legenda.empty?
          
          #local
          onde = (doc.xpath("//foto[#{i}]/onde")).text
          if !onde.empty?
            if Local.exists?(:desc => onde)
              photo.local = Local.where(:desc => onde).first
            else
              photo.local = Local.create(desc: onde)
            end
          end

          #people
          quem = (doc.xpath("//foto[#{i}]/quem")).text
          nomes = quem.split(';').map(&:strip)
          nomes.each do |n|
            if Person.exists?(:name => n)
              photo.people = Person.where(:name => n)
            else
              photo.people << Person.create(name: n)
            end
          end

          photo.save
        end
      end
      FileUtils.rm_rf('public/'+ @random_string)
      
      respond_to do |format|
        if xsd.valid?(doc)
          format.html { render :text => "Ok"}
        else
          format.html { render :text => erros }
        end
      end
    else
      redirect_to new_photo_path
    end
  end

  # PATCH/PUT /photos/1
  # PATCH/PUT /photos/1.json
  def update
    respond_to do |format|
      if @photo.update(photo_params)
        format.html { redirect_to @photo, notice: 'Photo was successfully updated.' }
        format.json { render :show, status: :ok, location: @photo }
      else
        format.html { render :edit }
        format.json { render json: @photo.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /photos/1
  # DELETE /photos/1.json
  def destroy
    @photo.destroy
    respond_to do |format|
      format.html { redirect_to photos_url, notice: 'Photo was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_photo
      @photo = Photo.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def photo_params
      params.require(:photo).permit(:path, :date, :fact, :legend)
    end
end
