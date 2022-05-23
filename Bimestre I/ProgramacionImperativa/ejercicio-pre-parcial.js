// Te proveemos la siguiente plantilla que tiene tres partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados, el cual parte de un obj. literal creado con una prop departamentos que contiene nuestra base de datos.
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados.
/***********************************/
/* ↧ Desarrollo de las consignas ↧ */
/* estacionamiento de cursores = [                                    ]
/***********************************/
          

/* 
B. Agregar un método buscarPorId que permita buscar el departamento en función de su identificador.
Este método debe devolver un departamento en caso de encontrar el identificador.
Resultado esperado: un objeto, es decir, un único departamento que coincida con el id ingresado por parámetro.

{
      id: 1,
      propietarios: "Luis Perez",
      cantidadHabitacion: 2,
      disponible: true,
      aceptaMascotas: true,
      cantidadPersonas: 2,
      precioAlquiler: 2395.8,
    },
*/
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
    departamentosDisponibles: function(){
        let libres = [ ]
        for(let i=0;i<this.departamentos.length;i++){
            if(this.departamentos[i].disponible == true)  {
                libres.push(this.departamentos[i])
                  
            }
        }
        return libres
    },
    buscarPorId: function(identificador){
        for (let i = 0; i < this.departamentos.length ; i++){
          if (identificador === this.departamentos[i].id){
            return this.departamentos[i];
          }
        }
    },
    alquilarDepto: function(identificador) {
        for (let i = 0; i < this.departamentos.length ; i++) {
            if (identificador === this.departamentos[i].id){
                // return this.departamentos[i];
                if (this.departamentos[i].disponible === true) {
                    this.departamentos[i].disponible = false;
                    return "departamento con Id " + identificador + " esta alquilado";
                }
                else {
                    return "El departamento ya fue alquido por otra persona"
                }
              }
              else {
                  return "identificador no encontrado"
              }
        }
    },
    filtrarPetFriendly: function() {
        let siAceptan = [];
        for (let i = 0; i < this.departamentos.length ; i++) {
            if(this.departamentos[i].aceptaMascotas === true) {
                siAceptan.push(this.departamentos[i].id);
            }
        }
        return siAceptan;
    },
    rebajasPorNoAlquiler: function() {
        let descuento = [];
        for (let i = 0; i < this.departamentos.length ; i++) {
            if(this.departamentos[i].disponible === true) {
                this.departamentos[i].precioAlquiler*.90
                // this.departamentos[i].precioAlquiler -= (this.departamentos[i].precioAlquiler*10)/100
                descuento.push(this.departamentos[i].id)
            }
        }
        return descuento;
    },
    buscarPorPropietarios: function(nombrePropietario) {
        
    }
  };
  
  /***********************************/
  /*   ↧ Ejecución de consignas ↧    */
  /***********************************/
//   console.log("---------- ↧ Punto A ↧ ----------");
//   let resultadoDeptosDisponibles = inmobiliaria.departamentosDisponibles()
//   console.log(resultadoDeptosDisponibles)
  
//   console.log("---------------------------------");
  
//   console.log("---------- ↧ Punto B ↧ ----------");
//   // Ejecución aquí ↧
//   let resultadoID = inmobiliaria.buscarPorId(7);
//     console.log(resultadoID)
  
//   console.log("---------------------------------");
  
//   console.log("---------- ↧ Punto C ↧ ----------");
//   // Ejecución aquí ↧
  
//   console.log("---------------------------------");
  
//   console.log("---------- ↧ Punto D ↧ ----------");
//   // Ejecución aquí ↧
  
//   console.log("---------------------------------");
  
  
  
  
  // Consignas Mesa de Trabajo:
  console.log("---------- ↧ Punto A ↧ ----------");
  // Ejecución aquí ↧
//   let alquilado = inmobiliaria.alquilarDepto(20);
//   console.log(alquilado);

  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto B ↧ ----------");
  // Ejecución aquí ↧
//   let mascotas = inmobiliaria.filtrarPetFriendly()
//   console.log(mascotas);

  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto C ↧ ----------");
  // Ejecución aquí ↧
  let conDescuento = inmobiliaria.rebajasPorNoAlquiler();
  console.log(conDescuento);
  
  console.log("---------------------------------");
  
  console.log("---------- ↧ Punto D ↧ ----------");
  // Ejecución aquí ↧
  
  console.log("---------------------------------");