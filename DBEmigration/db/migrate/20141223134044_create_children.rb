class CreateChildren < ActiveRecord::Migration
  def change
    create_table :children do |t|
      t.references :marriage
      t.references :person
      
      t.timestamps
    end

    add_index :children, [:marriage_id, :person_id], :unique => true
  end
end
