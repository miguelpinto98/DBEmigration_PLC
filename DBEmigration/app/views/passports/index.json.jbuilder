json.array!(@passports) do |passport|
  json.extract! passport, :id, :number, :year, :municipio, :submitted
  json.url passport_url(passport, format: :json)
end
