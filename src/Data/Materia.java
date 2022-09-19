package Data;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private int numero_creditos;
    private ArrayList<String> prerrequisitos;
    private ArrayList<String> temas;
    private ArrayList<Grupo> grupos;

    public Materia(String nombre, int numero_creditos, ArrayList<String> prerrequisitos, ArrayList<String> temas, ArrayList<Grupo> grupos) {
        this.setNombre(nombre);
        this.setNumero_creditos(numero_creditos);
        this.setPrerrequisitos(prerrequisitos);
        this.setTemas(temas);
        this.setGrupos(grupos);
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

    @Override
    public String toString() {
        return  "El nombre de esta materia es " + nombre +
                ", cuenta con " + numero_creditos + "créditos"+
                ", requiere se se hayan aprobado estas materias anteriormente " + prerrequisitos +
                ", se veran los temas " + temas +
                ", se enseña en los grupos " + grupos;
    }
}