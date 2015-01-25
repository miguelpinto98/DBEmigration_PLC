ActiveRecord::Base.transaction do
  # (criar e) obter pessoa
  pessoa = Person.where(name: 'nome').empty? ? Person.create!(name: 'nome') : Person.where(name: 'nome').first

  # e actualizar campos que estejam vazios na pessoa
  pessoa.nasc = Date.new(ano,mes,dia) unless pessoa.nasc?
  pessoa.habil = 'habilitacoes' unless pessoa.habil?
  pessoa.bi = 'bi' unless pessoa.bi?

  pessoa.gender = genero if pessoa.undefined?
  pessoa.civil = estado_civil #actualizar sempre

  # (criar e) obter profissao e ligar à pessoa
  unless pessoa.profession_id?
    pessoa.profession = Profession.where(desc: 'profissao').empty? ? Profession.create!(desc: 'profissao') : Profession.where(desc: 'profissao').first
  end

  # (criar e) obter local_nascimento e ligar à pessoa
  unless pessoa.local_nasc?
    pessoa.localNasc = Local.where(desc: 'local_nasc').empty? ? Local.create!(desc: 'local_nasc') : Local.where(desc: 'local_nasc').first
  end

  # (criar e) obter local_trabalho e ligar à pessoa
  unless pessoa.local_work?
    pessoa.localWork = Local.where(desc: 'local_trabalho').empty? ? Local.create!(desc: 'local_trabalho') : Local.where(desc: 'local_trabalho').first
  end

  # (criar e) obter residencia e ligar à pessoa
  unless pessoa.residencia?
    pessoa.residencia = Local.where(desc: 'residencia').empty? ? Local.create!(desc: 'residencia') : Local.where(desc: 'residencia').first
  end
  
  # criar e obter passaporte e ligar à pessoa
  # (criar e) obter profissao do passaporte e ligar ao passaporte
  # (criar e) obter local de destino do passaporte e ligar ao passaporte
  # (criar e) obter local de trabalho do passaporte e ligar ao passaporte
  Passport.create!({
    number: 'passaporte',
    process: 'number',
    year: ano,
    municipio: 'camara',
    submitted: Date.new(ano,mes,dia),
    profession: Profession.where(desc:'profissao').empty? ? Profession.create!(desc:'profissao') : Profession.where(desc:'profissao').first,
    local: Local.where(desc: 'país e cidade').empty? ? Local.create!(desc:'país e cidade') : Local.where(desc:'país e cidade').first,
    person: pessoa,
    work_local_id: Local.where(desc: 'local trabalho').empty? ? Local.create!(desc:'local trabalho').id : Local.where(desc:'local trabalho').first.id,
    departure: Date.new(ano,mes,dia),
  })

  # (criar e) obter o pai da pessoa
  pai = Person.where(name: 'pai').empty? ? Person.create!(name: 'pai') : Person.where(name: 'pai').first

  # (criar e) obter a mãe da pessoa
  mae = Person.where(name: 'mae').empty? ? Person.create!(name: 'mae') : Person.where(name: 'mae').first

  # criar o casamento entre o pai e a mae da pessoa se nao existir
  casamento = Marriage.where(husband: pai, wife: mae).empty? ? Marriage.create!(husband: pai, wife: mae) : Marriage.where(husband: pai, wife: mae).first
  
  # adicionar a pessoa ao casamento.children
  casamento.children << pessoa

  # criar e obter a pessoa (conjungue), meter o sexo caso esteja a criar uma nova pessoa
  if Person.where(name: 'conjugue').empty?
    genero = :female if pessoa.male?
    conjugue = Person.create!(name: 'conjugue', gender: pessoa.male? ? :female : :male)
  else
    conjugue = Person.where(name: 'conjugue').first
  end

  # criar um casamento entre as duas pessoas
  if pessoa.male?
    homem = pessoa
    mulher = conjugue
  else
    homem = conjugue
    mulher = pessoa
  end
  casamento = Marriage.where(husband: homem, wife: mulher).empty? ? Marriage.create!(husband: homem, wife: mulher) : Marriage.where(husband: homem, wife: mulher).first

  # para cada filho
  #   criar a pessoa caso não exista
  #   adicionar a pessoa ao casamento.children
  casamento.children << Person.where(name: 'filho').empty? ? Person.create!(name: 'filho') : Person.where(name: 'filho').first

  # guardar a pessoa no fim
  pessoa.save!
end

=begin
[
  {
    "processo": {
      "ano" : 1234 ,
      "numero" : "733/66-266B5",
      "passaporte" : "zAB1a3",
      "camara" : "as df",
      "submetido" : "1946-6-10"
    },
    "requerente": {
      "nome" : "Alberto Miranda",
      "bi" : "123456789",
      "residencia" : "Rua da fonte, n5",
      "data nasc" : "1924-12-25",
      "local nasc" : "Santarém",
      "genero" : "masculino",
      "pais" : {
        "pai": "Joaquim Miranda",
        "mãe": "Alexandra Pereira"
      },
      "estado civil" : "casado",
      "conjugue" : "Mafalda Freitas",
      "filhos" : [
        "Afonso Miranda",
        "Tataiana Freitas",
        "Ernesto Freitas"
      ],
      "profissao" : "Jornalista",
      "local trabalho" : "Porto",
      "habilitacoes" : "12º ano"
    },
    "destino" : {
      "país e cidade" : "Paris, França",
      "data partida" : "1952-09-11",
      "profissao" : "Jornalista",
      "local trabalho" : "Paris, França"
    }
  }
]
=end
