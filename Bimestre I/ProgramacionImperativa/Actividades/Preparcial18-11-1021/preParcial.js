// Te proveemos la siguiente plantilla que tiene tres partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados, el cual parte de un obj. literal creado con una prop departamentos que contiene nuestra base de datos.
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados.
/***********************************/
/* ↧ Desarrollo de las consignas ↧ */
/* estacionamiento de cursores = [                                    ]
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
      departamentosDisponibles: function(){
          let libres = [ ]
          for(let i=0;i<this.departamentos.length;i++){
              if(this.departamentos[i].disponible == true)  {
                  libres.push(this.departamentos[i])
                  
              }
          }
          return libres
      },
      // B
      buscarPorId: function(identificador){
      for (let i = 0; i < this.departamentos.length ; i++){ // bucle
        if (identificador === this.departamentos[i].id){ // condicional
          return this.departamentos[i];
        }
      }
      }, 
      // C
    buscarPorPrecio : function (precio){
      let disponible = this.departamentosDisponibles();
      let filtrados =[ ];
      for(let i = 0;i<disponible.length;i++){
        if(disponible[i].precioAlquiler <= precio){
        filtrados.push(disponible[i]);
        
        }
      }
          return filtrados;
    },
      alquilerPromedio: function () {
          let disponibles=this.departamentosDisponibles()
          let suma = 0;
        for(let i=0; i< disponibles.length; i++){
              suma += disponibles[i].precioAlquiler 
          }
          return "El promedio de alquiler es $ " + suma / disponibles.length
      },
      alquilarDepto: function(id) {
          let disponibles=this.departamentosDisponibles()
          for(let i=0; i< disponibles.length; i++){
              if (disponibles[i].id == id) {
                  disponibles[i].disponible = false
              }
          }
          return "El depto con ID:" + id + " ha sido alquilado"
  
      }
  } 
  // fin obj inmobiliaria
  
  
  /* AA. Agregar un método que permita alquilar un departamento. 
  Este método recibe por parámetro el id del departamento y actualiza la propiedad del departamento en false.
  retorna un mensaje: “departamento con id: {{2}} está alquilado”
  Resultado esperado: que quede actualizada la propiedad de departamentos de la inmobiliaria, donde el departamento que alquilo no está disponible. */
  
  
  /***********************************/
  /*   ↧ Ejecución de consignas ↧    */
  /***********************************/
  console.log("---------- ↧ Punto A ↧ ----------");
  let resultadoDeptosDisponibles = inmobiliaria.departamentosDisponibles()
  console.log(resultadoDeptosDisponibles)
  
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto B ↧ ----------");
  let resultadoID = inmobiliaria.buscarPorId(7);
  console.log(resultadoID)
  
  
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto C ↧ ----------");
  // Ejecución aquí ↧
  let resultadoPrecio = inmobiliaria.buscarPorPrecio(3000);
  console.log(resultadoPrecio);
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto D ↧ ----------");
  // Ejecución aquí ↧
  let resultadoPromedioAlquiler = inmobiliaria.alquilerPromedio()
  console.log(resultadoPromedioAlquiler)
  console.log("---------------------------------");
  
  
  
  
  // Consignas Mesa de Trabajo:
  console.log("---------- ↧ Punto A ↧ ----------");
  let resultadoAlquilar = inmobiliaria.alquilarDepto(17)
  console.log(resultadoAlquilar)
  console.log(inmobiliaria.departamentos[16])
  // Ejecución aquí ↧
  
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto B ↧ ----------");
  // Ejecución aquí ↧
  
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto C ↧ ----------");
  // Ejecución aquí ↧
  
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto D ↧ ----------");
  // Ejecución aquí ↧
  
  console.log("---------------------------------");
  