//1- Agregar a la tarjeta, el atributo "class" con el valor "card"
let tarjeta1 = document.querySelector("#tarjeta");

tarjeta1.classList.add('card');


//2- Agregar a la imagen, el atributo "src" con el valor "https://www.youtube.com/img/desktop/yt_1200.png"
let logo = document.querySelector("#logo");

logo.setAttribute("src", "https://www.youtube.com/img/desktop/yt_1200.png");
//3- Quitarle al titulo la clase que le está dando un formato feo
let tituloFeo =  document.querySelector("h1");

tituloFeo.classList.remove("titulo-feo");

//4- Chequear si el link a youtube posee o no el atributo href

let chequearHref = document.querySelector("#link_youtube");
let verificandoAtributo = chequearHref.hasAttribute("href");
console.log(verificandoAtributo);

//5- Obtener el href del link a wikipedia y mostrarlo por consola

let wikipedia = document.querySelector("#link_wikipedia");
let mostrarAtributo = wikipedia.getAttribute("href");
console.log(mostrarAtributo);
