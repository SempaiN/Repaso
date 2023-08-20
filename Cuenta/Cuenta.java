package Cuenta;

/**
 * Cuenta
 */
public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta(String titular){
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad){
        if (cantidad < 0) {
            this.cantidad = 0;
        }
        else{
            this.cantidad = cantidad;
        }
        this.titular = titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void setCantidad(double cantidad){
        if (cantidad < 0) {
            this.cantidad = 0;
        }
        else{
            this.cantidad = cantidad;
        }
    }

    public String getTitular(){
        return this.titular;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }

    public boolean ingresarDinero(double dinero){
        boolean puc = false;
        if (dinero > 0) {
            this.cantidad += dinero;
            puc = true;
        }
        return puc;
    }

    public void retirarDinero(double dinero){
        if ((this.cantidad - dinero)< 0) {
            this.cantidad = 0;
        }
        else{
            this.cantidad -= dinero;
        }
    }


    @Override
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }

    

}