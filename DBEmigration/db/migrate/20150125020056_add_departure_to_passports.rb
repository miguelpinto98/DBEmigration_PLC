class AddDepartureToPassports < ActiveRecord::Migration
  def change
    add_column :passports, :departure, :date
  end
end
