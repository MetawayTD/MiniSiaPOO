package Data;

import java.util.ArrayList;

public class ProgramaAcademico {

    private String estudios;
    private String nombre;
    private int semestres;
    private ArrayList<Estudiante> estudiante;

    public ProgramaAcademico(String estudios, String nombre, int semestres, ArrayList<Estudiante> estudiante) {

        this.setEstudios(estudios);

        this.setNombre(nombre);
        this.setSemestres(semestres);
        this.setEstudiante(estudiante);
    }

    public String getEstudios(){
        return estudios;
    }
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "El programa académico es " + estudios +
                ", se llama " + nombre +
                ", tiene una duración de " + semestres + " semestres" +
                " lo cursan " + estudiante;
    }
}

