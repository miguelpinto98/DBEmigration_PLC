class CreatePhotosPeopleJoinTable < ActiveRecord::Migration
  def self.up
    create_table :photos_people, :id => false do |t|
      t.integer :photo_id
      t.integer :person_id
    end

    add_index :photos_people, [:photo_id, :person_id]
  end

  def self.down
    drop_table :photos_people
  end
end
