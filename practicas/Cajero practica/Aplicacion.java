import clases.Cajero;

public class Aplicacion {
    public static void main(String [] args){
        double money = 7000;
        String mensaje = Cajero.retirarDinero(money);
        System.out.println(mensaje);

        double facturaTotal = 14000;
        double usuarioIngreso = 10000;
        String mensaje2 = Cajero.pagarFactura(facturaTotal, usuarioIngreso);
        System.out.println(mensaje2);

        int totalBilletes = 30000;
        int billetes = 50;
        Boolean confirmar = Cajero.cambiarBilletes(totalBilletes, billetes);
        System.out.println(confirmar);
        
        int totalBilletes2 = 3030;
        int billetes2 = 50;
        Boolean confirmar2 = Cajero.cambiarBilletes(totalBilletes2, billetes2);
        System.out.println(confirmar2);

        int totalMoneyChange = 1999;
        String mensaje3 = Cajero.totalDeBilletesYMonedas(totalMoneyChange);
        System.out.println(mensaje3);
    }
}
