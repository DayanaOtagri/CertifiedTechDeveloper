function totalAPagar (vehiculo, litrosConsumidos) {
    let precioXLitro
    if (vehiculo == "coche") {
      precioXLitro = 86
    } else if (vehiculo == "moto") {
      precioXLitro = 70
    } else if (vehiculo == "autobus") {
      precioXLitro = 55
    }
    let totalSinComision = (litrosConsumidos * precioXLitro)
    let total = 0;
    if (litrosConsumidos > 0 && litrosConsumidos < 25) {
      total = totalSinComision + 50;
    } else if (litrosConsumidos > 25) {
      total = totalSinComision + 25;
    }
    console.log("el total a pagar es de: " + total + "$")
  }
  
  totalAPagar("autobus", 12)