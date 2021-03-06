/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
datosPersona.nombre = prompt("Escribe tu nombre");
datosPersona.edad = prompt("Escribe tu año de nacimiento");
datosPersona.ciudad = prompt("Escribe la ciudad donde vives");
let interesJs = confirm("Si te interesa Js presiona 'aceptar'");

if(interesJs) {
  datosPersona.interesPorJs = "Si";
}else {
  datosPersona.interesPorJs = "No";
}

}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */

  function calcularEdad(){
    datosPersona.edad = 2022 - datosPersona.edad;
  }

  document.querySelector("#nombre").innerText = datosPersona.nombre;
  calcularEdad();
  document.querySelector("#edad").innerText = datosPersona.edad;
  document.querySelector("#ciudad").innerText = datosPersona.ciudad;
  document.querySelector("#javascript").innerText = datosPersona.interesPorJs; 
  
}

function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  let click = false;  
  const contenedor = document.querySelector("#fila");
  if(!click){
    listado.forEach((lis) => {
    let cardClases = `
    <div class="caja" >
        <img src=${lis.imgUrl} alt="Imagen del lenguaje"/>
        <p class="lenguajes">
          Lenguajes: ${lis.lenguajes}
        </p>
        <p class"bimestre">
          Bimestre: ${lis.bimestre}
        </p>
    </div>`;
    contenedor.innerHTML += cardClases;
    })
  }
 click = true;
}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
 
  let boton = document.querySelector('#sitio');
  boton.classList.toggle('dark');

}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */

let parrafoOculto = document.querySelector(".oculto");
window.addEventListener("keypress", (e) => {
  if (e.key == "f") {
    parrafoOculto.classList.remove("oculto");
  }
})