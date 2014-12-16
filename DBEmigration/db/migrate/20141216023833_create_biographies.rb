class CreateBiographies < ActiveRecord::Migration
  def change
    create_table :biographies do |t|
      t.text :event
      t.date :date

      t.belongs_to :local

      t.timestamps
    end
  end
end
