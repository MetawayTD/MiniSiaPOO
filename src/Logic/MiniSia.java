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
                Profesor jose = new Profesor("Jose","Jose",114585,null,"Profesor becario",
                        "Aulas de ingeniera 453 201",null,null);

                Grupo grupo1 = new Grupo(1,4,10,null,null,armando.getNombre()+" "+armando.getApellido()
                        ,null);
                Grupo grupo2 = new Grupo(2,6,5,null,null,jose.getNombre()+" "+jose.getApellido()
                        ,null);

                Materia algebra_lineal = new Materia("Álgebra lineal",4,null,null,null);
                Materia programacion_orientada_a_objetos = new Materia("Programación orientada a objetos",4,
                        null,null,null);

                HorariosClases horario1 = new HorariosClases(null,null,null);
                HorariosClases horario2 = new HorariosClases(null,null,null);

                ProgramaAcademico ingenieria_de_sistemas = new ProgramaAcademico(true,false,false,false,101447,
                        "Ingenieria de sistemas y computación", 10,null);
                ProgramaAcademico redes_de_telecomunicaciones = new ProgramaAcademico(false,false,true,false,6998,
                        "Especialización en redes de telecomunicaciones", 8,null);

                InformacionFinanciera estatus1 = new InformacionFinanciera(null,null,false,null);
                InformacionFinanciera estatus2 = new InformacionFinanciera(null,null,false,null);

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
                if(seleccion == 2){
                        switch (segunda_seleccion){
                                case 1:
                                        UI.imprimir_profesor(armando);
                                        break;
                                case 2:
                                        UI.imprimir_profesor(jose);
                                        break;
                                default:
                                        UI.error();
                        }

                }
                if(seleccion == 3){
                        switch (segunda_seleccion){
                                case 1:
                                        UI.imprimir_grupo(grupo1);
                                        break;
                                case 2:
                                        UI.imprimir_grupo(grupo2);
                                        break;
                                default:
                                        UI.error();
                        }

                }
                if(seleccion == 4){
                        switch (segunda_seleccion){
                                case 1:
                                        UI.imprimir_materia(algebra_lineal);
                                        break;
                                case 2:
                                        UI.imprimir_materia(programacion_orientada_a_objetos);
                                        break;
                                default:
                                        UI.error();
                        }

                }
                if(seleccion == 5){
                        switch (segunda_seleccion){
                                case 1:
                                        UI.imprimir_programa_academico(ingenieria_de_sistemas);
                                        break;
                                case 2:
                                        UI.imprimir_programa_academico(redes_de_telecomunicaciones);
                                        break;
                                default:
                                        UI.error();
                        }

                }
                if(seleccion == 6){
                        switch (segunda_seleccion){
                                case 1:
                                        UI.imprimir_horario(horario1);
                                        break;
                                case 2:
                                        UI.imprimir_horario(horario2);
                                        break;
                                default:
                                        UI.error();
                        }

                }
                if(seleccion == 7){
                        switch (segunda_seleccion){
                                case 1:
                                        UI.imprimir_info_financiera(estatus1);
                                        break;
                                case 2:
                                        UI.imprimir_info_financiera(estatus2);
                                        break;
                                default:
                                        UI.error();
                        }

                }



        }

}

