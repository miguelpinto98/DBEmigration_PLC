class CreatePeople < ActiveRecord::Migration
  def change
    create_table :people do |t|
      t.string :name
      t.date :nasc
      t.string :civil
      t.string :habil

      t.timestamps
    end
  end
end
