package UI;
import Data.*;

import java.util.Scanner;
public class UI {
    public static void bienvedida(){
        System.out.println("Bienvenid@ al SIA\n");
    }
    public static void menu(){
        System.out.println("¿Que información deseas ver?: \n1 para información de los estudiantes\n2 para información de los profesores\n" +
                "3 para información de los grupos\n4 para información de las materas\n5 para información del programa académico\n6 para información de los horarios" +
                "\n7 para información del estatus financiero");
    }
    public static void error(){
        System.out.println("error");
    }

    public static int seleccionar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nAquí tu respuesta: ");
        int seleccion = sc.nextInt();
        return seleccion;
    }
    public static void Imprimir_estudiantes(Estudiante a, Estudiante b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void Imprimir_profesores(Profesor a, Profesor b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void Imprimir_grupos(Grupo a, Grupo b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void Imprimir_materias(Materia a, Materia b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void Imprimir_programa_acamademico(ProgramaAcademico a, ProgramaAcademico b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void Imprimir_horarios(HorariosClases a,HorariosClases b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void Imprimir_info_financiera(InformacionFinanciera a, InformacionFinanciera b){
        System.out.println(a);
        System.out.println(b);
    }

}
