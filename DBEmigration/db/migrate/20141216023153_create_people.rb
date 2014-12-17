class CreatePeople < ActiveRecord::Migration
  def change
    create_table :people do |t|
      t.string :name
      t.date :nasc
      t.string :habil

      #nestes o _cd é necessário por serem enumerations
      t.integer :gender_cd
      t.integer :civil_cd

      t.integer :local_nasc
      t.integer :local_work
      t.belongs_to :profession

      t.timestamps
    end
  end
end
