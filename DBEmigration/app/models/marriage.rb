class Marriage < ActiveRecord::Base
  belongs_to :husband, class_name: 'Person', foreign_key: 'husband_id', inverse_of: :husbands
  belongs_to :wife, class_name: 'Person', foreign_key: 'wife_id', inverse_of: :wives

  # TODO: validar que apenas homens aparecem como husband e apenas mulheres como wife
end
