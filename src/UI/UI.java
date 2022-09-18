package UI;
import Data.*;

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

    public static void menu_estudiante(){
        System.out.println();
        System.out.println("Selecciona\n1 para mostrar información del primer estudiante \n2 para mostrar infomración del segundo estudiante");
        System.out.println();
    }

    public static void menu_profesor(){
        System.out.println();
        System.out.println("Selecciona\n1 para mostrar información del primer profesor \n2 para mostrar infomración del segundo profesor");
        System.out.println();
    }

    public static void menu_grupo(){
        System.out.println();
        System.out.println("Selecciona\n1 para mostrar información del primer grupo \n2 para mostrar infomración del segundo grupo");
        System.out.println();
    }

    public static void menu_materia(){
        System.out.println();
        System.out.println("Selecciona\n1 para mostrar información de la primera materia \n2 para mostrar infomración de la segunda materia");
        System.out.println();
    }

    public static void menu_programa_academico(){
        System.out.println();
        System.out.println("Selecciona\n1 para mostrar información del primer programa académico \n2 para mostrar infomración del segundo programa académico");
        System.out.println();
    }

    public static void menu_horario(){
        System.out.println();
        System.out.println("Selecciona\n1 para mostrar información del primer horario \n2 para mostrar infomración del segundo horario");
        System.out.println();
    }

    public static void menu_info_financiera(){
        System.out.println();
        System.out.println("Selecciona\n1 para mostrar información de la primera información financiera \n2 para mostrar infomración de la segunda información financiera");
        System.out.println();
    }

    public static void imprimir_estudiante(Estudiante estudiante){
        System.out.println();
        System.out.println(estudiante.toString());
        System.out.println();
    }

    public static void imprimir_profesor(Profesor profesor){
        System.out.println();
        System.out.println(profesor.toString());
        System.out.println();
    }

    public static void imprimir_grupo(Grupo grupo){
        System.out.println();
        System.out.println(grupo.toString());
        System.out.println();
    }

    public static void imprimir_info_financiera(InformacionFinanciera info_financiera){
        System.out.println();
        System.out.println(info_financiera.toString());
        System.out.println();
    }
    public static void imprimir_programa_academico(ProgramaAcademico programa){
        System.out.println();
        System.out.println(programa.toString());
        System.out.println();
    }
    public static void imprimir_materia(Materia materia){
        System.out.println();
        System.out.println(materia.toString());
        System.out.println();
    }
    public static void imprimir_horario(HorariosClases horario){
        System.out.println();
        System.out.println(horario.toString());
        System.out.println();
    }

}
