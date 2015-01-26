/**
 * Unicorn Admin Template
 * Version 2.2.0
 * Diablo9983 -> diablo9983@gmail.com
**/

$(document).ready(function(){

	$('.data-table').dataTable({
		"bJQueryUI": true,
		"sPaginationType": "full_numbers",
		"sDom": '<""l>t<"F"fp>'
	});
	$('select').select2();
});
