package org.leijap.pooherencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    // Métodos

    public Persona(){
        System.out.println("Persona: inicializando constructor.");
    }
    public Persona(String nombre, String apellido){ //Sobrecarga de Método 1
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, int edad){ //Sobrecarga de Método 2
        this(nombre, apellido);
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal!";
    }
}
