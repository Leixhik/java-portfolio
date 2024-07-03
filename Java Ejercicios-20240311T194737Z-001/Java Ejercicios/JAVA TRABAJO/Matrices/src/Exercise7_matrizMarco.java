/*
    Create a "Frame" matrix, size 5x5: all its elements must be 0 except the borders, which must be 1.
 */
public class Exercise7_matrizMarco {
    public static void main(String[] args) {
        int matriz[][]= new int[5][5];

        //Rellenar Matriz
        for (int i=0;i< matriz.length;i++){
            for (int j=0; j< matriz.length;j++){
                if (i == 0 || i ==4){ //Delimitar las columnas
                    matriz[i][j] = 1;
                } else if (j == 0 || j==4) { // Delimitar Filas
                    matriz[i][j] = 1;
                } else{
                    matriz[i][j] = 0;
                }
            }
        }

        //Impresion
        System.out.println("La Matriz es: ");
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz.length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
