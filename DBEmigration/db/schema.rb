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

ActiveRecord::Schema.define(version: 20141218190201) do

  create_table "biographies", force: true do |t|
    t.text     "event"
    t.text     "original"
    t.date     "date"
    t.integer  "local_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "biographies_people", id: false, force: true do |t|
    t.integer "biography_id"
    t.integer "person_id"
  end

  add_index "biographies_people", ["biography_id", "person_id"], name: "index_biographies_people_on_biography_id_and_person_id", unique: true

  create_table "locals", force: true do |t|
    t.string   "description"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "marriages", force: true do |t|
    t.integer  "male_id"
    t.integer  "female_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "passports", force: true do |t|
    t.string   "number"
    t.string   "process"
    t.integer  "year"
    t.string   "municipio"
    t.date     "submitted"
    t.integer  "profession_id"
    t.integer  "local_id"
    t.integer  "person_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "people", force: true do |t|
    t.string   "name"
    t.date     "nasc"
    t.string   "habil"
    t.integer  "gender_cd"
    t.integer  "civil_cd"
    t.integer  "local_nasc"
    t.integer  "local_work"
    t.integer  "profession_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "people_photos", id: false, force: true do |t|
    t.integer "photo_id"
    t.integer "person_id"
  end

  add_index "people_photos", ["photo_id", "person_id"], name: "index_people_photos_on_photo_id_and_person_id", unique: true

  create_table "photos", force: true do |t|
    t.string   "path"
    t.date     "date"
    t.text     "fact"
    t.string   "caption"
    t.integer  "local_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "professions", force: true do |t|
    t.string   "desc"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
