/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospdf;

/**
 *
 * @author mint
 */
    public class Pelicula {
        //Atributos
        private String nombre;
        private String director;
        private enum tipo {ACCION, COMEDIA, DRAMA, SUSPENSO};
        tipo genero;
        private int duracion;
        private int año;
        private double calificacion;

        //Constructor
        public Pelicula(String nombre, String director, tipo genero, int duracion
                                            , int año, double calificacion){
           this.nombre = nombre;
           this.director = director;
           this.genero = genero;
           this.duracion = duracion;
           this.año = año;
           this.calificacion = calificacion;
        }
        
        //Resto de métodos
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public tipo getGenero() {
            return genero;
        }

        public void setGenero(tipo genero) {
            this.genero = genero;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public double getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(double calificacion) {
            this.calificacion = calificacion;
        }

        public void imprimir(){
            System.out.println("Nombre + " + nombre);
            System.out.println("Director: " + director);
            System.out.println("Género: " + genero);
            System.out.println("Duración" + duracion);
            System.out.println("Año: " + año);
            System.out.println("Calificación: " + calificacion);
        }
        
        
        private boolean esPeliculaEpica(){
            if(duracion >= 180){
                return true;
            } else{
                return false;
            }
        }
        
        private String calcularValoracion() {
            if (calificacion >= 0 && calificacion <= 2) { /* Entre [0, 2] se con-
            sidera “Muy mala” */
            return "Muy mala";
            } else if (calificacion > 2 && calificacion <= 5) { /* Entre (2, 5] se
            considera “Mala” */
            return "Mala";
            } else if (calificacion > 5 && calificacion <= 7) { /* Entre (5,7] se
            considera “Regular” */
            return "Regular";
            } else if (calificacion > 7 && calificacion <= 8) { /* Entre (7,8] se
            considera “Buena” */
            return "Buena";
            } else if (calificacion > 8 && calificacion <= 10){ /* Entre (8,10] se
            considera “Excelente” */
            return "Excelente";
            } else {
            return "No tiene asignada una valoración válida";
            }
        }
        
        private boolean esSimilar(Pelicula pelicula){
            if (pelicula.genero == genero && pelicula.calcularValoracion() == calcularValoracion()) {
                return true;
            } else {
                return false;
            }
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough",
        tipo.DRAMA,191,1982,8.3);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh",
        tipo.ACCION, 115,2011,7.0);
        pelicula1.imprimir();
        System.out.println();
        pelicula2.imprimir();
        System.out.println();
        System.out.println("La película " + pelicula1.getNombre() + " es" +
        " épica: " + pelicula1.esPeliculaEpica());
        System.out.println("La película " + pelicula2.getNombre() + " es" +
        " épica: " + pelicula2.esPeliculaEpica());
        System.out.println("La película " + pelicula1.getNombre() + " y" +
        " la película " + pelicula2.getNombre() + " son similares = " +
        pelicula1.esSimilar(pelicula2));
    }
}
