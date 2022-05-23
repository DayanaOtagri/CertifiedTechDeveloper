// 1. Crear una función que convierta pulgadas en centímetros.
// Recibe por parámetro pulgadas y retorna su equivalente en centímetros.
let pulgadasACentimetros = num => num*2.54;

console.log(pulgadasACentimetros(4));

// 2. Crear una función que recibe un string y lo convierte en una URL.
// ej: “pepito” es devuelto como “http://www.pepito.com”
let vinculo = string => "http://www."+string+".com";

console.log(vinculo("pepito"));

// 3. Crear una función que recibe un string y devuelve la misma frase pero con
// admiración.

let admiracion = texto => "¡"+texto+"!";

console.log(admiracion("Hola Mundo"));

// 4. Crear una función que calcule la edad de los perros, considerando que 1 año
// para nosotros son 7 de ellos.

let aniosPerro = num => num*7;

console.log(aniosPerro(4));

// 5. Crear una función que calcule el valor de tu hora de trabajo, introduciendo tu
// sueldo mensual como parámetro.
// PD: considera que tu mes de trabajo tiene 40 horas.

let horaTrabajo = sueldo => sueldo/40;

console.log(horaTrabajo(500));

//Array de nombres

const nombres = ['Martin','Homero','Cosme','Steven','Adam'];

let mostrarResultado = nombre => {
    if(nombre == " "){
        return 'El nombre no fue encontrado. Verifique los datos ingresados';
    }
    else{
        return 'El nombre '+nombre+' no fue encontrado';
    }

};

let buscarNombre = (nombre, callback) => {
    for(let i=0;i<nombres.length;i++){
        if(nombres[i].includes(nombre)){
            return 'El nombre fue encontrado ' + nombre;
        }
        else{
            return callback(nombre);
        }
    }
}

console.log(buscarNombre("Martin",mostrarResultado));
