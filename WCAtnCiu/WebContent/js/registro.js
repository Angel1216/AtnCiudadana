
/// http://localhost:8080/WCAtnCiu/jsp/registro.jsp

function addUsuario() {
	
//	var txtNombre = $('#txtNombre').val();
//	var txtApellPaterno = $('#txtApellPaterno').val();
//	var txtApellMaterno = $('#txtApellMaterno').val();
//	var txtEmail = $('#txtEmail').val();
//	var rdSexo = $('input:radio[name=rdSexo]:checked').val();
	
	
	//var contact = '{"nombre":"'+txtNombre+'","apPaterno":"'+txtApellPaterno+'","apMaterno":"'+txtApellMaterno+'","email":"'+txtEmail+'","sexo":"'+rdSexo+'"}';
	var contact = '{'+
		'"rolId":1,'+
		'"nombre":"Zaida",'+
		'"apPaterno":"Alarcon",'+
		'"apMaterno":"Bernal",'+
		'"telefono":5545491420,'+
		'"email":"angelocc@gmail.com",'+
		'"estatusSesion":1,'+
		'"fechaUlSe":"1985-12-07",'+
		'"contrasenia":"123pwd",'+
		'"fechaAlta":"1986-12-07",'+
		'"fechaModif":"1987-12-07",'+
		'"usuarioAlta":15,'+
		'"usuarioModif":14,'+
		'"estatus":25'+
		'}';
	
    jQuery.ajax({
        type: "POST",
        url: "http://192.168.15.104:8080/WSAtnCiu/addUsuario",
        data: contact.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	// rest
        },
    
        error: function (jqXHR, status) {            
        	// rest
        }
    });
}

function deleteContact() {
	
	var txtId = $('#txtId').val();
	
    jQuery.ajax({
        type: "DELETE",
        url: "http://localhost:8080/WSAtnCiu/deleteContact/"+txtId,
        success: function (data, status, jqXHR) {
        	alert("Eliminación realizada con éxito");
        },
    
        error: function (jqXHR, status) {            
        	alert("Error");
        }

    });
}


function updateContact() {
	
	var txtId = $('#txtId2').val();
	var txtNombre = $('#txtNombre2').val();
	var txtApellPaterno = $('#txtApellPaterno2').val();
	var txtApellMaterno = $('#txtApellMaterno2').val();
	var txtEmail = $('#txtEmail2').val();
	var rdSexo = $('input:radio[name=rdSexo2]:checked').val();
	
	
	var contact = '{"id":"'+txtId+'","nombre":"'+txtNombre+'","apPaterno":"'+txtApellPaterno+'","apMaterno":"'+txtApellMaterno+'","email":"'+txtEmail+'","sexo":"'+rdSexo+'"}';
	
    jQuery.ajax({
        type: "PUT",
        url: "http://localhost:8080/WSAtnCiu/updateContact",
        data: contact.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	// rest
        },
    
        error: function (jqXHR, status) {            
        	// rest
        }

    });
}

function convertStringtoJSON(){
	
	var jsonObj = '[{"servicioId": 25,"descripcion": "Poda de Arbol"},{"servicioId": 26,"descripcion": "Limpieza de calle o avenida"},{"servicioId": 27,"descripcion": "Mantenimiento de parques"}]';
	var obj = $.parseJSON(jsonObj);
	
	for (var i=0; i<obj.length; i++) {
		alert(obj[i].servicioId);
		alert(obj[i].descripcion);
	}
}

function codificarIMGtoBase64(){
	
	// Foto 1
	var imgElem = document.getElementById('img');
	var imgElemWidth = $('#img').width();
    var imgElemHeight = $('#img').height();
	var imgData = JSON.stringify(getBase64Image(imgElem));
	
	alert(imgData);
	//$('<p>').text(imgData).appendTo('#base64Str');
	
	
//	var img = '{'+
//		'"archivoStr":'+imgData+
//		'}';
	
	
	var contact = '{'+
		'"arcNombre":"Imagen 1",'+
//		'"arcArchivo":"Base64",'+
		'"arcTipoDocto":"JPG",'+
		'"arcIdRelUsuCatServ":	{'+
									'"rpcIdusucatser":190'+
								'},'+
		'"arcFechaAlta":"2016-10-18",'+
		'"arcUsuAlta":2,'+
		'"arcEstatus":1,'+
		'"archivoStr":'+imgData+
		'}';
	
    jQuery.ajax({
        type: "POST",
        url: "http://localhost:8080/WSAtnCiu/getRelPerSerArchivos/"+imgElemWidth+"/"+imgElemHeight,
        data: contact.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	// rest
        },
    
        error: function (jqXHR, status) {            
        	// rest
        }
    });
    
    
 // Foto 2
	var imgElem2 = document.getElementById('imgFoto');
	var imgElemWidth2 = $('#imgFoto').width();
    var imgElemHeight2 = $('#imgFoto').height();
	var imgData2 = JSON.stringify(getBase64Image(imgElem2));
	
	alert(imgData2);
	//$('<p>').text(imgData).appendTo('#base64Str');
	
	
