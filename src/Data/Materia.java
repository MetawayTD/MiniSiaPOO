package Data;

import java.util.List;

public class Materia {

    private String nombre;
    private int numero_creditos;
    private List<String> prerrequisitos;
    private List<String> temas;
    private List<Grupo> grupos;

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

    public List<String> getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(List<String> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }

    public List<String> getTemas() {
        return temas;
    }

    public void setTemas(List<String> temas) {
        this.temas = temas;
    }


    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", numero_creditos=" + numero_creditos +
                ", prerrequisitos=" + prerrequisitos +
                ", temas=" + temas +
                ", grupos=" + grupos +
                '}';
    }
}