import javax.swing.*;
import java.util.Scanner;

public class Excercise2_Insercion {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;

        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de elementos en Array: "));
        arreglo= new int[nElementos];

        System.out.println("Digita el arreglo: ");
        for (int i=0; i<nElementos;i++){
            System.out.print((i+1)+". Digita un número: ");
            arreglo[i]= entrada.nextInt();
        }

        //Ordenamiento por Insercion
        for (int i=0;i<nElementos;i++){
            pos = i;
            aux = arreglo[i];

            while ((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        //Orden Ascendente
        System.out.print("\nOrden Ascendente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");

        //Orden Descendente
        System.out.print("\nOrden Descendente: ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.print("");
    }
}
