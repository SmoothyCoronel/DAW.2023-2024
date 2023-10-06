/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class CuentaBancaria {
    //Atributos
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    
    //Constructor
    public CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Pérez", 
                                                    123456789,tipo.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
    }
    
}
