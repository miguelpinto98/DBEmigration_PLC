class AddResidenceToPeople < ActiveRecord::Migration
  def change
    add_column :people, :residence, :integer
  end
end
