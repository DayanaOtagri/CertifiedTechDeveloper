const archivos = require("./lecturaEscritura");
let arrayProfesionales = archivos.leerJson("profesionales");

//A
//let primerosCincoProfesionales = arrayProfesionales.slice(0,5);
//console.log(primerosCincoProfesionales);
//B
/*let eliminado = arrayProfesionales.splice(14,1, {
    identificador: 250,
    estaHabilitado: true,
    honorarioConsulta: 8000,
    edad: 52,
    nombre: 'Linus Torvalds',
    especialidad: 'Junior Developer',
    cantidadConsultas: 48,
    puntuacion: 50
    })
console.log(eliminado);
console.log(arrayProfesionales);*/
//C
/*arrayProfesionales.sort(function compare(a,b){
    return a.honorarioConsulta - b.honorarioConsulta
})

console.log(arrayProfesional);*/

   /*   arrayProfesionales.sort((a,b) => {
    if(a.honorarioConsulta == b.honorarioConsulta ) {
        return 0;
    }
    if(a.honorarioConsulta < b.honorarioConsulta) {
        return -1;
    }
    return 1;
});
console.log(arrayProfesionales); */

//D
let Buscado = arrayProfesionales.find( objeto => objeto.identificador === 15)
console.log(Buscado);
//E

//F

//G 

//H 

