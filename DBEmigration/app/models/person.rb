class Person < ActiveRecord::Base
  has_and_belongs_to_many :photos, :through => :people_photos
  has_and_belongs_to_many :biographies, :through => :biographies_people

  has_many :is_husband_in_marriages, :foreign_key => :husband_id, :class_name => 'Marriage'
  has_many :is_wife_in_marriages, :foreign_key => :wife_id, :class_name => 'Marriage'

  has_many :husbands, through: :is_wife_in_marriages
  has_many :wives, through: :is_husband_in_marriages

  has_many :passports
  
  belongs_to :profession

  has_one :localNasc, :foreign_key => :local_nasc
  has_one :localWork, :foreign_key => :local_work

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
  as_enum :civil, single: 0, married: 1, divorced: 3, widowed: 4

  # obter todos os filhos de uma pessoa
  def children
    Marriage.includes(:children).map{|m| m.children}.inject(:+)
  end
end
