var fs = require('fs');
var http = require('http');

//Create a server on 9000 port and dispaly the content of the file by reading.
http.createServer(function(err, response){

    response.writeHead(200);
    var fileReadCallback = fs.readFile('index.html',function(err, contents){
        response.write(contents);
    });
    fileReadCallback;
    response.end();
}).listen(9000);