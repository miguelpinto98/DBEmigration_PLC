class Photo < ActiveRecord::Base
  has_and_belongs_to_many :people, :through => :photos_people
  belongs_to :local
end
