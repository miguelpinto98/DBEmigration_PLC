class Person < ActiveRecord::Base
  has_and_belongs_to_many :photos, :through => :photos_people
end
