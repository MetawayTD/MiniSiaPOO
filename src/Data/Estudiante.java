package Data;
import java.util.Arrays;
import java.util.List;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int documento;
    private int codigo;
    private String direccion;
    private double [] notas;
    private long numero_telefono;
    private String tipo_sangre;
    private ProgramaAcademico programa_academico;
    private Profesor tutor;
    private List<Grupo> grupos;
    private InformacionFinanciera info_financiera;

    public Estudiante(String nombre,String apellido, int documento, int codigo, String direccion, double [] notas, long numero_telefono, String tipo_sangre,
                      Profesor tutor,List<Grupo> grupos, InformacionFinanciera info_financiera){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDocumento(documento);
        this.setCodigo(codigo);
        this.setDireccion(direccion);
        this.setNotas(notas);
        this.setNumero_telefono(numero_telefono);
        this.setTipo_sangre(tipo_sangre);
        this.setTutor(tutor);
        this.setGrupo(grupos);
        this.setInfo_financiera(info_financiera);

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double [] getNotas() {
        return notas;
    }

    public void setNotas(double [] notas) {
        this.notas = notas;
    }

    public long getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(long numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public ProgramaAcademico getPrograma_academico() {
        return programa_academico;
    }

    public void setPrograma_academico(ProgramaAcademico programa_academico) {
        this.programa_academico = programa_academico;
    }

    public Profesor getTutor() {
        return tutor;
    }

        public void setTutor(Profesor tutor) {
            this.tutor = tutor;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupo(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public InformacionFinanciera getInfo_financiera() {
        return info_financiera;
    }

    public void setInfo_financiera(InformacionFinanciera info_financiera) {
        this.info_financiera = info_financiera;
    }


    @Override
    public String toString() {
        return "Estudiante{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", documento=" + documento +
                ", codigo=" + codigo + ", direccion='" + direccion + '\'' + ", notas=" + Arrays.toString(notas) + ", numero_telefono=" + numero_telefono +
                ", tipo_sangre='" + tipo_sangre + '\'' + ", programa_academico=" + programa_academico + ", tutor=" + tutor +
                ", grupos=" + grupos + ", info_financiera=" + info_financiera +
                '}';
    }
}
