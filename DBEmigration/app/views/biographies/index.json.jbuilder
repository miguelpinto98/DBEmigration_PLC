json.array!(@biographies) do |biography|
  json.extract! biography, :id, :event, :original, :date
  json.url biography_url(biography, format: :json)
end
