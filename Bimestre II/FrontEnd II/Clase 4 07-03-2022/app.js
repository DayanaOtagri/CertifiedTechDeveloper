let opcionUsuario;
let opcionPc;
const opciones = ["piedra", "papel", "tijera"];
let ganador;
function pedirOpcion() {
  const numero = prompt("Elija piedra(1), papel(2) o tijera(3)");
  opcionUsuario = opciones[numero - 1];
}
function elegirOpcion() {
  const random = parseInt(Math.random() * 3);
  opcionPc = opciones[random];
}
function calcularGanador() {
  switch (opcionUsuario) {
    case opcionPc:
      ganador = "ninguno :/";
      break;
    case "piedra":
      if (opcionPc == "tijera") {
        ganador = "Usuario :)";
      } else {
        ganador = "PC :(";
      }
      break;
    case "papel":
      if (opcionPc == "piedra") {
        ganador = "Usuario :)";
      } else {
        ganador = "PC :(";
      }
      break;
    case "tijera":
      if (opcionPc == "papel") {
        ganador = "Usuario :)";
      } else {
        ganador = "PC :(";
      }
      break;
  }
}
function mostrarGanador() {
  alert(
    "Usted eligió " +
      opcionUsuario +
      " y la PC " +
      opcionPc +
      ". El ganador es " +
      ganador
  );
}
pedirOpcion();
elegirOpcion();
calcularGanador();
mostrarGanador();
