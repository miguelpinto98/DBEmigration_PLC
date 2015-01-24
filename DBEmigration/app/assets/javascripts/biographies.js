function validateFiles(inputFile) {
  var extErrorMessage = "Somente ficheiros com o formato .xml podem ser carregados";
  var allowedExtension = "xml"

  var extName;
  var extError = false;

  $.each(inputFile.files, function() {
    extName = this.name.split('.').pop();
    if (extName != allowedExtension) {extError=true;};
  });

  if (extError) {
    window.alert(extErrorMessage);
    $(inputFile).val('');
  };
}

function getRegisto(idRegisto) {
  $.ajax({
      type: 'GET',
      url: '/biographies/' + idRegisto,
      dataType: "JSON",
      success: function(data){
        if (data.event)
          $('#evento').text(data.event);
        else
          $('#evento').text("");

        $('#date').text(data.date);
        $('#original').text(data.original);

        if (data.local)
          $('#local').text(data.local.desc);
        else
          $('#local').text("");

        for (p of data.people) {
          $('#pessoas').append("<li><a href=\"\">"+p.name+"</a></li>");
        }
      }
    });

  $('#myModal').modal('toggle');
}
