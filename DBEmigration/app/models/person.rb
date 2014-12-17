class Person < ActiveRecord::Base
  has_and_belongs_to_many :photos, :through => :photos_people
  has_and_belongs_to_many :biographies, :through => :biographies_people

  has_many :passports
  
  belongs_to :profession

  has_one :localNasc, :foreign_key => :local_nasc
  has_one :localWork, :foreign_key => :local_work

  # https://github.com/lwe/simple_enum
  as_enum :gender, :female => 1, :male => 0
  as_enum :civil, single: 0, married: 1, divorced: 3, widowed: 4

  attr_accessor :gender_cd
  attr_accessor :civil_cd

end
