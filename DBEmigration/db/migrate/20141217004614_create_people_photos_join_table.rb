class CreatePeoplePhotosJoinTable < ActiveRecord::Migration
  def self.up
    create_table :people_photos, :id => false do |t|
      t.integer :photo_id
      t.integer :person_id
    end

    add_index :people_photos, [:photo_id, :person_id], :unique => true
  end

  def self.down
    drop_table :people_photos
  end
end
