class CreatePhotos < ActiveRecord::Migration
  def change
    create_table :photos do |t|
      t.string :path
      t.date :date
      t.string :fact
      t.string :legend

      t.timestamps
    end
  end
end
