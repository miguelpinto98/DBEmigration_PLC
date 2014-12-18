class CreateMarriages < ActiveRecord::Migration
  def change
    create_table :marriages do |t|
      t.references :wife
      t.references :husband
      
      t.timestamps
    end

    add_index :marriages, [:wife_id, :husband_id], :unique => true
  end
end


