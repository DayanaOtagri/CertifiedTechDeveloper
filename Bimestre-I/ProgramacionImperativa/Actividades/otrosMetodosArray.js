// Te proveemos la siguiente plantilla que tiene tres partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados, el cual parte de un obj. literal creado con una prop departamentos que contiene nuestra base de datos.
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados.
/***********************************/
/* ↧ Desarrollo de las consignas ↧ */
/***********************************/
const inmobiliaria = {
    departamentos: [
      {
        id: 1,
        propietarios: "Luis Perez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 2395.8,
      },
      {
        id: 2,
        propietarios: "Luis Perez y María Martinez",
        cantidadHabitacion: 1,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 1765,
      },
      {
        id: 3,
        propietarios: "Laura García",
        cantidadHabitacion: 2,
        disponible: false,
        aceptaMascotas: false,
        cantidadPersonas: 4,
        precioAlquiler: 3993,
      },
      {
        id: 4,
        propietarios: "Julieta Tols",
        cantidadHabitacion: 1,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 1996.5,
      },
      {
        id: 5,
        propietarios: "Julieta Tols y Pablo Groming",
        cantidadHabitacion: 1,
        disponible: false,
        aceptaMascotas: false,
        cantidadPersonas: 1,
        precioAlquiler: 11979,
      },
      {
        id: 6,
        propietarios: "Pablo Groming",
        cantidadHabitacion: 2,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 3,
        precioAlquiler: 4658.5,
      },
      {
        id: 7,
        propietarios: "Luis Perez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 3,
        precioAlquiler: 3327.5,
      },
      {
        id: 8,
        propietarios: "Julieta Tols",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986,
      },
      {
        id: 9,
        propietarios: "Julieta Tols y Laura García",
        cantidadHabitacion: 3,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986,
      },
      {
        id: 10,
        propietarios: "Julieta Tols y Laura García",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986,
      },
      {
        id: 11,
        propietarios: "Luis Perez",
        cantidadHabitacion: 3,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986,
      },
      {
        id: 12,
        propietarios: "Juan Pablo Martinez",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986,
      },
      {
        id: 13,
        propietarios: "Juan Pablo Martinez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 4059.55,
      },
      {
        id: 14,
        propietarios: "Juan Pablo Martinez",
        cantidadHabitacion: 1,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 3993,
      },
      {
        id: 15,
        propietarios: "Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 798.6,
      },
      {
        id: 16,
        propietarios: "Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 798.6,
      },
      {
        id: 17,
        propietarios: "Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 665.5,
      },
    ],
    // A
    departamentosDisponibles: function () {
    
  
          let disponibles = this.departamentos.filter(function(objetoDepto) {
        return objetoDepto.disponible === true;
      })
          return disponibles
  
          /* 
              let disponibles = this.departamentos.filter( objetoDepto) => objetoDepto.disponible === true */    
    },
      // B
    precioConImpuesto: function (porcentaje) {
  /*
      */
      /*let factor = porcentaje / 100 + 1;
      for (let i = 0; i < this.departamentos.length; i++) {
        this.departamentos[i].precioAlquiler = Number(
          (this.departamentos[i].precioAlquiler * factor).toFixed(2)
        );
      }
      return this.departamentos;  */
  
          this.departamentos.forEach( function(objetoDepto) {
              objetoDepto.precioAlquiler *= porcentaje / 100 + 1
          })
          return this.departamentos
    },
     alquilerPromedio: function () {
      let disponibles = this.departamentosDisponibles();
     /* let sumatoria = 0;
      for (let i = 0; i < disponibles.length; i++) {
        sumatoria += disponibles[i].precioAlquiler;
      }
      let promedio = sumatoria / disponibles.length;
      return `El promedio de alquiler de los departamentos disponibles para alquiler es de: $${promedio.toFixed(
        2
      )}`; */
  
          let promedio = disponibles.reduce(function(acumulador,objetoDepto) {
              return acumulador + objetoDepto.precioAlquiler / disponibles.length
          }, 0)
          return "El precio promedio del alquiler es de $ " + promedio.toFixed(2)
  
       }
  };
  
  /***********************************/
  /*   ↧ Ejecución de consignas ↧    */
  /***********************************/
  
  console.log("---------- ↧ Punto A ↧ ----------");
  // Ejecución aquí ↧
  console.log(inmobiliaria.departamentosDisponibles());
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto B ↧ ----------");
  // Ejecución aquí ↧
  console.log(inmobiliaria.precioConImpuesto(80));
  console.log("---------------------------------");
  console.log("---------- ↧ Punto C ↧ ----------");
  // Ejecución aquí ↧
  console.log(inmobiliaria.alquilerPromedio());
  console.log("---------------------------------");
  