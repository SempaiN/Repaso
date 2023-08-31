package Empleado;
public class Repartidor extends Empleado {
 
    public String zona;

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString(){
        return Repartidor.class.getSimpleName()+" "+super.toString()+ ", " + " zona= " + this.zona;
    }

    public Repartidor(String nombre,int edad, double salario, String zona){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.zona = zona;
    }

    public boolean plus() {
        if (edad <25 && zona.equalsIgnoreCase("zona 3")) {
            this.salario += plus;
            return true;
        }
        else{
            return false;
        }
    }
    
}
