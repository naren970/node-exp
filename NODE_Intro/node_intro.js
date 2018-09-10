//Requreied the Http module
var http = require('http');


//Create Node Console Server and we can access the server using curl http://localhost:9000/
http.createServer(function(request, response){
    response.write("Hello, This is Narendra");
    response.writeHead(200);
}).listen(9000);