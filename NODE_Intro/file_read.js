
//Requireing the file module to read the local file system data
var fs = require('fs');

var callback = function(err, fileContnet){
    console.log("The File Content :", fileContnet);
}

 fs.readFile('node_intro.js', callback);
