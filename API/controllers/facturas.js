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
 

exports.getFacturasByUser = function(pet, res) {
 	var usuario = pet.params.usuario; 
	connection.query("SELECT * FROM facturas WHERE usuario='"+usuario+"';", function(error, rows){
 		if (error) 
 			throw error
 		else{ 
 			res.status(200);
 			res.send(rows);
		}
 	});
}

exports.crearFactura = function(pet, res) {
	var usuario = pet.body.usuario; 
	var precio = pet.body.precio;
	var estado = pet.body.pagada;
	var detalles = pet.body.detalles;
 	connection.query("INSERT INTO facturas (usuario,Precio,Pagada,Detalles) VALUES ('"+usuario+"',"+precio+",'"+estado+"','"+detalles+"')", function(error, rows){
 		if(error)
 			throw error
 		else{
 			res.status(200);
 			res.send();
 		}
 	});
}