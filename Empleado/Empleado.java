package Empleado;
/**
 * Empleado
 */
public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;
    public static final double plus = 300;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public static double getPlus() {
        return plus;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", edad=" + edad + ", salario=" + salario;
    }

    

    
    

    
}