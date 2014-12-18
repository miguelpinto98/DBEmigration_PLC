class Marriage < ActiveRecord::Base
  belongs_to :male, class_name: "Person", foreign_key: "male_id"
  belongs_to :female, class_name: "Person", foreign_key: "female_id"
end
