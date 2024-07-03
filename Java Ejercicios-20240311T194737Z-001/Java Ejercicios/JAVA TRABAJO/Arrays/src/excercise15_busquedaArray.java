/*
    Read 100 sorted increasing integers. Read N and search for them in the table.
    The position where it is located must be displayed. If it is not, indicate it with a message.
 */

import java.util.Scanner;

public class excercise15_busquedaArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10];
        int numero;
        boolean creciente = true;

        do{
            //Pedir arreglo
            System.out.println("Rellena el Arreglo");
            for (int i=0;i<arreglo.length;i++){
                System.out.print((i+1) + ". Ingresa un número: ");
                arreglo[i]= entrada.nextInt();
            }
            //Verificar si el Array está ordenado
            for (int i=0; i< 9;i++){
                if (arreglo[i] < arreglo[i+1]){ //Creciente
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i+1]){ //Decreciente
                    creciente = false;
                    break;
                }
            }
            if (creciente==false){
                System.out.print("\nEl Arreglo está desordenado, digite nuevamente: ");
            }
        }while(creciente==false);

        //Pedir el numero a buscar en Arreglo
        System.out.print("\nDigita el número a buscar en el arreglo: ");
        numero= entrada.nextInt();

        //Buscamos el número en el arreglo
        int i=0;
        while (i<arreglo.length && arreglo[i]<numero){ // Recorre numero hasta que llega al número
            i++;
        }

        if (i==10){ //Hemos recorrido todo el arreglo y no encontramos nada
            System.out.print("\nNumero no encontrado");
        } else {
            if (arreglo[i] == numero){
                System.out.print("\nNumero encontrado, en la posición: "+i);
            } else {
                System.out.print("\nNúmero no encontrado");
            }
        }

    }
}