//	var img = '{'+
//		'"archivoStr":'+imgData+
//		'}';
	
	
	var contact2 = '{'+
		'"arcNombre":"Imagen 1",'+
//		'"arcArchivo":"Base64",'+
		'"arcTipoDocto":"JPG",'+
		'"arcIdRelUsuCatServ":	{'+
									'"rpcIdusucatser":190'+
								'},'+
		'"arcFechaAlta":"2016-10-18",'+
		'"arcUsuAlta":2,'+
		'"arcEstatus":1,'+
		'"archivoStr":'+imgData2+
		'}';
	
    jQuery.ajax({
        type: "POST",
        url: "http://localhost:8080/WSAtnCiu/getRelPerSerArchivos/"+imgElemWidth2+"/"+imgElemHeight2,
        data: contact2.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	// rest
        },
    
        error: function (jqXHR, status) {            
        	// rest
        }
    });
}

function getBase64Image(imgElem) {
	// imgElem must be on the same server otherwise a cross-origin error will be thrown "SECURITY_ERR: DOM Exception 18"
	    var canvas = document.createElement("canvas");
	    canvas.width = imgElem.clientWidth;
	    canvas.height = imgElem.clientHeight;
	    var ctx = canvas.getContext("2d");
	    ctx.drawImage(imgElem, 0, 0);
	    var dataURL = canvas.toDataURL("image/png");
	    return dataURL.replace(/^data:image\/(png|jpg);base64,/, "");
	}


function embeberIMGBase64(){
var response = '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';
    
    $('#embeberBase64').html('<img src=data:image/jpg;base64,' + response + ' />');
}


/*
$('#btnEmbeberIMGBase64').click(function (event) {
    event.preventDefault();
    
    var response = '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';
    
    $('#base64Str').html('<img alt="Embedded Image" src="data:image/jpg;base64,' + response + ' />');
});
*/
function ejemploJQuery(){
	$('<p>').text('Ejemplo del mensaje en JQuery').appendTo('#error-list').asError();
}



function codificarIMGtoBase64Charly(){
	var imgOriginal = JSON.stringify('iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAAIElEQVRoge3BAQEAAACCIP+vbkhAAQAAAAAAAAAAwKMBJ0IAAWSOMT4AAAAASUVORK5CYII=');
	
	var imgElem = document.getElementById('imgChrly');
	var imgElemWidth = imgElem.width();
    var imgElemHeight = imgElem.height();
	var imgData = JSON.stringify(getBase64Image(imgElem));
	
	var alerId = 6;


		var contact = '{'+
			'"arcNombre":"Imagen 1",'+
			'"arcTipoDocto":"JPG",'+
			'"arcIdRelUsuCatServ":	{'+
										'"rpcIdusucatser":'+alerId+
									'},'+
			'"arcFechaAlta":"2016-10-18",'+
			'"arcUsuAlta":2,'+
			'"arcEstatus":1,'+
			'"archivoStr":'+imgData+
			'}';
		
		jQuery.ajax({
			type: "POST",
			url: "http://localhost:8080/WSAtnCiu/getRelPerSerArchivos/"+imgElemWidth+"/"+imgElemHeight,
			data: contact.toString(),
			contentType: "application/json; charset=utf-8",
			dataType: "json",
			success: function (data, status, jqXHR) {
				//success
			},
		
			error: function (jqXHR, status) {            
				//error
			}
		});
	}

function Ejemploalert(){
	alert("Éxito");
}

function clonariMG(){
	$('#imgToclone').append($('#img').clone());
}

function obtenerTamano(){
	
	alert('tamano IMG WIDTH and HIGHT');
	
	alert('width: ' + $('#imgTamano').width() + ' px'  +  ' -- ' + 'height: ' + $('#imgTamano').height() + ' px');
	
}