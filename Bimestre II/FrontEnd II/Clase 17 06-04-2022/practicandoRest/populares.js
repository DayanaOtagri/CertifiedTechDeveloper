window.onload = function () {
    fetch("https://api.giphy.com/v1/gifs/trending?api_key=&limit=25&rating=g")
    .then(function (respuesta) {
        return respuesta.json();  //Respuesta decodificada 
    })
    .then(function (informacion){
        // nos da informacion
        console.log(informacion.data);

        //Para que recorrar el array de objeto 
        for (let i = 0; i < informacion.data[i]; i++){

        // para que por cada valor del objeto lo agrege a un p en html 
        //con ese valor, en este caso el titulo. 
        let gif = "<p>" + informacion.data[i].title + "</p>";
        // Lo mismo que arriba pero con la propiedad imagen 
        gif += "<img src= " + informacion.data[i].images.original.url + " >" 


        document.querySelector("ul").innerHTML += "<li>" + gif + "</li>"

        }
    })
}