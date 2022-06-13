const url = "https://ctd-todo-api.herokuapp.com/v1/users"

const data = {
  firstName: "Romi",
  lastName: "Montenegro Vilatta",
  email: "vilattaromina@gmail.com.ar",
  password: 123456
}

//payload
const options = {
  method: "POST",
  body: JSON.stringify(data),
  headers: {
    "Content-type": "application/json",
  }
}

fetch(url, options )
  .then((response) => response.json())
  .then((json) => {
      // Aqui obtenemos la respuesta de la API.
      console.log("Usuario:", json);
    })


//'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6I…c1Nn0.3ee1RAysH6uVX-aiOENiAk8uj62wttE4CpcSif9Ob7o'

 












