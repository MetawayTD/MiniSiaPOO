package Data;
import java.util.List;

public class Grupo {

    private int numero;
    private int carga_horaria;
    private int cantidad_estudiantes;
    private Materia materia;
    private List<Estudiante> lista_estudiantes;
    private Profesor profesor;
    private HorariosClases horario;

    public Grupo(int numero, int carga_horaria, int cantidad_estudiantes, Materia materia,List<Estudiante> lista_estudiantes,Profesor profesor,HorariosClases horario){
        this.setNumero(numero);
        this.setCargaHoraria(carga_horaria);
        this.setCantidadEstudiantes(cantidad_estudiantes);
        this.setMateria(materia);
        this.setLista_estudiantes(lista_estudiantes);
        this.setProfesor(profesor);
        this.setHorario(horario);
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

    public int getCantidadEstudiantes() {
        return cantidad_estudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidad_estudiantes = cantidadEstudiantes;
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
        return "Grupo{" +
                "\nnumero= " + numero +
                "\ncarga_horaria= " + carga_horaria +
                "\ncantidad_estudiantes= " + cantidad_estudiantes +
                "\nmateria= " + materia +
                "\nlista_estudiantes= " + lista_estudiantes +
                "\nprofesor= " + profesor +
                "\nhorario= " + horario +
                '}';
    }
}