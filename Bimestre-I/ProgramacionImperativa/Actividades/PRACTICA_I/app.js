const { isAsyncFunction } = require("util/types");
const jsonHelper = require("./jsonHelper");

const carrera = {
  autos: jsonHelper.leerJson("autos"),
  autosPorTanda: 6,
  autosHabilitados: function () {
    let habilitados = this.autos.filter((auto) => auto.sancionado === false);
    return habilitados;
  },
  buscarPorPatente: function (patente) {
    return this.autos.find((auto) => auto.patente === patente);
  },
  filtrarPorCilindrada: function (cilindrada) {
    return this.autosHabilitados().filter(
      (auto) => auto.cilindrada <= cilindrada
    );
  },
  ordenarPorVelocidad: function () {
    return this.autos.sort((autoA, autoB) => autoA.velocidad - autoB.velocidad);
  },
  habilitarVehiculo: function (patente) {
    let auto = this.buscarPorPatente(patente);
    if (auto) {
      auto.sancionado = false;
      jsonHelper.escribirJson("autos", this.autos);
      return auto;
    }
  },
  generarTanda : function( cilandrada, peso ) {

    let cilindrada = this.filtrarPorCilindrada(cilandrada);
    
    let peso1 = cilindrada.filter( auto => auto.peso <= peso )
   
    if( peso1.length <= this.autosPortanda){
        return peso1
    }else{
        return "la cantidad de elementos del array es mayor"
    }

},
};



// console.table(carrera.autos);
// console.table(carrera.autosHabilitados());
// console.log(carrera.buscarPorPatente("asdasdasdasd"));
// console.table(carrera.filtrarPorCilindrada(100));
// console.table(carrera.ordenarPorVelocidad());
// console.log(carrera.buscarPorPatente("JHV223"));
// console.log(carrera.habilitarVehiculo("JHV223"));




