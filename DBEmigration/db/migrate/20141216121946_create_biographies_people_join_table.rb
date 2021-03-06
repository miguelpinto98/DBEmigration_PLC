class CreateBiographiesPeopleJoinTable < ActiveRecord::Migration
  def self.up
    create_table :biographies_people, :id => false do |t|
      t.integer :biography_id
      t.integer :person_id
    end

    add_index :biographies_people, [:biography_id, :person_id], :unique => true
  end

  def self.down
    drop_table :biographies_people
  end
end
