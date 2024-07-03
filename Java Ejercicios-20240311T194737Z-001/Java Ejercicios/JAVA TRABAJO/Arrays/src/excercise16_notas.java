import java.util.ArrayList;
import java.util.Formattable;
import java.util.Scanner;

/*
    We want to develop an application that helps us manage the grades of an educational center.
    Each group (or class) is composed of 5 students. You are asked to read the grades of the first,
    second and third trimester of a group. We must show at the end: the average grade of the group in each trimester,
    and the average of the student in position N (N is read by keyboard)
 */
public class excercise16_notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int alumnos=5; //Tamaño final de grupo

        //Crear lista para almacenar las notas por trimestre
        ArrayList<ArrayList<Double>> notasTrimestre = new ArrayList<>();
        for (int i=0; i<3; i++){
            notasTrimestre.add(new ArrayList<>());
        }

        //Leer notas de cada alumno
        for (int i=0; i<alumnos; i++){
            for (int j=0; j<3; j++){
                System.out.print("Nota Alumno "+(i+1)+ ", Trimestre "+ (j+1)+": ");
                double nota = entrada.nextDouble();
                notasTrimestre.get(j).add(nota);
            }
        }

        //Calcular la media del grupo en cada trimestre
        ArrayList<Double> mediaTrimestres = new ArrayList<>();
        for (int i=0; i<3; i++){
            double sumaNotas =0;
            for (Double nota: notasTrimestre.get(i)){
                sumaNotas+= nota;
            }
            mediaTrimestres.add(sumaNotas / alumnos);
        }

        //Leer la posición del alumno
        System.out.print("Introduzca la posición del alumno (1-" + alumnos+" ): ");
        int posicionAlumno=entrada.nextInt() -1;

        // Calcular la media del alumno en la posición N
        double mediaAlumno =0;
        for (int i=0; i<3;i++){
            mediaAlumno+= notasTrimestre.get(i).get(posicionAlumno);
        }
        mediaAlumno /= 3;

        //Mostrar Resultados
        for (int i=0; i<3; i++){
            System.out.print("\nMedia del grupo por trimestre "+ (i+1) + ": " +mediaTrimestres.get(i));
        }
        System.out.print("\nMedia de alumno, posición "+ (posicionAlumno+1) +": " + mediaAlumno);


    }
}
