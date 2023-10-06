/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
    Agregar un atributo a la clase CuentaBancaria, que determine si la
    cuenta está activa (de tipo boolean). Una cuenta está activa si tiene
    un saldo positivo. No se pueden realizar consignaciones a la cuen-
    ta si está inactiva. Si al retirar dinero, el saldo de la cuenta es cero,
    la cuenta pasa a considerarse inactiva.
 */
public class CuentaBancariaPlus2 {
//Atributos
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    boolean isActiva = true;
    
    //Constructor
    public CuentaBancariaPlus2(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta){
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
            if(saldo == 0 || saldo < 0){
                isActiva = false;
            }
            return true;
        } else{
            System.out.println("El valor a retirar debe ser menor que"
                    + " el saldo actual");
            return false;
        }
    }
    
    public void compararCuentas(CuentaBancariaPlus2 cuenta){
  
        if(saldo >= cuenta.saldo){
            System.out.println("El saldo de la cuenta actual es mayor o\n" +
                            "igual al saldo de la cuenta pasada como parámetro.");
        } else {
            System.out.println("El saldo de la cuenta actual es menor al\n" +
                                "saldo de la cuenta pasada como parámetro.");
        }
    }
    
    public void transferencia(CuentaBancariaPlus2 cuenta, int valor) {
        if (retirar(valor)) { // Si se puede retirar el valor de la cuenta actual
            cuenta.consignar(valor); /* Se realiza la consignación en la
            otra cuenta */
        }
    }

    public boolean isIsActiva() {
        return isActiva;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaPlus2 cuenta1 = new CuentaBancariaPlus2("Pedro","Pérez",123456789,tipo.AHORROS);
        CuentaBancariaPlus2 cuenta2 = new CuentaBancariaPlus2("Pablo","Pinzón",44556677,tipo.AHORROS);
        cuenta1.consignar(200000);
        cuenta2.consignar(100000);
        cuenta1.compararCuentas(cuenta2);
        cuenta1.transferencia(cuenta2, 50000);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
        cuenta1.isIsActiva();
        cuenta2.isIsActiva();
    }
    
}
