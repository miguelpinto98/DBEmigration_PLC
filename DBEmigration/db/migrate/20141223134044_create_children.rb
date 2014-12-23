class CreateChildren < ActiveRecord::Migration
  def change
    create_table :children do |t|
      t.references :marriage
      t.references :person
      
      t.timestamps
    end

    add_index :marriages, [:marriage_id, :person_id], :unique => true
  end
end
