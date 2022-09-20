package Logic;
import Data.*;
import UI.UI;
import java.util.ArrayList;

public class MiniSia {
        public static void main(String[] args){

                ArrayList<String> titulos_jose = new ArrayList<String>();
                titulos_jose.add("Pregrado matemáticas");
                titulos_jose.add("Maestria matemáticas");

                ArrayList<String> titulos_luis = new ArrayList<String>();
                titulos_luis.add("Pregrado ingenieria de sistemas");
                titulos_luis.add("Maestria redes telecomunicaciones");

                ArrayList<String> requisitos_lineal = new ArrayList<String>();
                requisitos_lineal.add("Cálculo diferencial");

                ArrayList<String> requisitos_poo = new ArrayList<String>();
                requisitos_poo.add("Programación de computadores");

                ArrayList<String> dias_lunes = new ArrayList<String>();
                dias_lunes.add("Lunes");
                dias_lunes.add("Miercoles");

                ArrayList<String> dias_martes = new ArrayList<String>();
                dias_martes.add("Martes");
                dias_martes.add("Jueves");
                //------------------------------------------------------------------------------------------------------objetos
                Estudiante pepito = new Estudiante("Pepito Rodriguez",1034657217,"pepito@unal.edu.co");
                Estudiante ana = new Estudiante("Ana Martinez",1111111111,"ana@unal.edu.co");

                Profesor jose = new Profesor("Jose Diaz","JoseD@unal.edu.co",titulos_jose);
                Profesor luis = new Profesor("Luis Velasco","LuisV@unal.edu.co",titulos_luis);

                Grupo grupo_lineal = new Grupo(15,4);
                Grupo grupo_poo = new Grupo(5,4);

                Materia algebra_lineal = new Materia("Álgebra lineal",4,requisitos_lineal);
                Materia poo = new Materia("Programación orientada a objetos",4,requisitos_poo);

                ProgramaAcademico ing_sistemas = new ProgramaAcademico("Pregrado","Ingenieria de sistemas y computación");
                ProgramaAcademico ing_mecatrónica = new ProgramaAcademico("Pregrado","Ingenieria mecatrónica");

                InformacionFinanciera pagado = new InformacionFinanciera("Al dia");
                InformacionFinanciera moroso = new InformacionFinanciera("Atrasado");

                HorariosClases lunes_miercoles = new HorariosClases(dias_lunes);
                HorariosClases martes_jueves = new HorariosClases(dias_martes);
                //------------------------------------------------------------------------------------------------------
                ArrayList<Grupo> grupos = new ArrayList<Grupo>();
                grupos.add(grupo_lineal);
                grupos.add(grupo_poo);
                //------------------------------------------------------------------------------------------------------terminar estudiantes
                pepito.setPrograma_academico(ing_sistemas);
                pepito.setTutor(jose);
                pepito.setInfo_financiera(pagado);
                pepito.setDireccion("CRA 94B #42F-46SUR");
                pepito.setNumero_telefono(3103107732l);
                pepito.setGrupo(grupos);

                ana.setPrograma_academico(ing_mecatrónica);
                ana.setTutor(luis);
                ana.setInfo_financiera(moroso);
                ana.setDireccion("CALLE 100 #55-40");
                ana.setNumero_telefono(3148000554l);
                ana.setGrupo(grupos);

                //------------------------------------------------------------------------------------------------------terminar grupos
                grupo_lineal.setMateria(algebra_lineal);
                grupo_lineal.setProfesor(jose);
                grupo_lineal.setHorario(lunes_miercoles);

                grupo_poo.setMateria(poo);
                grupo_poo.setProfesor(luis);
                grupo_poo.setHorario(martes_jueves);
                //------------------------------------------------------------------------------------------------------terminar profes
                jose.setCategoria("Profesor de planta");
                jose.setDepartamento("Matemáticas");

                luis.setCategoria("Profesor vecario");
                luis.setDepartamento("Ingeniera de sistemas e industrial");
                //------------------------------------------------------------------------------------------------------
                ArrayList<String> horas = new ArrayList<>();
                horas.add("9am-11am");
                //------------------------------------------------------------------------------------------------------terminar horarios
                ArrayList<String> temas_lineal = new ArrayList<>();
                temas_lineal.add("Matrices");
                temas_lineal.add("Vectores");
                temas_lineal.add("Espacios vectoriales");

                ArrayList<String> temas_poo = new ArrayList<>();
                temas_poo.add("Objetos");
                temas_poo.add("Relaciones entre objetos");
                temas_poo.add("GUI");
                //------------------------------------------------------------------------------------------------------completar materias
                algebra_lineal.setTemas(temas_lineal);

                poo.setTemas(temas_poo);
                //------------------------------------------------------------------------------------------------------completar programa
                ing_sistemas.setSemestres(10);

                ing_mecatrónica.setSemestres(10);
                //-------------------------------------------------------------------------------------------------------completar infofinanciera
                pagado.setPeriodo_academico("2022-2");
                pagado.setEstudiante(pepito);

                moroso.setPeriodo_academico("2022-2");
                moroso.setEstudiante(ana);
                //-----------------------------------------------------------------------------------------------------------
                lunes_miercoles.setHoras(horas);
                martes_jueves.setHoras(horas);

                UI.bienvedida();
                UI.menu();
                int seleccion = UI.seleccionar();

                switch (seleccion){
                        case 1:
                                UI.Imprimir_estudiantes(pepito,ana);
                                break;
                        case 2:
                                UI.Imprimir_profesores(jose,luis);
                                break;
                        case 3:
                                UI.Imprimir_grupos(grupo_lineal,grupo_poo);
                                break;
                        case 4:
                                UI.Imprimir_materias(algebra_lineal,poo);
                                break;
                        case 5:
                                UI.Imprimir_programa_acamademico(ing_sistemas,ing_mecatrónica);
                                break;
                        case 6:
                                UI.Imprimir_horarios(lunes_miercoles,martes_jueves);
                                break;
                        case 7:
                                UI.Imprimir_info_financiera(pagado,moroso);
                                break;
                        default:
                                UI.error();
                }
        }

}