class Person < ActiveRecord::Base
  has_and_belongs_to_many :photos, :through => :photos_people
  has_and_belongs_to_many :biographies, :through => :biographies_people
  belongs_to :profession

  has_one :localNasc, :foreign_key => :local_nasc
  has_one :localWork, :foreign_key => :local_work
end
