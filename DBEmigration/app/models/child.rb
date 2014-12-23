class Child < ActiveRecord::Base
  belongs_to :marriage, inverse_of: :children_entries
  belongs_to :person, inverse_of: :child_entry
end
