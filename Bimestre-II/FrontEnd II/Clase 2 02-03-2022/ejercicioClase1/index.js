/* 
// Recorre el Array de numeros y los va sumando
let numeros = [1, 2, 4, 8];
let total = numeros.reduce((a, b) => a + b, 0);

console.log(total); */ 

let numeros = [1, 2, 4, 8];

function suma(array) {
    let contador = 1;
    for(let i = 1; i < array.length; i++) {
        contador = contador + array[i];
        console.log(contador);
    }
}

console.log(suma(numeros));




