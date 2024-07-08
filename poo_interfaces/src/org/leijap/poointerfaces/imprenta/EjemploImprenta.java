package org.leijap.poointerfaces.imprenta;

import org.leijap.poointerfaces.imprenta.modelo.*;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("John Doe", "Ingeniero en Sistemas", "Resumen laboral...");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador FullStack");
        cv.addExperiencia("Angular");

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
