/*
Read two series of 10 integers, which will be sorted in ascending order.
Copy (merge) the two arrays into a third one so that they remain sorted.
*/

import java.util.Scanner;
public class excercise14_fusionTablas {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int arreglo1[]= new int[10];
            int arreglo2[]= new int[10];
            int arreglo3[]= new int[20];

            //Ingresar primera serie
            for (int i=0;i< arreglo1.length;i++){
                System.out.print((i+1) + ". Ingresa un número (serie 1): ");
                arreglo1[i]=entrada.nextInt();
            }

            //Ingresar Segunda Serie
            for (int i=0;i< arreglo2.length;i++){
                System.out.print((i+1) + ". Ingresa un número (serie 2): ");
                arreglo2[i]= entrada.nextInt();
            }

            //Fusionar las series
            int i=0, j=0, k=0;
            while (i < arreglo1.length && j < arreglo2.length){
                if (arreglo1[i] < arreglo2[j]){
                    arreglo3[k++] = arreglo1[i++];
                } else {
                    arreglo3[k++] = arreglo2[j++];
                }
            }

            while (i < arreglo1.length){
                arreglo3[k++] = arreglo1[i++];
            }
            while (j < arreglo2.length){
                arreglo3[k++] = arreglo2[j++];
            }

            //Mostrar la serie fusionada
            for (i=0; i<arreglo3.length;i++){
                System.out.print(arreglo3[i] + " ");
            }
        }
    }

