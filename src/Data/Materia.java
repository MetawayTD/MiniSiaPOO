package Data;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private int numero_creditos;
    private  ArrayList<String> prerrequisitos;
    private  ArrayList<String> temas;
    private  ArrayList<Grupo> grupos;

    public Materia(String nombre, int numero_creditos, ArrayList<String> prerrequisitos, ArrayList<String> temas, ArrayList<Grupo> grupos) {
        this.setNombre(nombre);
        this.setNumero_creditos(numero_creditos);
        this.setPrerrequisitos(prerrequisitos);
        this.setTemas(temas);
        this.setGrupos(grupos);
    }
    public Materia(String nombre, int numero_creditos, ArrayList<String> prerrequisitos, ArrayList<String> temas){
        this.setNombre(nombre);
        this.setNumero_creditos(numero_creditos);
        this.setPrerrequisitos(prerrequisitos);
        this.setTemas(temas);
    }
    public Materia(String nombre, int numero_creditos, ArrayList<String> prerrequisitos){
        this.setNombre(nombre);
        this.setNumero_creditos(numero_creditos);
        this.setPrerrequisitos(prerrequisitos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    public void setNumero_creditos(int numero_creditos) {
        this.numero_creditos = numero_creditos;
    }

    public ArrayList<String> getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(ArrayList<String> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }

    public ArrayList<String> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<String> temas) {
        this.temas = temas;
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
        return  "---------------------------------------------------------------"+
                "\n\tEl nombre de esta materia es " + this.getNombre() +
                "\n\tCuenta con " + this.getNumero_creditos() + " créditos "+
                "\n\tRequiere se se hayan aprobado estas materias anteriormente " + this.getPrerrequisitos() +
                "\n\tSe veran los temas " + this.getTemas() +
                "\n\tSe enseña en los grupos " +this.getNumerosGrupos();
    }
}