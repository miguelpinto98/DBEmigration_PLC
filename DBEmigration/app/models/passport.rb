class Passport < ActiveRecord::Base
  belongs_to :profession
  belongs_to :local
  belongs_to :localWork, :foreign_key => :work_local_id, class_name: 'Local'
  belongs_to :person
end
