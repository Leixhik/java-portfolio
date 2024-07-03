package org.leijap.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMate;
    private double notaEspa;
    private double notaHist;

    // Métodos
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

    public double getNotaEspa() {
        return notaEspa;
    }

    public void setNotaEspa(double notaEspa) {
        this.notaEspa = notaEspa;
    }

    public double getNotaHist() {
        return notaHist;
    }

    public void setNotaHist(double notaHist) {
        this.notaHist = notaHist;
    }
}
