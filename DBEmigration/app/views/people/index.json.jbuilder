json.array!(@people) do |person|
  json.extract! person, :id, :name, :nasc, :civil, :habil
  json.url person_url(person, format: :json)
end
