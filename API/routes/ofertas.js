var express = require('express');
var router = express.Router();
var controller = require('../controllers/ofertas');

router.post('/:id', controller.reservarOferta); //Comentario por id 
router.get('/', controller.getOfertas); //Obtenemos todos los comentarios

module.exports = router;