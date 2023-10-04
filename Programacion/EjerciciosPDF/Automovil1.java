/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Automovil1 {

    /*
    Agregar a la clase Automóvil, un atributo para determinar si el ve-
    hículo es automático o no. Agregar los métodos get y set para dicho
    atributo. Modificar el constructor para inicializar dicho atributo.
    */
    /*
    Modificar el método acelerar para que si la velocidad máxima se so-
    brepase se genere una multa. Dicha multa se puede incrementar cada
    vez que el vehículo intenta superar la velocidad máxima permitida.
    */
    /*
    Agregar un método para determinar si un vehículo tiene multas y
    otro método para determinar el valor total de multas de un vehículo
    */
    
    String marca;
    int motor;
    int modelo;
    
    enum tipoCom{GASOLINA, BIOETANOL, DIESEL, BIODISESEL,GAS_NATURAL}
    tipoCom tipoCombustible;
    
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,EJECUTIVO, SUV}
    
    tipoA tipoAutomovil;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA,AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int velocidadActual = 0;
    
    boolean automatico;
    int multa = 0;
    
    //Creación de clase Automovil1
    Automovil1(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil,
             int númeroPuertas, int cantidadAsientos, int velocidadMáxima, tipoColor color, boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.automatico = automatico;
    }
    
    //Creación de getters
    public String getMarca() {
        return marca;
    }

    public int getMotor() {
        return motor;
    }

    public int getModelo() {
        return modelo;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    public int getNúmeroPuertas() {
        return númeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    //Creación de setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    
    
    //Metodo acelerar
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMáxima) {
            // Si el incremento de velocidad no supera la velocidad máxima 
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else { 
            // De otra manera no se puede incrementar la velocidad y se genera mensaje 
            multa ++;
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            System.out.println("LLevas " + multa + "multas por velocidad");
            
        }       
    }
    
    //Metodo desacelerar
    void desacelerar(int decrementoVelocidad) {
        /* La velocidad actual no se puede decrementar alcanzando un valor negativo */
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else { 
            /* De otra manera no se puede decrementar la velocidad y se genera mensaje */
        System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    
    //Método multas
    
    
    
    //Metodo para frenar
    void frenar() {
        velocidadActual = 0;
    }
    
    //Metodo de calculo de tiempo hasta llegar a una distancia
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    
    //Método imprimir
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automovil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
        System.out.println("Es automatico = " + automatico);
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil1 auto2 = new Automovil1("BMW", 3, 6, tipoCom.GASOLINA, tipoA.SUBCOMPACTO, 
                                        4, 6, 230, tipoColor.NARANJA, true);
        auto2.imprimir();
        auto2.setVelocidadActual(120);
        System.out.println("Velocidad actual = " + auto2.velocidadActual);
        auto2.acelerar(20);
        System.out.println("Velocidad actual acelerada = " + auto2.velocidadActual);
        auto2.desacelerar(40);
        System.out.println("Velocidad actual des-acelerada = " + auto2.velocidadActual);
        auto2.frenar();
        System.out.println("Velocidad actual = " + auto2.velocidadActual);
        auto2.desacelerar(20);
        
        
    }
    
}
