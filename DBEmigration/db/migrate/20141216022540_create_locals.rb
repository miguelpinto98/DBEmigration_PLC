class CreateLocals < ActiveRecord::Migration
  def change
    create_table :locals do |t|
      t.string :desc

      t.timestamps
    end
  end
end
