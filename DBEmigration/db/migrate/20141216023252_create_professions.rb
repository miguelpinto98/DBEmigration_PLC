class CreateProfessions < ActiveRecord::Migration
  def change
    create_table :professions do |t|
      t.string :desc

      t.timestamps
    end
  end
end
