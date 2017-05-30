var express = require("express");
var bodyParser = require("body-parser");
var app = express();

app.use(bodyParser.json());
module.exports = app;

//Declaracion de variables segun la ruta
var ofertas = require('./routes/ofertas');
var facturas = require('./routes/facturas');

//Rutas de los metodos, segun clase
app.use('/api/ofertas', ofertas);
app.use('/api/facturas', facturas);

//Ruta generica del Server
app.get('/',function(pet, res) { 
	res.send("Api REST para MTIS: ");
});

//Conexion
app.set('port', (process.env.PORT || 3000));

app.listen(app.get('port'), function() {
  console.log('Aplicacion Node.js ejecutandose en el puerto: '+ app.get('port'));
});
