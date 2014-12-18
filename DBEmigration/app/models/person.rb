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

  # https://github.com/lwe/simple_enum
  # Person.marrieds dá todos os casados
  as_enum :gender, female: 2, male: 1, undefined: 0
  as_enum :civil, single: 0, married: 1, divorced: 3, widowed: 4
end
