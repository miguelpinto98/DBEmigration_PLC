class Passport < ActiveRecord::Base
  belongs_to :profession
  belongs_to :local
  belongs_to :person
end
