class CreateMarriage < ActiveRecord::Migration
  def self.up
    create_table :marriages do |t|
      t.integer :wife_id
      t.integer :husband_id
    end

    add_index :marriages, [:wife_id, :husband_id], :unique => true
  end

  def self.down
    drop_table :marriages
  end
end


