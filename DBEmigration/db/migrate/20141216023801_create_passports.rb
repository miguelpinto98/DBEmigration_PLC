class CreatePassports < ActiveRecord::Migration
  def change
    create_table :passports do |t|
      t.string :number #numero do passaporte
      t.string :process #numero do processo
      t.integer :year
      t.string :municipio
      t.date :submitted
      
      t.belongs_to :profession
      t.belongs_to :local
      t.belongs_to :person

      t.timestamps
    end
  end
end
