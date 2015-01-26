class AddWorkLocalIdToPassports < ActiveRecord::Migration
  def change
    add_column :passports, :work_local_id, :integer
  end
end
