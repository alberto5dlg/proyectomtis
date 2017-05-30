var express = require('express');
var router = express.Router();
var controller = require('../controllers/facturas');


router.get('/:usuario', controller.getFacturasByUser); 
router.post('/crearFactura',controller.crearFactura);


module.exports = router;