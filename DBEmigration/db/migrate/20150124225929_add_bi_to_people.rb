class AddBiToPeople < ActiveRecord::Migration
  def change
    add_column :people, :bi, :string
  end
end
