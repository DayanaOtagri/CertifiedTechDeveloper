// Te proveemos la siguiente plantilla que tiene dos partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Dayana Otargí";
/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const jsonHelper = require("./jsonHelper");
// A Crear un objeto literal que represente la aplicación. 
/* El objeto será la representación de nuestro sistema de gestión de recetas,
 podemos llamarlo restaurante y contendrá todas las propiedades y métodos necesarios. */
// B
const restaurante = {
    recetas: jsonHelper.leerJson("recetas"),
// C
    buscarPorNombre: function(nombre) {
    return this.recetas.find((receta) => receta.nombre === nombre);
},
// D
/*   Agregar un método filtrarPorTiempo que permita filtrar las recetas que tengan un tiempo de espera menor 
 al tiempo enviado como argumento.
1. Este método recibirá por parámetro un valor de tipo Number que representa el tiempo de espera máximo.
2. Este método devolverá un array con todas las recetas que tengan un tiempo menor o igual al parámetro enviado
3. En caso de no encontrar ninguna receta que cumpla con esta condición, devolverá un array vacío.*/

    filtrarPorTiempo: function(tiempoEspera) {
        return this.recetas.filter((recetas) => recetas.tiempo < tiempoEspera);
    },
// E
/* Agregar un método ordenarPorDificultad que permita ordenar todas
 las recetas de mayor a menor según su dificultad.

Este método no recibirá ningún parámetro
Este método retornará  un array con todas las recetas ordenadas por su dificultad.*/
     ordenarPorDificultad: function() {
        return this.recetas.sort((recetaA,  recetaB) =>  recetaA.dificultad - recetaB.dificultad)
     },
// F
/* Agregar un método duracionPromedio que permita calcular la duración promedio en minutos de todas las recetas.
Este método no recibirá ningún parámetro.
    Este método retornará  un string con el siguiente formato:
	La duración promedio de todas las recetas es de {tiempo} minutos */ 

    duracionPromedio: function () {
        let sumaTiempo = this.recetas.reduce(
            (acum, tiempos) => acum + tiempos.tiempo,
      0
        );
            return `El largo promedio de las bicicletas es de: ${(
                sumaTiempo / this.recetas.length
              )
        } `
        
    },


// G
/* Agregar un método IncrementarPrecio que permita incrementar él precio de una receta en
función de su nombre y guardar los cambios en el archivo JSON. 
1. Este método recibirá por parámetro un valor de tipo  String que represente el nombre a buscar
2. Este método utilizará el método buscarPorNombre
 En caso de encontrar una receta con el nombre buscado:
3. Cambiará el valor de la propiedad precio, incrementando su valor un 3%.
4.Escribirá los cambios en el archivo JSON que contiene las recetas.

retornar él objeto modificado
En caso contrario devolverá undefined */ 
    incrementarPrecio:function (nombre){
        let receta = this.buscarPorNombre(nombre);
        if(receta) {
            this.recetas.precio = this.recetas.precio * 1.03;
            jsonHelper.escribirJson("recetas", this.restaurante);
              return receta;
        }

    }

}

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre }]); // NO MODIFICAR NADA DE ESTA LINEA
 // console.log(restaurante)
console.log("---------- ↧ .C. Buscar ↧ ----------");
// Ejecución aquí:  

// console.log(restaurante.buscarPorNombre("Empanada de pollo con masa quebrada"));


console.log("---------- ↥ ---------- ↥ ----------");

console.log("---------- ↧ .D. Filtrar ↧ ----------");
// Ejecución aquí:

// console.table(restaurante.filtrarPorTiempo(20))

console.log("---------- ↥ ------------- ↥ ----------");

console.log("---------- ↧ .E. Ordenar ↧ ----------");
// Ejecución aquí:


// console.table(restaurante.ordenarPorDificultad())


console.log("---------- ↥ ------------- ↥ ----------");

console.log("---------- ↧ .F. Total ↧ ----------");
// Ejecución aquí:


 // console.log(restaurante.duracionPromedio())



console.log("---------- ↥ ----------- ↥ ----------");

console.log("---------- ↧ .G. Modificar ↧ ----------");
// Ejecución aquí:

// console.table(restaurante.incrementarPrecio("Pastel de remolacha salado"))


console.log("---------- ↥ --------- ↥ ----------");

