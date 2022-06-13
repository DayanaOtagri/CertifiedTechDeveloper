// SEGURIDAD: Si no se encuentra en localStorage info del usuario
// no lo deja acceder a la página, redirigiendo al login inmediatamente.

// Trear el valor del token y si no hay trae un NULL
const token = localStorage.getItem('jwt');
if(!token){
  location.replace('./index.html')
}

/* ------ comienzan las funcionalidades una vez que carga el documento ------ */
window.addEventListener('load', function () {
  /* ---------------- variables globales y llamado a funciones ---------------- */
  const urlBase = 'https://ctd-todo-api.herokuapp.com/v1'
  const btnCerrarSesion = document.querySelector('#closeApp');
  const nombreUsuario = this.document.querySelector('.user-info p');
  
 

  /* -------------------------------------------------------------------------- */
  /*                          FUNCIÓN 1 - Cerrar sesión                         */
  /* -------------------------------------------------------------------------- */

  btnCerrarSesion.addEventListener('click', function () {
  

    let confirma = confirm("¿Desea cerrar sesion?");

    if(confirma){
    localStorage.clear();
    /* Con href guarda en el historial el movimiento entre pantallas
    replace no guarda en el historial*/
    location.replace('./index.html'); 
    } 




  });

  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 2 - Obtener nombre de usuario [GET]                */
  /* -------------------------------------------------------------------------- */

  function obtenerNombreUsuario() {
   const configuraciones = {
     method: 'GET',
     headers: {
       authorization: JSON.parse(token)
     }
   }

    fetch(`${urlBase}/users/getMe`, configuraciones)
    .then (res => res.JSON())
    .then (data =>{
      console.log(data);
      nombreUsuario.innerText = data.firstName;
      nombreUsuario.style.textTransform = 'capitalize'
    })

  };
obtenerNombreUsuario()

  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 3 - Obtener listado de tareas [GET]                */
  /* -------------------------------------------------------------------------- */

  function consultarTareas() {
    
    



  };


  /* -------------------------------------------------------------------------- */
  /*                    FUNCIÓN 4 - Crear nueva tarea [POST]                    */
  /* -------------------------------------------------------------------------- */

  formCrearTarea.addEventListener('submit', function (event) {
    




  });


  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 5 - Renderizar tareas en pantalla                 */
  /* -------------------------------------------------------------------------- */
  function renderizarTareas(listado) {







  };

  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 6 - Cambiar estado de tarea [PUT]                 */
  /* -------------------------------------------------------------------------- */
  function botonesCambioEstado() {
    
    



  }


  /* -------------------------------------------------------------------------- */
  /*                     FUNCIÓN 7 - Eliminar tarea [DELETE]                    */
  /* -------------------------------------------------------------------------- */
  function botonBorrarTarea() {
   
    

    

  };

});