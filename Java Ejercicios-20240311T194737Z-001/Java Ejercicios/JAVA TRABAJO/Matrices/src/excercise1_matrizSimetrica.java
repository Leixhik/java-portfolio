import javax.swing.*;
import java.util.Scanner;

public class excercise1_matrizSimetrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de Columna: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digita una matriz: ");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        if (nFilas == nCol){
            int i=0, j=0;
            while (i<nFilas && simetrica==true){
                j=0;
                while(j<i && simetrica==true){
                    if (matriz[i][j] != matriz [j][i]){ //Compara la matriz ij con la inversa ji y si un valor no es igual, dará un false
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica==true){
                JOptionPane.showMessageDialog(null,"La matriz es simétrica.");
            }else{
                JOptionPane.showMessageDialog(null,"La matriz no es simétrica.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"La matriz no es Simétrica");
        }
    }
}
