/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
public class Automovil {

    /*
    Se requiere un programa que modele el concepto de un automóvil. Un
    automóvil tiene los siguientes atributos:
     Marca: el nombre del fabricante.
     Modelo: año de fabricación.
     Motor: volumen en litros del cilindraje del motor de un automóvil.
    
     Tipo de combustible: valor enumerado con los posibles valores de
    gasolina, bioetanol, diésel, biodiésel, gas natural.
    
     Tipo de automóvil: valor enumerado con los posibles valores de
    carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.
     Número de puertas: cantidad de puertas.
     Cantidad de asientos: número de asientos disponibles que tiene el
    vehículo.
     Velocidad máxima: velocidad máxima sostenida por el vehículo
    en km/h.
     Color: valor enumerado con los posibles valores de blanco, negro,
    rojo, naranja, amarillo, verde, azul, violeta.
     Velocidad actual: velocidad del vehículo en un momento dado.Clases y objetos
    
    La clase debe incluir los siguientes métodos:
     Un constructor para la clase Automóvil donde se le pasen como
    parámetros los valores de sus atributos.
     Métodos get y set para la clase Automóvil.
     Métodos para acelerar una cierta velocidad, desacelerar y frenar
    (colocar la velocidad actual en cero). 
    
    Es importante tener en cuen-
    ta que no se debe acelerar más allá de la velocidad máxima per-
    mitida para el automóvil. 
    De igual manera, tampoco es posible desacelerar a una velocidad negativa. 
    Si se cumplen estos casos, se debe mostrar por pantalla los mensajes correspondientes.
    
     Un método para calcular el tiempo estimado de llegada, utilizando
    como parámetro la distancia a recorrer en kilómetros. El tiempo
    estimado se calcula como el cociente entre la distancia a recorrer y
    la velocidad actual.
     Un método para mostrar los valores de los atributos de un Auto-
    móvil en pantalla.
     Un método main donde se deben crear un automóvil, colocar su
    velocidad actual en 100 km/h, aumentar su velocidad en 20 km/h,
    luego decrementar su velocidad en 50 km/h, y después frenar. Con
    cada cambio de velocidad, se debe mostrar en pantalla la velocidad
    actual.
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
    
    //Creación de clase automovil
    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil,
             int númeroPuertas, int cantidadAsientos, int velocidadMáxima, tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
    }
    
    //Creacion de getters
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
    
    //Creacion de setters
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
    
    //Metodo acelerar
    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMáxima) {
            // Si el incremento de velocidad no supera la velocidad máxima 
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else { 
            // De otra manera no se puede incrementar la velocidad y se genera mensaje 
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
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
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil("BMW", 3, 6, tipoCom.GASOLINA, tipoA.SUBCOMPACTO, 
                                        4, 6, 230, tipoColor.NARANJA );
        auto1.imprimir();
        auto1.setVelocidadActual(120);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual acelerada = " + auto1.velocidadActual);
        auto1.desacelerar(40);
        System.out.println("Velocidad actual des-acelerada = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
        
    }
    
}
