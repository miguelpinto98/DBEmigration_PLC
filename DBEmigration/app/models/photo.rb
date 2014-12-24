class Photo < ActiveRecord::Base
  has_and_belongs_to_many :people, :through => :people_photos
  belongs_to :local

  mount_uploader :path, PathUploader # Tells rails to use this uploader for this model.
end
