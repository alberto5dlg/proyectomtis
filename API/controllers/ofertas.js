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
 	res.send("Oferta Reservada ...");
}