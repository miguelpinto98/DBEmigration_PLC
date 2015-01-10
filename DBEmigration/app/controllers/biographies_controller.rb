class BiographiesController < ApplicationController
  before_action :set_biography, only: [:show, :edit, :update, :destroy]

  # GET /biographies
  # GET /biographies.json
  def index
    @biographies = Biography.all
  end

  # GET /biographies/1
  # GET /biographies/1.json
  def show
  end

  # GET /biographies/new
  def new
    @biography = Biography.new
  end

  # GET /biographies/1/edit
  def edit
  end


  # POST /biographies
  # POST /biographies.json
  def create
    if params[:biography].present?
      xmlfile = params[:biography][:event].path

      # XSD File
      xsdfile = 'public/schemas/bio.xsd'
      xsd = Nokogiri::XML::Schema(File.read(xsdfile))
      doc = Nokogiri::XML(File.open(xmlfile))

      # SCH File
      schfile = 'public/schemas/bio_1.sch'
      sch_doc = XML::Document.file(schfile)
      sch = Schematron::Schema.new(sch_doc)
      sch_xml = XML::Document.file(xmlfile)

      if xsd.valid? doc
        if sch.validate(sch_xml).size == 0
          n_registos = doc.xpath('count(//registo)').to_i

          for i in 1..n_registos
            bio = Biography.new
            bio.date = doc.xpath("//registo[#{i}]/@data").text
            bio.event = (doc.xpath("//registo[#{i}]/evento")).text
            bio.original = doc.xpath("//registo[#{i}]/texto").text

            #LOCAIS
            local = doc.xpath("//registo[#{i}]/texto/local").text
            if !local.empty?
              bio.local = Local.create(desc: local)
            end

            #PESSOAS
            n_nomes = doc.xpath("count(//registo[#{i}]/texto/nome)").to_i
            for j in 1..n_nomes
              name = doc.xpath("//registo[#{i}]/texto/nome[#{j}]").text
              bio.people << Person.create(name: name)
            end

            @flag = bio.save
          end
        end
      end
    end

    respond_to do |format|
      if @flag
        format.html { redirect_to action: 'index', notice: 'OK' }
      else
        format.html { redirect_to action: 'new', notice: 'ERRORS' }
      end
    end
  end

  # PATCH/PUT /biographies/1
  # PATCH/PUT /biographies/1.json
  def update
    respond_to do |format|
      if @biography.update(biography_params)
        format.html { redirect_to @biography, notice: 'Biography was successfully updated.' }
        format.json { render :show, status: :ok, location: @biography }
      else
        format.html { render :edit }
        format.json { render json: @biography.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /biographies/1
  # DELETE /biographies/1.json
  def destroy
    @biography.destroy
    respond_to do |format|
      format.html { redirect_to biographies_url, notice: 'Biography was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_biography
      @biography = Biography.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def biography_params
      params.require(:biography).permit(:event)
    end
end
