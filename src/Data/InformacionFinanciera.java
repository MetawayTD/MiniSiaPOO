package Data;

public class InformacionFinanciera {


    private String periodo_academico;
    private String estado_cuenta;
    private boolean recibo_pago;
    private Estudiante estudiante;

    public InformacionFinanciera(String periodo_academico, String estado_cuenta, boolean recibo_pago, Estudiante estudiante) {
        this.setPeriodo_academico(periodo_academico);
        this.setEstado_cuenta(estado_cuenta);
        this.setRecibo_pago(recibo_pago);
        this.setEstudiante(estudiante);
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

    public boolean isRecibo_pago() {
        return recibo_pago;
    }

    public void setRecibo_pago(boolean recibo_pago) {
        this.recibo_pago = recibo_pago;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "InformacionFinanciera{" +
                "periodo_academico='" + periodo_academico + '\'' +
                ", estado_cuenta='" + estado_cuenta + '\'' +
                ", recibo_pago=" + recibo_pago +
                ", estudiante=" + estudiante +
                '}';
    }
}