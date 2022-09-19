package Data;
import java.util.List;

public class Grupo {

    private int numero;
    private int carga_horaria;
    private Materia materia;
    private List<Estudiante> lista_estudiantes;
    private Profesor profesor;
    private HorariosClases horario;

    public Grupo(int numero, int carga_horaria, Materia materia,Profesor profesor,List<Estudiante> lista_estudiantes,HorariosClases horario){
        this.setNumero(numero);
        this.setCargaHoraria(carga_horaria);
        this.setMateria(materia);
        this.setProfesor(profesor);
        this.setLista_estudiantes(lista_estudiantes);
        this.setHorario(horario);
    }
    public Grupo(int numero, int carga_horaria, Materia materia, Profesor profesor){
        this.setNumero(numero);
        this.setCargaHoraria(carga_horaria);
        this.setMateria(materia);
        this.setProfesor(profesor);
    }
    public Grupo(int numero, int carga_horaria, Materia materia){
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

    public List<Estudiante> getLista_estudiantes(){
        return lista_estudiantes;
    }

    public void setLista_estudiantes(List<Estudiante> lista_estudiantes){
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

    public void setHorario(HorariosClases horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "El numero del grupo es " + numero +
                ", requiere " + carga_horaria + "a la semana" +
                ", corresponde a la materia de " + materia +
                ", Esta formado por estos estudiantes " + lista_estudiantes +
                ", el docente encargado del grupo es " + profesor.getNombre() +
                " y su horario es en los dias " + horario.getDias() + "a las " + horario.getHoras();

    }
}