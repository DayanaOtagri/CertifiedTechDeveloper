function subirMontaña(Edad, Altura) {
    return (Edad >= 12) && (Altura >= 1.30);
}

console.log(subirMontaña(13, 1.40));


function usarFlash(hayLuz, seMueve) {
    return (hayLuz > 0) || (seMueve > 0);
}
console.log(usarFlash(0, 8));

function pasarNivel(evaluacion1, evaluacion2, evaluacion3) {
    return (evaluacion1 >= 7 && evaluacion2 >= 7) || (evaluacion3 >= 4)
}
console.log(pasarNivel(4,4,4));


function verTV(_realizoTarea, _practicaPiano, _hizoMemoria) {
    return (_realizoTarea == true) && (_practicaPiano == true && _hizoMemoria == true);
    }
console.log(verTV(false,false,false));