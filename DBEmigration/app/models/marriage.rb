class Marriage < ActiveRecord::Base
  belongs_to :husband, class_name: 'Person', foreign_key: 'husband_id', inverse_of: :husbands
  belongs_to :wife, class_name: 'Person', foreign_key: 'wife_id', inverse_of: :wives

  # children_entries de um marriage são os filhos (com classe Child)
  has_many :children_entries, class_name: 'Child'
  # children de um marriage são os filhos (com classe Person)
  has_many :children, through: :children_entries, source: :people

  # TODO: validar que apenas homens aparecem como husband e apenas mulheres como wife
end
