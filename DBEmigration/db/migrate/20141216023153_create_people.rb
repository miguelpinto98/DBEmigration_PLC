class CreatePeople < ActiveRecord::Migration
  def change
    create_table :people do |t|
      t.string :name
      t.date :nasc
      t.string :civil
      t.string :habil

      t.integer :local_nasc
      t.integer :local_work
      t.belongs_to :profession

      t.timestamps
    end
  end
end
