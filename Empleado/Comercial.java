package Empleado;
public class Comercial extends Empleado {
    
    public double comision;

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString(){
        return Comercial.class.getSimpleName()+" "+super.toString()+ ", " + " comision= " + this.comision;
    }

    public Comercial(String nombre,int edad, double salario, double comision){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.comision = comision;
    }

    public boolean plus(){
        if (comision > 200 && edad >30) {
            this.salario +=plus;
            return true;
        }
        else {
            return false;
        }
    }
}
