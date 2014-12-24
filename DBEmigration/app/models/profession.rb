class Profession < ActiveRecord::Base
  has_many :passports
  has_many :people
end
