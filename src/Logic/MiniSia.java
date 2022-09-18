package Logic;
import Data.*;
import UI.UI;

import java.util.ArrayList;
import java.util.List;

import Data.Estudiante;

public class MiniSia {
        public static void main(String[] args){
                Profesor armando = new Profesor("Armando","Villamil",55888,null,"Profesor de planta","FEM 205",
                        null,null);
                Estudiante martin = new Estudiante("Martin","Moreno",1034657217,170144,"Cra 94B#42F-46SUR",3103017732l,
                "O+",armando.getNombre()+" "+armando.getApellido(),null,null);
                        Estudiante gabriel = new Estudiante("Gabriel","Fonseca",100078889,144786,"Calle 100#55-40",31478869922l,
                "A+",null,null,null);

                UI.bienvedida();
                UI.menu();
                int seleccion = UI.seleccionar();
                switch (seleccion){
                        case 1:
                                UI.menu_estudiante();
                                break;
                        case 2:
                                UI.menu_profesor();
                                break;
                        case 3:
                                UI.menu_grupo();
                                break;
                        case 4:
                                UI.menu_materia();
                                break;
                        case 5:
                                UI.menu_programa_academico();
                                break;
                        case 6:
                                UI.menu_horario();
                                break;
                        case 7:
                                UI.menu_info_financiera();
                                break;
                        default:
                                UI.error();
                }
                int segunda_seleccion = UI.seleccionar();

                if(seleccion == 1){
                        switch (segunda_seleccion){
                                case 1:
                                        UI.imprimir_estudiante(martin);
                                        break;
                                case 2:
                                        UI.imprimir_estudiante(gabriel);
                                        break;
                                default:
                                        UI.error();
                        }
                }


        }

}

