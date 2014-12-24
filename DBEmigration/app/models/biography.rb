class Biography < ActiveRecord::Base
  has_and_belongs_to_many :people, :through => :biographies_people
  belongs_to :local
end
