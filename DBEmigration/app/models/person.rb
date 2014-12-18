class Person < ActiveRecord::Base
  has_and_belongs_to_many :photos, :through => :people_photos
  has_and_belongs_to_many :biographies, :through => :biographies_people

  has_and_belongs_to_many :husbands, :through => :marriages\
                                   , :class_name => :person\
                                   , :join_table => :marriages\
                                   , :foreign_key => :husband_id\
                                   , :association_foreign_key => :wife_id

  has_and_belongs_to_many :wives, through: :marriages\
                                , class_name: :person\
                                , join_table: :marriages\
                                , foreign_key: :wife_id\
                                , association_foreign_key: :husband_id

  has_many :passports
  
  belongs_to :profession

  has_one :localNasc, :foreign_key => :local_nasc
  has_one :localWork, :foreign_key => :local_work

  # https://github.com/lwe/simple_enum
  # Person.marrieds dá todos os casados
  as_enum :gender, :female => 1, :male => 0
  as_enum :civil, single: 0, married: 1, divorced: 3, widowed: 4
end
