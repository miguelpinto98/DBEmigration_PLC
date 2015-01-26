class Person < ActiveRecord::Base
  has_and_belongs_to_many :photos, :through => :people_photos
  has_and_belongs_to_many :biographies, :through => :biographies_people

  has_many :is_husband_in_marriages, :foreign_key => :husband_id, :class_name => 'Marriage'
  has_many :is_wife_in_marriages, :foreign_key => :wife_id, :class_name => 'Marriage'

  has_many :husbands, through: :is_wife_in_marriages
  has_many :wives, through: :is_husband_in_marriages

  has_many :passports

  belongs_to :profession

  belongs_to :residence, :foreign_key => :residence, class_name: 'Local'
  belongs_to :localNasc, :foreign_key => :local_nasc, class_name: 'Local'
  belongs_to :localWork, :foreign_key => :local_work, class_name: 'Local'

  # child_entry de uma pessoa é o casamento que a originou (com classe Child)
  has_one :child_entry, class_name: 'Child', inverse_of: :person
  # marriage de uma pessoa é o casamento que a originou (com classe Marriage)
  has_one :marriage, through: :child_entry
  # as duas relações acima servem para conseguir as duas abaixo
  has_one :father, through: :marriage, source: :husband
  has_one :mother, through: :marriage, source: :wife

  # https://github.com/lwe/simple_enum
  # Person.marrieds dá todos os casados
  as_enum :gender, female: 2, male: 1, undefined: 0
  as_enum :civil, single: 0, married: 1, divorced: 2, widowed: 3

  # obter todos os filhos de uma pessoa
  def children
    (is_husband_in_marriages + is_wife_in_marriages).map{|m| m.children}.inject(:+) || Array.new
  end
end
