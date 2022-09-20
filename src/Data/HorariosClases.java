package Data;
import java.util.ArrayList;

public class HorariosClases {

    private ArrayList<String> dias;
    private ArrayList<String>  horas;
    private  ArrayList<Grupo> grupos;

    public HorariosClases(ArrayList<String> dias,ArrayList<String> horas,ArrayList<Grupo> grupos) {
        this.setDias(dias);
        this.setHoras(horas);
        this.setGrupos(grupos);
    }
    public HorariosClases(ArrayList<String> dias,ArrayList<String> horas){
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

    public ArrayList<String>  getHoras() {
        return horas;
    }

    public void setHoras(ArrayList<String>  horas) {
        this.horas = horas;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Integer> getNumerosGrupos(){
        ArrayList<Integer> numeros = new ArrayList<>();
        if(getGrupos()!=null) {
            for (int i = 0; i < this.getGrupos().size(); i++) {
                numeros.add(this.getGrupos().get(i).getNumero());
            }
            return numeros;
        }
        return null;
    }


    @Override
    public String toString() {
        return "---------------------------------------------------------------"+
                "\n\tEn este horario hay clases los dias " + this.getDias()+
                "\n\tA estas horas " + this.getHoras() +
                "\n\tCorresponde a los grupos " + this.getNumerosGrupos();
    }
}

