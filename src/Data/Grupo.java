package Data;
import java.util.ArrayList;

public class Grupo {

    private int numero;
    private int carga_horaria;
    private  Materia materia;
    private  Profesor profesor;
    private  ArrayList<Estudiante> lista_estudiantes;
    private  HorariosClases horario;

    public Grupo(int numero, int carga_horaria, Materia materia,Profesor profesor,ArrayList<Estudiante> lista_estudiantes,HorariosClases horario){
        this.setNumero(numero);
        this.setCargaHoraria(carga_horaria);
        this.setMateria(materia);
        this.setProfesor(profesor);
        this.setLista_estudiantes(lista_estudiantes);
        this.setHorario(horario);
    }
    public Grupo(int numero, int carga_horaria, Materia materia){
        this.setNumero(numero);
        this.setCargaHoraria(carga_horaria);
        this.setMateria(materia);
        this.setProfesor(profesor);
    }
    public Grupo(int numero, int carga_horaria){
        this.setNumero(numero);
        this.setCargaHoraria(carga_horaria);
        this.setMateria(materia);

    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCargaHoraria() {
        return carga_horaria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.carga_horaria = cargaHoraria;
    }

    public Materia getMateria(){
        return materia;
    }

    public void setMateria(Materia materia){
        this.materia = materia;
    }

    public ArrayList<Estudiante> getLista_estudiantes(){
        return lista_estudiantes;
    }

    public void setLista_estudiantes(ArrayList<Estudiante> lista_estudiantes){
        this.lista_estudiantes = lista_estudiantes;
    }

    public Profesor getProfesor(){
        return profesor;
    }
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }

    public HorariosClases getHorario() {
        return horario;
    }

    public  void setHorario(HorariosClases horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------"+
                "\n\tEl numero del grupo es " + this.getNumero() +
                "\n\trequiere " + this.getCargaHoraria() + " horas a la semana " +
                "\n\tcorresponde a la materia de " + this.materia.getNombre() +
                "\n\tEsta formado por estos estudiantes " + this.getLista_estudiantes() +
                "\n\tEl docente encargado del grupo es " + this.profesor.getNombre() +
                "\n\tSu horario es en los dias " + this.horario.getDias() + " a las " + this.horario.getHoras();

    }
}