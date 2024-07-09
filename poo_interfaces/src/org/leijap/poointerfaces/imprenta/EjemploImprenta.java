package org.leijap.poointerfaces.imprenta;

import org.leijap.poointerfaces.imprenta.modelo.*;

import static org.leijap.poointerfaces.imprenta.modelo.Genero.*;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("John Doe", "Ingeniero en Sistemas", "Resumen laboral...");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador FullStack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("Erich Gamma", "Patrones de diseños: elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facada"));

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
