class Photo < ActiveRecord::Base
  has_and_belongs_to_many :people, :through => :people_photos
  belongs_to :local
end
