class Local < ActiveRecord::Base
  has_many :biographies
  has_many :photos
  has_many :people
  has_many :passport
end
