/**
 * AdivinarNumero
 */
import java.util.Random;
import java.util.Scanner;


public class AdivinarNumero {
    public static Scanner lector = new Scanner(System.in);
    public static Random random = new Random();
    public static int contadorFallos = 0;
    public static void main(String[] args) {
        boolean adivinado = false;
        int numero = generarNumero();
        System.out.println(numero);
        do {            
            System.out.println("Intenta adivinar el número");
            int adivinar = pideInt();
            contadorFallos++;
            if (adivinar == numero) {
                adivinado = true;
            }
            if (adivinar < numero) {
                System.out.println("El númeor que buscas es mayor que el introducido");
            }
            if (adivinar > numero) {
                System.out.println("El númeor que buscas es menor que el introducido");
            }
        } while (!adivinado);
        System.out.println();
        System.out.println("Has adivinado el número secreto");
        System.out.println("El número era el " + numero);
        System.out.println("Lo has intentado " + contadorFallos + " veces");
    }
    
    public static int generarNumero(){
        return random.nextInt(500)+1;
    }

    public static int pideInt(){
        int num = lector.nextInt();
        return num;
    }
    
}