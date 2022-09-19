package Data;
import java.util.ArrayList;

public class HorariosClases {

    private ArrayList<String> dias;
    private ArrayList<Integer>  horas;
    private ArrayList<Grupo> grupos;

    public HorariosClases(ArrayList<String> dias,ArrayList<Integer> horas,ArrayList<Grupo> grupos) {
        this.setDias(dias);
        this.setHoras(horas);
        this.setGrupos(grupos);
    }
    public HorariosClases(ArrayList<String> dias,ArrayList<Integer> horas){
        this.setDias(dias);
        this.setHoras(horas);
    }
    public HorariosClases(ArrayList<String> dias){
        this.setDias(dias);
    }


    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    public ArrayList<Integer>  getHoras() {
        return horas;
    }

    public void setHoras(ArrayList<Integer>  horas) {
        this.horas = horas;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "En este horario hay clases los dias " + dias+
                ", a las " + horas +
                "y corresponde a los grupos " + grupos;
    }
}

