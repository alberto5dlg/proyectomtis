var mysql = require('mysql'),
connection = mysql.createConnection(
	{ 
		host: 'localhost', 
		user: 'root',  
		password: 'root',
		port:3311, 
		database: 'proyectomtis'
	}
);