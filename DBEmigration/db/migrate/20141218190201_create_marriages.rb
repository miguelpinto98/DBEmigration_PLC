class CreateMarriages < ActiveRecord::Migration
  def change
    create_table :marriages do |t|
      t.references :male
      t.references :female

      t.timestamps
    end
  end
end
