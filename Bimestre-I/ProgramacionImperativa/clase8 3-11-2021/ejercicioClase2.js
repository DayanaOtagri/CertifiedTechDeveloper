function crearSandwich (base, pan, queso, tomate, lechuga, cebolla, mayonesa, mostaza) {
    let total = 0
    if (base === "pollo") {
      total = 150;
    } else if (base === "carne") {
      total = 200
    } else if (base === "veggie") {
      total = 100
    }
    console.log("tu base cuesta: " + total + "$")
    if (pan === "blanco"){
      total = total + 50
    } else if (pan === "negro") {
      total = total + 60
    } else if (pan === "s/gluten") {
      total = total + 75
    }
    console.log("Su base y su pan cuestan: " + total + "$" )
    if (queso) {
      total = total + 20
    } 
    if (tomate) {
      total = total + 15
    }
    if (lechuga) {
      total = total + 10
    }
    if (cebolla) {
      total = total + 15
    }
    if (mayonesa) {
      total = total + 5
    }
    if (mostaza) {
      total = total + 5
    }
    console.log("Su sanwich cuesta: " + total + "$")
  }
  
  crearSandwich("carne", "negro", true, true, true, false, true, false)
  