public class Main {

    public static void main(String[] args) {
	// write your code here

        FacadeDescuento facade = new FacadeDescuento();

        Tarjeta tarj = new Tarjeta("67897","Stark Bank");
        Producto p1 = new Producto("Lata", "arvejas");

        System.out.println("Descuento " + facade.descuento(tarj,p1, 12));


    }
}
