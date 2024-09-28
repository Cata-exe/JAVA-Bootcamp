public class TiendaEnLinea {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";

        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalones = 45.00;
        double precioZapatos = 60.00;

        /* una forma de sumar los totales
        double totalAlex = precioZapatos*2 + precioCamiseta + precioPantalones;
       */


        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";

        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = true;
        boolean pedidoConfirmadoCliente3 = true;

        // INTERACCIÓN DE LA APLICACIÓN
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
        System.out.println(mensajeBienvenida + cliente3);
        System.out.println(mensajeBienvenida + cliente2);

        // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
        if(pedidoConfirmadoCliente1 == true){
            System.out.println(cliente1 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + precioPantalones);
        }
        if(pedidoConfirmadoCliente3 == true){
            System.out.println(cliente3 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + (precioZapatos + precioLibro + precioPantalones + precioCamiseta));
        }
        if(pedidoConfirmadoCliente2 == true){
            System.out.println(cliente2 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + (precioZapatos*2 + precioCamiseta + precioPantalones));
        }
        System.out.println(cliente3 + mensajeConfirmacion);
        if(pedidoConfirmadoCliente3 == true){
            System.out.println(mensajeMostrarTotal + (precioZapatos + precioLibro));
        }
    }
}