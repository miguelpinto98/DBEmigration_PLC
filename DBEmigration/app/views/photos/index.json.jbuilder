json.array!(@photos) do |photo|
  json.extract! photo, :id, :path, :date, :fact, :legend
  json.url photo_url(photo, format: :json)
end
