var express = require('express');
var router = express.Router();
var controller = require('../controllers/facturas');

router.get('/:id', controller.getDetalles); 

module.exports = router;