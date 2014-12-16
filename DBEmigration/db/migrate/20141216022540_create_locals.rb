class CreateLocals < ActiveRecord::Migration
  def change
    create_table :locals do |t|
      t.string :description

      t.timestamps
    end
  end
end
