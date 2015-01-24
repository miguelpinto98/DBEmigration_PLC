class RemoveProcessFromPassports < ActiveRecord::Migration
  def change
    remove_column :passports, :process, :string
  end
end
