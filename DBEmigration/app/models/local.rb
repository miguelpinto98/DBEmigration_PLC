class Local < ActiveRecord::Base
  has_many :biographies
  has_many :photos

  # has_many para cada localização que a pessoa pode ter
  has_many :person_local_nasc, :foreign_key => :local_nasc, :class_name => 'Person'
  has_many :person_local_work, :foreign_key => :local_work, :class_name => 'Person'
  has_many :person_residence, :foreign_key => :residence, :class_name => 'Person'

  # has_many para cada localização que o passaporte pode ter
  has_many :passport_destination, :foreign_key => :local_id, :class_name => 'Passport'
  has_many :passport_destination_work, :foreign_key => :work_local_id, :class_name => 'Passport'
end
