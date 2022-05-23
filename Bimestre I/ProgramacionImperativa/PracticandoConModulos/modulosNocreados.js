/* Estos son ejeplos de modulos Nativos y Externos. 
El externo no va a funcionar porque no se encuentra el archivo a requerir*/

let fs = require('fs');
console.log(fs);

let datos = fs.readFileSync(__dirname + '/prueba.txt', 'utf-8');

// let moment = require('moment');
//console.log(moment().format('MMM DD YY'));