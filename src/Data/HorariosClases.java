package Data;
import java.util.Arrays;
import java.util.List;

public class HorariosClases {

    private String [] dias;
    private int [] horas;
    private List<Grupo> grupos;

    public HorariosClases(String[] dias, int[] horas, List<Grupo> grupos) {
        this.setDias(dias);
        this.setHoras(horas);
        this.setGrupos(grupos);
    }


    public String [] getDias() {
        return dias;
    }

    public void setDias(String [] dias) {
        this.dias = dias;
    }

    public int [] getHoras() {
        return horas;
    }

    public void setHoras(int [] horas) {
        this.horas = horas;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "HorariosClases{" +
                "dias=" + Arrays.toString(dias) +
                ", horas=" + Arrays.toString(horas) +
                ", grupos=" + grupos +
                '}';
    }
}

