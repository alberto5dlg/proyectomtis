var express = require('express');
var router = express.Router();
var controllerOferta = require('../controllers/oferta');
var controllerFactura = require('../controllers/factura')

router.get('/oferta', controllerOferta.getDetails);
router.get('/factura', controllerFactura.getDetails);  
router.post('/oferta', controllerOferta.reservaOferta); 


module.exports = router;