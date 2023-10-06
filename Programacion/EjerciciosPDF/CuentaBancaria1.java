/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
    Agregar a la clase CuentaBancaria, un atributo que represente el
    porcentaje de interés mensual aplicado a la cuenta.
    Agregar un método que calcule un nuevo saldo aplicando la tasa
    de interés correspondiente.
 */
public class CuentaBancaria1 {
    //Atributos
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    int porcentajeMensual;
    
    //Constructor
    public CuentaBancaria1(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta, int porcentajeMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.porcentajeMensual = porcentajeMensual;
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
    
    //Nuevo saldo con tasa de interes
    public float interesMes(){
        saldo = saldo - (saldo * porcentajeMensual) / 100;
        return saldo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria1 cuenta = new CuentaBancaria1("Pedro", "Pérez", 
                                                    123456789, tipo.AHORROS, 35);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        System.out.println("El saldo teniendo en cuenta la tasa semanal es: "+ cuenta.interesMes());
    }
    
}
