package clases;
import java.util.Date;
import java.lang.Math;

public class Cajero {
    public static String retirarDinero(double retiro) {
        if(retiro > 8000){
            return("Estás tratando de retirar mucho dinero, el límite es $8000");
        }
        else{
            return("Retiraste exitosamente la cantidad de " + retiro);
        }
    }

    public static String pagarFactura(double totalFactura, double ingresoUsuario){

        Date fechaActual = new Date();
        
        if(ingresoUsuario < totalFactura){
            return("El día de " + fechaActual + " pagaste " + ingresoUsuario + " aún te hacen falta " + (totalFactura - ingresoUsuario));
        }
        else if(ingresoUsuario == totalFactura){
            return("Gracias por tu pago completo el día de " + fechaActual);
        }
        else{
            return("Gracias por tu pago el día de " + fechaActual + ", tu cambio es de " + (ingresoUsuario - totalFactura));
        }
    }

    public static boolean cambiarBilletes(int totalACambiar, int denominacionBillete){
        if(totalACambiar % denominacionBillete == 0){
            return(true);
        }
        else{
            return(false);
        }
    }

    public static String totalDeBilletesYMonedas(int cambio){
        int billetes[] = {500,200,100,50,20};
        int monedas[] = {10,5,2,1};
        String mensajeFinal = "";
        /* int billete1 = 500;
        int billete2 = 200;
        int billete3 = 100;
        int billete4 = 50;
        int billete5 = 20;
        int moneda1 = 10;
        int moneda2 = 5;
        int moneda3 = 2;
        int moneda4 = 1; 
        int residuo = 
        */
        int residuo = cambio;
        for(int i = 0; i < billetes.length; i++){
            int cociente = (int)Math.floor(residuo / billetes[i]);
            mensajeFinal = mensajeFinal + "" + cociente + " billetes de " + billetes[i] + ", ";
            residuo = residuo - (cociente * billetes[i]);
        }
        for(int i = 0; i < monedas.length; i++){
            int cociente = (int)Math.floor(residuo / monedas[i]);
            mensajeFinal = mensajeFinal + "" + cociente + " monedas de " + monedas[i] + ", ";
            residuo = residuo - (cociente * monedas[i]);
        }
        return(mensajeFinal);
    }
}

