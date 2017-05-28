var express = require('express');
var router = express.Router();
var controller = require('../controllers/ofertas');

router.post('/:id', controller.reservarOferta); 
router.get('/', controller.getOfertas); 


module.exports = router;