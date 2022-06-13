/* Como se la paso un parametro no se escribe entre () y 
tampoco se habren llaves porque va en una sola línea*/ 
let laMitad = numero => numero / 2; 
console.log(laMitad(8));


/* Como esta función tiene más de un parámetro 
si se escribe entren entre parentesis */
let dividir =(numeroA, numeroB) => numeroA / numeroB; 
console.log(dividir(20, 4));

/*En los anteriores no se hizo return porque solo era
un resultado posible y una sola opreción. Esta es más compleja
Así que tenemos llaves y hacemos return */

let tengoQueEstudiar = dia => {
    if(dia === 'Sábado' || dia == 'Domingo') {
        return 'No tengo que Estudiar';
    }else{
        return 'si, Dayana, tienes que Estudiar'
    }
}

console.log(tengoQueEstudiar('Lunes'));


// CALLBACKS 

function iniciales(nombre, apellido) {
    return nombre[0] + apellido[0];
}

function saludar(nombre, apellido, callback) {

    return '¡Hola ' + callback(nombre, apellido) + '!';
    
}; 

console.log(saludar('Juanito', 'Sanches', iniciales));