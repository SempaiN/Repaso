package Persona;
import java.util.Random;

public class Persona {
    
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){

    }

    public Persona(String nombre,int edad,char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
        this.DNI = "13375205S";
        this.peso = 69.6;
        this.altura = 1.74;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
       this.DNI= generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        comprobarSexo(sexo);
        this.altura = altura;
    }

    public int calcularMC(){
        int mc;
        mc= (int) (this.peso/(altura*altura));
        return mc;
    }
    
    public boolean esMayorDeEdad(){
        if (this.edad >= 18) {
            return true;
        }
        else{
            return false;
        }
    }
    
    private boolean comprobarSexo(char sexo){
        if (sexo == 'H' || sexo == 'M') {
            return true;
        }
        else{
            this.sexo='H';
            return false;
        }
    }

    private int generarNumero8Cifras(Random random) {
        return random.nextInt(900_000_00) + 100_000_00;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }

    private String generarDNI(){
        Random ran = new Random();
        int num = generarNumero8Cifras(ran);
        int res = num%23;
        char letra = generaLetraDNI(res);
        String DNI =Integer.toString(num)+letra;
        return DNI;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + "]";
    }




    

}
