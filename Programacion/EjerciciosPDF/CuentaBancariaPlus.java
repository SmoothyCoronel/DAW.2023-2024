/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class CuentaBancariaPlus {
    //Atributos
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    
    //Constructor
    public CuentaBancariaPlus(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    
    //Resto de métodos
    public void imprimir(){
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
    }
    
    public void consultarSaldo(){
        System.out.println("El saldo actual es = " + saldo);
    }
    
    public boolean consignar(int valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + "en la"
                    + " cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor "
                    + "que cero");
            return false;
        }
    }
    
    public boolean retirar(int valor){
        if((valor > 0) && (valor <= saldo)){
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la "
                    + "cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else{
            System.out.println("El valor a retirar debe ser menor que"
                    + " el saldo actual");
            return false;
        }
    }
    
   void compararCuentas(CuentaBancariaPlus cuenta){
  
        if(saldo >= cuenta.saldo){
            System.out.println("El saldo de la cuenta actual es mayor o\n" +
                            "igual al saldo de la cuenta pasada como parámetro.");
        } else {
            System.out.println("El saldo de la cuenta actual es menor al\n" +
                                "saldo de la cuenta pasada como parámetro.");
        }
    }
    
   void transferencia(CuentaBancariaPlus cuenta, int valor) {
        if (retirar(valor)) { // Si se puede retirar el valor de la cuenta actual
            cuenta.consignar(valor); /* Se realiza la consignación en la
            otra cuenta */
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaPlus cuenta1 = new CuentaBancariaPlus("Pedro","Pérez",123456789,tipo.AHORROS);
        CuentaBancariaPlus cuenta2 = new CuentaBancariaPlus("Pablo","Pinzón",44556677,tipo.AHORROS);
        cuenta1.consignar(200000);
        cuenta2.consignar(100000);
        cuenta1.compararCuentas(cuenta2);
        cuenta1.transferencia(cuenta2, 50000);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
    }
    
}
