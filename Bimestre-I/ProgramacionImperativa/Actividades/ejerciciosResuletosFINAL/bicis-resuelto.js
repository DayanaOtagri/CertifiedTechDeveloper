// Te proveemos la siguiente plantilla que tiene dos partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados

/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const jsonHelper = require("./jsonHelper");
// A
const carrera = {
  // B.
  bicicletas: jsonHelper.leerJson("bicicletas"),
  // C.
  bicicletasPorTanda: 4,
  // D.
  ciclistasHabilitados: function () {
    return this.bicicletas.filter((bici) => bici.dopaje === false);
  },
  // E
  buscarPorId: function (id) {
    return this.bicicletas.find((bici) => bici.id === id);
  },
  // F
  filtrarPorPeso: function (peso) {
    return this.ciclistasHabilitados().filter((bici) => bici.peso <= peso);
  },
  // G
  ordenarPorRodado: function () {
    return this.bicicletas.sort((biciA, biciB) => biciA.rodado - biciB.rodado);
  },
  ordernarPorNombre: function () {
    return this.bicicletas.sort((biciA, biciB) => {
      if (biciA.ciclista.toLowerCase() > biciB.ciclista.toLowerCase()) {
        return 1;
      }
      if (biciA.ciclista.toLowerCase() < biciB.ciclista.toLowerCase()) {
        return -1;
      }
      return 0;
    });
  },
  // H
  largoPromedio: function () {
    let sumatoria = this.bicicletas.reduce(
      (acum, bici) => acum + bici.largo,
      0
    );
    return `El largo promedio de las bicicletas es de: ${(
      sumatoria / this.bicicletas.length
    ).toFixed(2)}cm.`;
  },
  // I
  aumentarPeso: function (id, aumento) {
    let bicicleta = this.buscarPorId(id);
    if (bicicleta) {
      bicicleta.peso += aumento;
      jsonHelper.escribirJson("bicicletas", this.bicicletas);
      return bicicleta;
    }
  },
  // J
  generarTanda: function (rodado, peso) {
    let habilitados = this.ciclistasHabilitados();
    let filtrados = habilitados.filter(
      (bici) => bici.peso >= peso && bici.rodado <= rodado
    );
    return filtrados.slice(0, this.bicicletasPorTanda);
  },
  // K
  calcularPodio: function (tanda) {
    let tandaDeMayorAMenor = tanda.sort((a, b) => b.puntaje - a.puntaje);
    let primero = tandaDeMayorAMenor[0];
    let segundo = tandaDeMayorAMenor[1];
    let tercero = tandaDeMayorAMenor[2];

    console.log(
      `El primero es ${primero.ciclista} con un puntaje de ${primero.puntaje}`
    );
    console.log(
      `El segundo puesto es para ${segundo.ciclista} con un puntaje de ${segundo.puntaje}`
    );
    console.log(
      `El tercer puesto es para ${tercero.ciclista} con un puntaje de ${tercero.puntaje}`
    );
  },
};

/******************************/
/* Ejecución de las consignas */
/******************************/

console.log("---------- ↧ .D. ↧ ----------");
// Ejecución aquí:
console.table(carrera.ciclistasHabilitados());
console.log("---------- ↥ ---------- ↥ ----------");

console.log("---------- ↧ .E.  ↧ ----------");
// Ejecución aquí:
console.table(carrera.buscarPorId(7));
console.log("---------- ↥ ------------- ↥ ----------");

console.log("---------- ↧ .F. ↧ ----------");
// Ejecución aquí:
console.table(carrera.filtrarPorPeso(8));
console.log("---------- ↥ ------------- ↥ ----------");

console.log("---------- ↧ .G. ↧ ----------");
// Ejecución aquí:
// console.table(carrera.ordenarPorRodado());
console.table(carrera.ordernarPorNombre());
console.log("---------- ↥ ----------- ↥ ----------");

console.log("---------- ↧ .H.  ↧ ----------");
// Ejecución aquí:
console.log(carrera.largoPromedio());
console.log("---------- ↥ --------- ↥ ----------");

console.log("---------- ↧ .I.  ↧ ----------");
// Ejecución aquí:
console.table(carrera.buscarPorId(7));
console.table(carrera.aumentarPeso(7, 1.5));
console.log("---------- ↥ ------------- ↥ ----------");

console.log("---------- ↧ .J.  ↧ ----------");
// Ejecución aquí:
console.log("---------- ↥ ------------- ↥ ----------");

console.log("---------- ↧ .K.  ↧ ----------");
// Ejecución aquí:
console.log("---------- ↥ ------------- ↥ ----------");
