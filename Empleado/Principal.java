package Empleado;

public class Principal {
    public static void main(String[] args) {
        Comercial c1 = new Comercial("javi", 35, 500, 250);
        System.out.println(c1);
        if (c1.plus()) {
            System.out.println("ha cobrado el plus");
            System.out.println(c1);
        }
    }
}
