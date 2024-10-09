import clases.Algoritmos;

public class Aplicacion {
    
    public static void main(String [] args){
        int numero = 400;
        Boolean resultado = Algoritmos.esPar(numero);
        System.out.println(resultado);

        Boolean resultado2 = Algoritmos.esPrimo(numero);
        System.out.println(resultado2);

        String frase = "Hola, buenos dias";
        String mensaje = Algoritmos.stringEnReversa(frase);
        System.out.println(mensaje);

        String palabra = "oso";
        Boolean palindromoConfirmacion = Algoritmos.esPalindromo(palabra);
        System.out.println(palindromoConfirmacion);

        int numeroEntero = 40;
        Algoritmos.secuenciaFizzBuzz(numeroEntero);
    }
}
