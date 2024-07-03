/*
    Búsqueda Secuencial:

    Arreglo[] = {3,1,2,5,4}; dato =2
 */

import javax.swing.*;

public class Excercise1_busquedaSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero a buscar: "));

        //Busqueda Secuencial
        int i=0;
        while (i<5 && band==false){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if (band == false){
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo.");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posición: "+(i-1));
        }



    }
}

