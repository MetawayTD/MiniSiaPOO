package Logic;
import Data.*;
import UI.UI;

import javax.swing.*;
import java.util.ArrayList;

public class MiniSia {
        public static void main(String[] args){
                ArrayList<String> titulos_armando = new ArrayList<String>();
                titulos_armando.add("Pregrado en matemáticas");
                titulos_armando.add("Doctorado en matemáticas");

                ArrayList<String> titulos_marta = new ArrayList<String>();
                titulos_marta.add("Pregrado en ingenieria de sistemas");
                titulos_marta.add("Especialización en redes de telecomunicaciones");
                titulos_marta.add("Maestria en ciencias de la computación");

                ArrayList<String> prerrequisitos_lineal = new ArrayList<String>();
                prerrequisitos_lineal.add("Matemáticas básicas");
                prerrequisitos_lineal.add("Cálculo diferencial");

                ArrayList<String> prerrequisitos_poo = new ArrayList<String>();
                prerrequisitos_poo.add("Introducción a la ingenieria de sistemas");
                prerrequisitos_poo.add("Programación de computadores");

                ArrayList<String> dias_horario1 = new ArrayList<String>();
                dias_horario1.add("lubes");
                dias_horario1.add("Miercoles");

                ArrayList<String> dias_horario2 = new ArrayList<String>();
                dias_horario1.add("Martes");
                dias_horario1.add("Jueves");



                Estudiante martin = new Estudiante("Martin Moreno Jara",1034657217,"mamorenoj@unal.edu.co","Cra 94B #42F-46SUR",
                        3103017732L,"o+");
                Estudiante gabriel = new Estudiante("Gabriel Fonseca Guerrero",1004558477,"gfonsecag@unal.edu.co");

                Profesor armando = new Profesor("Armando Reyes","Armando@unal.edu.co",titulos_armando,"Profesor de planta","FEM 303");
                Profesor marta = new Profesor("Marta Villamil","Marta@unal.edu.co",titulos_marta);

                Materia algebra_lineal = new Materia("Álgebra lineal",4,prerrequisitos_lineal);
                Materia proramacion_orientada_a_objetos = new Materia("Programación orientada a objetos",4,prerrequisitos_poo);

                Grupo grupo1 = new Grupo(10,4,algebra_lineal);
                Grupo grupo2 = new Grupo(15,4,proramacion_orientada_a_objetos);

                HorariosClases horario1 = new HorariosClases(dias_horario1);
                HorariosClases horario2 = new HorariosClases(dias_horario2);

                ProgramaAcademico ingenieria_de_sistemas = new ProgramaAcademico("Pregrado","Ingenieria de sistemas");
                ProgramaAcademico ingenieria_industrial = new ProgramaAcademico("Pregrado","Ingenieria industrial");

                InformacionFinanciera info1 = new InformacionFinanciera(martin);
                InformacionFinanciera info2 = new InformacionFinanciera(gabriel);

                

                UI.bienvedida();
                UI.menu();
                int seleccion = UI.seleccionar();

                switch (seleccion){
                        case 1:
                                UI.Imprimir_estudiantes(martin,gabriel);
                                break;
                        case 2:
                                UI.Imprimir_profesores(armando,marta);
                                break;
                        case 3:
                                UI.Imprimir_grupos(grupo1,grupo2);
                                break;
                        case 4:
                                UI.Imprimir_materias(algebra_lineal,proramacion_orientada_a_objetos);
                                break;
                        case 5:
                                UI.Imprimir_programa_acamademico(ingenieria_de_sistemas,ingenieria_industrial);
                                break;
                        case 6:
                                UI.Imprimir_horarios(horario1,horario2);
                                break;
                        case 7:
                                UI.Imprimir_info_financiera(info1,info2);
                                break;
                        default:
                                UI.error();
                }
        }

}

