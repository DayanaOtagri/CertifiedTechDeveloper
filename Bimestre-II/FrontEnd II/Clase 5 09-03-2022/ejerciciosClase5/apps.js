// permite que los ajustes de JS se den por las preferencias
// del usuario

//let confiCambios = confirm('¿Quieres cambiar el titulo?');

/* 

if (confiCambios) {
      
    let titulo = document.querySelector('h1');
    titulo.innerHTML += '  Soy un titulo desde JS';

    titulo.style.color = 'blue';
    titulo.style.fontSize = '50px';
} 
*/

let titulo = document.querySelector('h1');
titulo.innerHTML += ' Soy un titulo desde JS';
titulo.classList.toggle('otroColor');

/*let confirmaEliminarClase =confirm('¿Quieres eliminar la clase del  titulo');
if(confirmaEliminarClase){
    titulo.classList.remove('otroColor')
}*/
