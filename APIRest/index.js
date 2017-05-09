var express = require("express");
var bodyParser = require("body-parser");
<<<<<<< 533092e3146b7ff5d267415e4a454a0063ee5322
var app = express();

=======
//var db = require('./db');
var app = express();
>>>>>>> Skeleton API REST
app.use(bodyParser.json());
module.exports = app;

//Declaracion de variables segun la ruta
var peticiones = require('./routes/router');

//Rutas de los metodos, segun clase
app.use('/api', peticiones);

<<<<<<< 533092e3146b7ff5d267415e4a454a0063ee5322
=======

>>>>>>> Skeleton API REST
//Ruta generica del Server
app.get('/',function(pet, res) { 
	res.send("API REST MTIS");
});

//Conexion
app.set('port', (process.env.PORT || 5000));

app.listen(app.get('port'), function() {
  console.log('Aplicacion Node.js ejecutandose en el puerto: '+ app.get('port'));
});

<<<<<<< 533092e3146b7ff5d267415e4a454a0063ee5322

=======
//Conectamos con la Base de Datos
//db.start();
>>>>>>> Skeleton API REST



