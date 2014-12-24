json.array!(@biographies) do |biography|
  json.extract! biography, :id, :event, :date
  json.url biography_url(biography, format: :json)
end
