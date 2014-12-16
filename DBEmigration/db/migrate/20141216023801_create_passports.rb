class CreatePassports < ActiveRecord::Migration
  def change
    create_table :passports do |t|
      t.string :number
      t.integer :year
      t.string :municipio
      t.date :submitted
      
      t.belongs_to :profession

      t.timestamps
    end
  end
end
