package org.leijap.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMate;
    private double notaEsp;
    private double notaHist;

    // Métodos
    public Alumno(){
        System.out.println("Alumno: inicializando constructor.");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido); // Sobrecarga de metodo padre 1
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion; // Se inicializa desde aquí y éste se lo pasará a AlumnoInternacional
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaEsp, double notaMate, double notaHist){
        this(nombre, apellido, edad, institucion);
        this.notaEsp = notaEsp;
        this.notaMate = notaMate;
        this.notaHist = notaHist;
    } // Se pueden crear Constructores al gusto, solo los atributos necesarios.
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaEsp() {
        return notaEsp;
    }

    public void setNotaEsp(double notaEsp) {
        this.notaEsp = notaEsp;
    }

    public double getNotaHist() {
        return notaHist;
    }

    public void setNotaHist(double notaHist) {
        this.notaHist = notaHist;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy Alumno y mi nombre es: " + getNombre();
    }

    public double calcularPromedio(){
        System.out.println("calcularPromedio " + this.getClass().getCanonicalName());
        return (notaHist + notaEsp + notaMate)/3;
    }
}
