json.array!(@locals) do |local|
  json.extract! local, :id, :description
  json.url local_url(local, format: :json)
end
