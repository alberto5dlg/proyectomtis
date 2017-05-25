var db = require('../db/dbsql'); //Conexion a la BBDD 

exports.getDetails = function(pet, res) {
	res.send("Detalles de Ofertas ...")
}


exports.reservaOferta = function(pet, res) {
	res.send("Reservar Ofertas ... ")
}