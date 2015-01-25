class Local < ActiveRecord::Base
  has_many :biographies
  has_many :photos
  has_many :passports

  # adicionar has_many para cada localização que a pessoa pode ter
end
