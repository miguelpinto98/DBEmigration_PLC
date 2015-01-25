class Local < ActiveRecord::Base
  has_many :biographies
  has_many :photos

  # adicionar has_many para cada localização que a pessoa pode ter
  # adicionar has_many para cada localização que o passaporte pode ter
end
