package Data;

public class ProgramaAcademico {

    private boolean pregrado;
    private boolean maestria;
    private boolean especializacion;
    private boolean doctorado;
    private int codigo;
    private String nombre;
    private int semestres;
    private Estudiante estudiante;


    public boolean isPregrado() {
        return pregrado;
    }

    public void setPregrado(boolean pregrado) {
        this.pregrado = pregrado;
    }

    public boolean isMaestria() {
        return maestria;
    }

    public void setMaestria(boolean maestria) {
        this.maestria = maestria;
    }

    public boolean isEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(boolean especializacion) {
        this.especializacion = especializacion;
    }

    public boolean isDoctorado() {
        return doctorado;
    }

    public void setDoctorado(boolean doctorado) {
        this.doctorado = doctorado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "ProgramaAcademico{" +
                "pregrado=" + pregrado +
                ", maestria=" + maestria +
                ", especializacion=" + especializacion +
                ", doctorado=" + doctorado +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", semestres=" + semestres +
                ", estudiante=" + estudiante +
                '}';
    }
}

