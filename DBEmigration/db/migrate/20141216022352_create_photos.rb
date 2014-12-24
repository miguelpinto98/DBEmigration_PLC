class CreatePhotos < ActiveRecord::Migration
  def change
    create_table :photos do |t|
      t.string :path
      t.date :date
      t.text :fact
      t.string :caption

      t.belongs_to :local

      t.timestamps
    end
  end
end
