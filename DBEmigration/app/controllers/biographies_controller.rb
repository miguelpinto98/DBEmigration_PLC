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
          #Ciclo Por Registo
          i = r.xpath("count(//registo)")
          doc.xpath('//registo').each do |r|
            bio = Biography.new
            bio.date = r.xpath("@data").text
            bio.event = r.xpath("evento").text
            bio.original = r.xpath("texto").text.squish

            #LOCAIS
            local = r.xpath("texto/local").text
            if !local.empty?

              l = Local.where(desc: local).first
              if l.blank?
                bio.local = Local.create(desc: local)
              else
                bio.local = l
              end
            end

            #PESSOAS
            r.xpath("texto/nome").each do |rn|
              ref = rn.xpath('@ref').text
              name = rn.text

              if !ref.blank?
                name = ref
              end

              p = Person.where(name: name).first
              if p.blank?
                bio.people << Person.create(name: name)
              else
                bio.people << p
              end
            end

            @flag = bio.save
          end
        end
      end
    end

    respond_to do |format|
      if @flag
        flash[:notice] = "#{i} Biografias inseridas com sucesso."
        format.html { redirect_to action: 'index' }
      else
        flash[:notice] = " Ficheiro introduzido inválido!"
        format.html { redirect_to action: 'new' }
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
      format.html { redirect_to biographies_url, notice: 'Biografia removida com sucesso.' }
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
