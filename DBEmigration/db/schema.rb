# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 20141216023833) do

  create_table "biographies", force: true do |t|
    t.text     "event"
    t.date     "date"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "locals", force: true do |t|
    t.string   "description"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "passports", force: true do |t|
    t.string   "number"
    t.integer  "year"
    t.string   "municipio"
    t.date     "submitted"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "people", force: true do |t|
    t.string   "name"
    t.date     "nasc"
    t.string   "civil"
    t.string   "habil"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "photos", force: true do |t|
    t.string   "path"
    t.date     "date"
    t.string   "fact"
    t.string   "legend"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "professions", force: true do |t|
    t.string   "desc"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
