const alicia = [23, 69, 32];
 const bob = [23, 69, 32];
 
 function encontrarGanador(a, b) {
    let puntosAlicia = 0;
    let puntosBob = 0;
    let ganador = "";

    for(let i = 0; i < a.length && b.length; i++) {
        if(a[i] > b[i]) {
            puntosAlicia = puntosAlicia + 1;
        }
        else if(a[i] < b[i]) {
            puntosBob = puntosBob + 1;
        }
    }

    if(puntosAlicia > puntosBob) {
        ganador = "Alicia";
    }
    else if(puntosAlicia < puntosBob) {
        ganador = "Bob";
    }
    else {
        ganador = "Los dos ganaron"
    }

    return ganador;
 }

 console.log("El ganador es: " + encontrarGanador(alicia, bob));
