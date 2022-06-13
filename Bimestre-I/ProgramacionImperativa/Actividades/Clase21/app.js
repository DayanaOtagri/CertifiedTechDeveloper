let jsonHelper = require('./lecturaEscritura');
let arrayDepartamentos = jsonHelper.leerJson("departamentos");
//console.log(arrayDepartamentos);

let inmobiliaria = {
    departamentos: arrayDepartamentos,
    buscarPorId: numero => {
        this.arrayDepartamentos.find(onjeto.id == numero ? objeto : undefined)
    }
}

console.log(inmobiliaria);