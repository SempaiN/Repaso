package Cuenta;


public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta_1 = new Cuenta("DiscoDurodeRoer");
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);
         
        //Ingresa dinero en las cuentas
        cuenta_1.ingresarDinero(300);
        cuenta_2.ingresarDinero(400);
         
        //Retiramos dinero en las cuentas
        cuenta_1.retirarDinero(500);
        cuenta_2.retirarDinero(100);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros
    }
}
