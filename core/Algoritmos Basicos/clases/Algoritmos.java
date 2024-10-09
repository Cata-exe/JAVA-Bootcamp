package clases;

public class Algoritmos {
    public static boolean esPar(int numero){
        if(numero % 2 == 0){
            return(true);
        }
        else{
            return(false);
        }
    }
    public static boolean esPrimo(int numero){
        if(numero % 1 == 0 && numero % numero == 0){
            return(true);
        }
        else{
            return(false);
        }
    }
    public static String stringEnReversa(String frase){
        String fraseReversa = "";
        for( int i = frase.length() - 1; i >= 0; i--){
            fraseReversa += frase.charAt(i);
        }
        return(fraseReversa);
    }
    public static boolean esPalindromo(String palabra){
        String palabraReversa = "";
        for( int i = palabra.length() - 1; i >= 0; i--){
            palabraReversa += palabra.charAt(i);
        }
        if(palabra.equals(palabraReversa)){
            return(true);
        }
        else{
            return(false);
        }
    }
    public static void secuenciaFizzBuzz(int numeroEntero){
        for(int i = 1; i <= numeroEntero; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i + " ");
            }
        }
    }

}

/*for( int i = 0; i <= fraseReversa.length(); i++) recorrido de izquierda a derecha*/