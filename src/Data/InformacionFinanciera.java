package Data;

public class InformacionFinanciera {

    private String estado_cuenta;
    private String periodo_academico;
    private  Estudiante estudiante;

    public InformacionFinanciera(String estado_cuenta,String periodo_academico, Estudiante estudiante) {
        this.setEstado_cuenta(estado_cuenta);
        this.setPeriodo_academico(periodo_academico);
        this.setEstudiante(estudiante);
    }
    public InformacionFinanciera(String estado_cuenta, String periodo_academico){
        this.setEstado_cuenta(estado_cuenta);
        this.setPeriodo_academico(periodo_academico);
    }
    public InformacionFinanciera(String estado_cuenta) {
        this.setEstado_cuenta(estado_cuenta);
    }



    public String getPeriodo_academico() {
        return periodo_academico;
    }

    public void setPeriodo_academico(String periodo_academico) {
        this.periodo_academico = periodo_academico;
    }

    public String getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(String estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return  "Esta información corresponde al periodo_academico '" + this.getPeriodo_academico() +
                ", el estado financiero es " + this.getEstado_cuenta() +
                ", que corresponde al estudiante " + this.getEstudiante();
    }
}