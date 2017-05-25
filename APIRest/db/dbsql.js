var mysql=require('mysql');

var connection=mysql.createPool(
	{ 
		host:'localhost',
		port:3311
 		user:'root',
 		password:'root',
 		database:'demo'
 	}
);

module.exports=connection;