/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallervehiculos;

/**
 *
 * @author mint
 */
public class TrabajoTaller {
    /*
    *   Aqui se da el vehiculo con problemas descritos y tras unos metodos x se devolverán las horas previstas, solucionPrevista...
    *   Cuando todo está a punto tendremos un método para efectuar el cobro del vehiculo teniendo en cuenta las horas reales y el tipo de vehiculo
    */
    
    //Atributos
    private String descripcion, solucionPrevista;
    private int horasPrevistas, horasReales;
    private boolean isCobrado;
    private String codigo;
    
    //Constructor
    public TrabajoTaller(String descripcion, String solucionPrevista, int horasPrevistas, int horasReales, boolean isCobrado, String codigo) {
        this.descripcion = descripcion;
        this.solucionPrevista = solucionPrevista;
        this.horasPrevistas = horasPrevistas;
        this.horasReales = horasReales;
        this.isCobrado = false;
        this.codigo = codigo;
    }
    
    //Metodos

    public int getHorasReales() {
        return horasReales;
    }
    public void setHorasReales(int horasReales) {
        this.horasReales = horasReales;
    }

    public boolean isIsCobrado() {
        return isCobrado;
    }
    public void setIsCobrado(boolean isCobrado) {
        this.isCobrado = isCobrado;
    }

    public String getCodigo() {
        return codigo;
    }
   
}
