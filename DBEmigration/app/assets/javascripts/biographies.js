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
  $( "li" ).remove( "#pessoasli" );
  $('#local').text("");

  $.ajax({
      type: 'GET',
      url: '/biographies/' + idRegisto,
      dataType: "JSON",
      success: function(data) {
        if (data.event)
          $('#evento').text(data.event);
        else
          $('#evento').text("");

        $('#date').text(data.date);
        $('#original').text(data.original);

        if (data.local)
          $('#local').append("<a href=\"locals/"+data.local.id+"\">"+data.local.desc+"</a>");
        else
          $('#local').text("");

        for (p of data.people) {
          $('#pessoas').append("<li id=\"pessoasli\"><a href=\"people/"+p.id+"\">"+p.name+"</a></li>");
        }

        $('#deleteid').attr('href',url);
      }
    });
  $('#myModal').modal('toggle');
}
