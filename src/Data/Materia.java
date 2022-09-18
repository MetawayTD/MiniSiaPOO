package Data;

import java.util.List;

public class Materia {

    private String nombre;
    private int numero_creditos;
    private List<String> prerrequisitos;
    private List<String> temas;
    private List<Grupo> grupos;

    public Materia(String nombre, int numero_creditos, List<String> prerrequisitos, List<String> temas, List<Grupo> grupos) {
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
                "\nnombre=' " + nombre +
                "\nnumero_creditos= " + numero_creditos +
                "\nprerrequisitos= " + prerrequisitos +
                "\ntemas= " + temas +
                "\ngrupos= " + grupos +
                '}';
    }
}