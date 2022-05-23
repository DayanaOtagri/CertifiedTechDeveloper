package com.company;

public class ServicioDescargaProxy implements IServicioDescarga{

    public ServicioDescargaProxy() {}

    @Override
    public void descargar(String tipo) {
        if (membresia(tipo)) {
            ServicioDescarga servicio = new ServicioDescarga();
            servicio.descargar(tipo);
        } else System.out.println("Paga la membresia, rata");
    }

    public Boolean membresia(String tipo){
        return tipo.equals("Premium");
    }
}
