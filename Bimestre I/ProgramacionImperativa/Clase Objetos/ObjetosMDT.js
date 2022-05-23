let arrayCuentas = [
    {
      nroCuenta: 5486273622,
      tipoDeCuenta: "Cuenta Corriente",
      saldoEnPesos: 27771,
      titularCuenta: "Abigael Natte",
    },
    {
      nroCuenta: 1183971869,
      tipoDeCuenta: "Caja de Ahorro",
      saldoEnPesos: 8675,
      titularCuenta: "Ramon Connell",
    },
    {
      nroCuenta: 9582019689,
      tipoDeCuenta: "Caja de Ahorro",
      saldoEnPesos: 27363,
      titularCuenta: "Jarret Lafuente",
    },
    {
      nroCuenta: 1761924656,
      tipoDeCuenta: "Cuenta Corriente",
      saldoEnPesos: 32415,
      titularCuenta: "Ansel Ardley",
    },
    {
      nroCuenta: 7401971607,
      tipoDeCuenta: "Cuenta Unica",
      saldoEnPesos: 18789,
      titularCuenta: "Jacki Shurmer",
    },
  ];

  let banco = {
    clientes: arrayCuentas,
    consultarCliente: function (cliente){
        for (let i = 0; i< this.clientes.length; i++){
            if (this.clientes[i].titularCuenta === cliente){
                return arrayCuentas[i]

            }
        }

    },
    deposito: function(titular, ingreso){
        for (let i = 0; i< this.clientes.length; i++){
            if (this.clientes[i].titularCuenta === titular){
                this.clientes[i].saldoEnPesos += ingreso
                return console.log('Deposito realizado, su nuevo deposito es: ' + this.clientes[i].saldoEnPesos);

            }
        }

    }

};

banco.deposito("Ramon Connell", 1000)