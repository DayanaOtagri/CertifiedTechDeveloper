/* EJERCITAR OBJETOS LITERALES */

// Crear un objeto vacio
let cantante = {}

// Asignarle propiedad "nombre" con valor "nombre de un cantante favorito" 
cantante.nombre = "Juanes"

// Leer la propiedad nombre
// console.log("El cantante es " + cantante.nombre)

// Borrar la propiedad nombre
delete cantante.nombre 

// Crear un array con al menos  2 o más objetos, con propiedades "id", nombre", "dni", "status"
// Ahora en cada objeto crear un método llamado "conocerEstado" ("activo","inactivo")
// juntos vamos a construir una lógica que chequee depende del status, retorne un mensaje distinto.
 let cantantes=[
	 	{ 
			id: 1, 
			nombre: 'juanes', 
			dni: 95839,
			status: true,
      conocerEstado: function(){ 
				return this.status ? `${this.nombre} está activo ` : `${this.nombre} está inactivo` 
      }
    },
    {
			id: 2,
    	nombre: "Adele",
    	dni: 32456,
    	status: false,
			conocerEstado: function(){ 
       /* if (this.status) {
          return("Esta activo")					
				}else{
          return("Esta inactivo")} 
				*/
				return this.status ? `${this.nombre} está activa ` : `${this.nombre} está inactiva` 
      }
    }
 ]
console.log(cantantes[1].conocerEstado())


/* Juntando conocimientos de las clases pasadas */

// Crear un bucle para iterar el array y devuelva el nombre 


// Crear una función en donde se integrará el bucle, pero ahora tomará el array como parámetro
function conocerNombre(array) {
	let nombres = []
	for(let i = 0; i < array.length; i++){
		// console.log(array[i].nombre)
		nombres.push(array[i].nombre) // agrega al FINAL del array un valor que determine
	}
	return nombres
}
// conocerNombre(cantantes)
// console.log(conocerNombre(cantantes)) // si uso return, el console log va a contener la invocación de la función para conocer que retorna
let nombres = conocerNombre(cantantes)
console.log(nombres)

// crear una función que permitirá agregar un nuevo objeto según lo que se pase por parámetros y se debe enviar al array.

// Borrar un registro, debemos buscar el objeto según el ID, y eliminarlo del array

// Modificar un registro, debemos buscar el objeto según el ID y modificarlo



