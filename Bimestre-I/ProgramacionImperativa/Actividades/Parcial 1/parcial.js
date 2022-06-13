/*function esDivisible(num1, num2) {
    if (num1 % num2 === 0) {
        return `El numero ${nm1} es divisible por ${num2}`;
    }else {
        return `El numero ${num1} NO es divisible por ${num2}`;
    }
} 
console.log(esDivisible(15, 2));*/

/*let adivinaElNumero = function (num, nombre) {
    let numSecreto = 6;
    if (num > 10 || num < 1) {
        return "Por favor ingrese un númoro entre 1 y 10";
    } else if (numSecreto === num){
        return `¡¡Felicidades ${nombre}, acertaste!! (número ingresado: ${num}; número secreto ${numSecreto}).`;
    } else {
        return `Lo siento ${nombre}, el numero ingresado (${num} no coincide con el numero secreto, intentalo nuevamente`;
    }
}
console.log(adivinaElNumero(8, "Santiago"));*/


function saludarSegunHorario(nombre, hora) {
    if (hora < 0 || hora > 13){
        return "Por favor ingrese una hora valida";
    } else if (hora <= 17){
        return `Hola ${nombre}. Son las ${hora}: 00hs`;
    } else {
        return `Son las ${hora}:00hs.  Hasta mañana ${nombre}`;
    }
}
console.log(saludarSegunHorario("Karina", 24));


/*function mayorMenorIgual(num1, num2) {
    if (num1 < num2) {
        return `El número ${num1} es menor que ${num2}`;
    } else if (num1 > num2){
        return `El número ${num1} es mayor que ${num2}`;
    } else if (num1 = num2) {
        `El número ${num1} es igual que ${num2}`;
    }
}
console.log(mayorMenorIgual(15,3));
console.log(mayorMenorIgual(3,7));
console.log(mayorMenorIgual(15,300));*/


/*function generacion(año) {
    if (año <= 1964) {
        return "Baby boomer";
    } else if (año <= 1981 && año >= 1965){
        return "X";
    } else if (año <= 1997 && año >= 1982) {
        return "Millennial";
    } else if (año > 1997){
        return "Z"
    }
}
console.log(generacion(1964));
console.log(generacion(1972));
console.log(generacion(1997));
console.log(generacion(1999));*/



/*function mayorMenorQue100(n1, n2) {
    if (n1 + n2 < 100) {
        return `La suma de ${n1} y ${n2} es menor que 100`;
    } else if (n1 + n2 > 100){
        return `La suma de ${n1} y ${n2} es mayor que 100`;
    } else if (n1 + n2 == 100) {
        return `La suma de ${n1} y ${n2} es exactamente 100`
    }
}
console.log(mayorMenorQue100(57,43));
console.log(mayorMenorQue100(80,90));
console.log(mayorMenorQue100(40,60));*/

