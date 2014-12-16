class Person < ActiveRecord::Base
  has_and_belongs_to_many :photos, :through => :photos_people
  has_and_belongs_to_many :biographies, :through => :biographies_people
  belongs_to :profession
  belongs_to :local
end
