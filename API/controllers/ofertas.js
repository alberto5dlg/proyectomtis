var mysql = require('mysql'),
connection = mysql.createConnection(
	{ 
		host: 'localhost', 
		user: 'root',  
		password: 'root',
		port:3311, 
		database: 'proyectomtis'
	}
);
 
exports.getOfertas = function(pet, res) {
	connection.query('SELECT * FROM viajes', function(error, rows){
 		if (error) 
 			throw error
 		else{ 
 			res.status(200);
 			res.send(rows);
		}
 	});
}

exports.reservarOferta = function(pet,res){
	var usuario = pet.body.contratado; 
	var idViaje = pet.params.id;
 	connection.query("UPDATE viajes SET contratado='"+usuario+"' WHERE id="+idViaje, function(error, rows){
 		if(error)
 			throw error
 		else{
 			res.status(200);
 			generarFactura(idViaje, usuario);
 			console.log("Viaje Reservado por: "+usuario);
 			res.send();
 		}
 	});
}

function generarFactura(idViaje, usuario) {
	connection.query("SELECT * FROM viajes WHERE id="+idViaje, function(error, row){
		if (error) 
			throw error
		else {
			var precio = row[0].precio;
			var detalles = "Oferta de Viaje: "+row[0].detalle;
			connection.query("INSERT INTO facturas (usuario, Precio, Pagada, detalles) VALUES ('"+usuario+"',"+precio+",'Pagada','"+detalles+"')", function (error, rows){
				if (error)
					throw error
				});
		}
	});
}

