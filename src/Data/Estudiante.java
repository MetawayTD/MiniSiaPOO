package Data;
import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private int documento;
    private String correo;
    private String direccion;
    private long numero_telefono;
    private String tipo_sangre;
    private ProgramaAcademico programa_academico;
    private Profesor tutor;
    private ArrayList<Grupo> grupos;
    private InformacionFinanciera info_financiera;


    public Estudiante(String nombre, int documento, String correo, String direccion, long numero_telefono, String tipo_sangre,
                      Profesor tutor, ArrayList<Grupo> grupos, InformacionFinanciera info_financiera){
        this.setNombre(nombre);
        this.setDocumento(documento);
        this.setCorreo(correo);
        this.setDireccion(direccion);
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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupo(ArrayList<Grupo> grupos) {
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
        return "Estudiante{" +
                "\nnombre= '" + nombre +
                "'\ndocumento= " + documento +
                "\ndireccion= '" + direccion +
                "'\nnumero_telefono= " + numero_telefono +
                "\ntipo_sangre= '" + tipo_sangre +
                "'\nprograma_academico= " + programa_academico +
                "\ntutor= " + tutor +
                "\ngrupos= " + grupos +

                "\ninfo_financiera= " + info_financiera +
                '}';
    }
}
