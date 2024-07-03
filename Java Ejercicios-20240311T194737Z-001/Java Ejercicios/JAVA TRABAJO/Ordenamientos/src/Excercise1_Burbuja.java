import javax.swing.*;
import java.util.Scanner;

public class Excercise1_Burbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elementos del Arreglo: "));

        arreglo = new int[nElementos]; //Asignamos en numero de elementos al arreglo

        for (int i=0; i<nElementos;i++){
            System.out.print((i+1)+". Digita un número: ");
            arreglo[i]= entrada.nextInt();
        }

        //Método Burbuja Anidado
        for (int i=0;i<(nElementos-1);i++){ //Recorrer el Arreglo
            for (int j=0;j<(nElementos-1);j++){ //Ordenar el arreglo
                if (arreglo[j]>arreglo[j+1]){ //Si nActual>nSiguiente
                    aux= arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

        //Mostrando el Arreglo Ordenado en forma creciente
        System.out.print("\nArreglo ordenado en forma creciente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.print("");

        //Mostrar arreglo ordenado en forma decreciente
        System.out.print("\nArreglo ordenado en forma decreciente: ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.print("");
    }

}
