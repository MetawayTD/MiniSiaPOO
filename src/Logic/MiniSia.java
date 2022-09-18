package Logic;
import Data.*;
import UI.UI;

import java.util.ArrayList;
import java.util.List;

public class MiniSia {

        public static void main(String[] args){
                String direccion_martin = "Cra 94 B #42F 46 SUR";

                Estudiante martin = new Estudiante("Martin","Moreno",1034657217,00000,direccion_martin,3103017732l,
                        "O+",null,null,null);

                ArrayList<String> titulos_jose = new ArrayList<String>();
                titulos_jose.add("Pregrado en ingenieria de sistemas");
                titulos_jose.add("Doctorado en redes");

                Profesor Jose = new Profesor("Jose","Jose",1111,titulos_jose,"Planta","Aulas de ingenieria 233",
                        null,null);

                System.out.println(martin);
                System.out.println(Jose);
                /*
                UI.bienvedida();
                UI.menu();
                UI.seleccionar();

                 */
                }

        }

