package UI;
import java.util.Scanner;
public class UI {
    public static void bienvedida(){
        System.out.println("Bienvenid@ al SIA\n");
    }
    public static void menu(){
        System.out.println("¿Que información deseas ver?○\n1 para información de los estudiantes\n2 para información de los profesores\n" +
                "3 para información de los grupos\n4 para información de las materas\n5 para información del programa académico\n6 para información de los horarios" +
                "\n7 para información del estatus financiero");
    }

    public static int seleccionar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nAquí tu respuesta: ");
        int seleccion = sc.nextInt();
        return seleccion;
    }
}
