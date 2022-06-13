/*let array = [2,8,16,30]
let acumulador = 0;

array.forEach(num=> {
    acumulador += num
    console.log(acumulador);
});*/

/* let anioNacimiento = prompt("¿En que año naciste?")
console.log(anioNacimiento);

let anioActual = 2022

//Calcular la edad
let edad = anioActual - anioNacimiento
//console.log(edad);

// arroja que es string console.log(typeof(anioNacimiento)); */

/* // Con parseInt
let respuestaUsuario = parseInt(prompt("¿Qué edad tienes"));
let anioActual = 2022; 
let edad = anioActual - respuestaUsuario;

console.log(typeof(edad)); */

/* let mensaje = confirm("¿Desea comenzar el juego");

if (mensaje) { 
    alert("Comenzo el juego");
} else {
    alert("No comenzo el juego");
} */ 


// un numero maximo y un número minimo,
// el más solo establece el rango
// console.log(Math.floor(Math.random()*3+1));



let opcionUsuario = parseInt(
    prompt("Elije entre las opciones: Piedra(1), Tijera(2), papel(3)")
  );
  let opcionCompu = Math.floor(Math.random() * 3 + 1);
  console.log("numero ingresado por el usuario " + opcionUsuario);
  console.log("numero ingresado por la computadora " + opcionCompu);
  if (opcionUsuario == 3 && opcionCompu == 1) {
    console.log("ganaste");
  } else if (opcionUsuario < opcionCompu) {
    console.log("ganaste");
  } else if (opcionUsuario > opcionCompu) {
    console.log("perdiste");
  } else if (isNaN(opcionUsuario)) {
    console.log("Datos incorrectos");
  } else {
    console.log("empate");
  };
  