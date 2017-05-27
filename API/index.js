var express = require("express");
var bodyParser = require("body-parser");
<<<<<<< f15ed383aa9d3f00d813a25e3d4d8b60e51294bb
<<<<<<< 533092e3146b7ff5d267415e4a454a0063ee5322
var app = express();
<<<<<<< 61c3c6369c145b1e0513d5489f33cb29dc7cf32f:APIRest/index.js

=======
//var db = require('./db');
var app = express();
>>>>>>> Skeleton API REST
=======
var app = express();

>>>>>>> api rest en proceso
=======
>>>>>>> Nueva api funcionando perfectamente:API/index.js
app.use(bodyParser.json());
module.exports = app;

//Declaracion de variables segun la ruta
var ofertas = require('./routes/ofertas');

//Rutas de los metodos, segun clase
app.use('/api/ofertas', ofertas);

<<<<<<< f15ed383aa9d3f00d813a25e3d4d8b60e51294bb
<<<<<<< 533092e3146b7ff5d267415e4a454a0063ee5322
=======

>>>>>>> Skeleton API REST
=======
>>>>>>> api rest en proceso
//Ruta generica del Server
app.get('/',function(pet, res) { 
	res.send("Api REST para ADI: ");
});

//Conexion
app.set('port', (process.env.PORT || 3000));

app.listen(app.get('port'), function() {
  console.log('Aplicacion Node.js ejecutandose en el puerto: '+ app.get('port'));
});
<<<<<<< 61c3c6369c145b1e0513d5489f33cb29dc7cf32f:APIRest/index.js

<<<<<<< f15ed383aa9d3f00d813a25e3d4d8b60e51294bb
<<<<<<< 533092e3146b7ff5d267415e4a454a0063ee5322

=======
//Conectamos con la Base de Datos
//db.start();
>>>>>>> Skeleton API REST
=======

>>>>>>> api rest en proceso



=======
>>>>>>> Nueva api funcionando perfectamente:API/index.js
