/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicospropuestos10.pkg04.tres_1;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Empleado3_1 {
    //Atributos
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private double salarioMes;
    private static int contador = 0;
    
    
    //Constructor
    public Empleado3_1(String nombre, String apellidos, double salarioMes) {
        contador++;
        idEmpleado = contador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioMes = salarioMes;
    }

    //Metodos
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public double getSalarioMes() {
        return salarioMes;
    }
    
    
    public static double nominaTotal(ArrayList<Empleado3_1> empresa){
        double total = 0.0f;
        for(int i = 0; i < empresa.size(); i++){
            total += empresa.get(i).getSalarioMes();
        }
        return total;
    }
    
    public static String leerString(){
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        String n ="";
        do {
            repetir = false;
            try {
                System.out.println("nombre o apellido");
                n = sc.nextLine();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
    
    public static double leerDouble(){
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        double t =0.0f;
        do {
            repetir = false;
            try {
                System.out.println("salario");
                t = parseDouble(sc.nextLine());
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return t;
    }
    
    public static int leerInt(){
        Scanner sc = new Scanner(System.in);
        boolean repetir;
        int n=0;
        do {
            repetir = false;
            try {
                System.out.print("Valor de repetición");
                n = parseInt(sc.nextLine());
            } catch (InputMismatchException e) {
            System.out.println("Valor no válido");
            repetir = true;

            }finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado3_1> empresa;
        empresa = new ArrayList<>();
        String n, a; 
        int ne;
        double s;
        
        System.out.println("");
        System.out.println("Proporcione numero de empleados a crear");
        ne = leerInt();
        
        for(int i = 0; i < ne; i++){
            System.out.println("");
            System.out.println("Proporcione nombre, apellido y salario mensual");
            //Nombre
            n = leerString();
            //Apellidos
            a = leerString();
            //Mes
            s = leerDouble();

            Empleado3_1 e = new Empleado3_1(n, a, s);
            empresa.add(e);
        }
        
        System.out.println("Dinero total: " + nominaTotal(empresa));
        
        
    }
    
}
