let heroes = require('./superheroes')

/* Como el archivo se llama "index.js" no es necesario indicarle
en que carpeta se encuentra, si este estuviera guardado con otro nombre
"pruebamodulo" tenidría que requerirse de otra forma, así:
let heroes = require('./superheres"que hace referencia a la variable que
almacena lo que queremos traer"/pruebamodulo"que es el nombre del archivo que 
almacena dicha variable"').  
Ejemplo limpio: let heroes = require('./superheroes/pruebamodulo)  */

console.log(heroes);