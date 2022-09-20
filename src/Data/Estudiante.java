package Data;
import javax.crypto.AEADBadTagException;
import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private int documento;
    private String correo;
    private String direccion;
    private long numero_telefono;
    private  Profesor tutor;
    private  ProgramaAcademico programa_academico;
    private  ArrayList<Grupo> grupos;
    private  InformacionFinanciera info_financiera;


    public Estudiante(String nombre, int documento, String correo, String direccion, long numero_telefono, Profesor tutor,ProgramaAcademico prog_aca,
                      ArrayList<Grupo> grupos, InformacionFinanciera info_financiera){
        this.setNombre(nombre);
        this.setDocumento(documento);
        this.setCorreo(correo);
        this.setDireccion(direccion);
        this.setNumero_telefono(numero_telefono);
        this.setTutor(tutor);
        this.setPrograma_academico(prog_aca);
        this.setGrupo(grupos);
        this.setInfo_financiera(info_financiera);
    }
    public Estudiante(String nombre, int documento, String correo, String direccion, long numero_telefono){
        this.setNombre(nombre);
        this.setDocumento(documento);
        this.setCorreo(correo);
        this.setDireccion(direccion);
        this.setNumero_telefono(numero_telefono);


    }
     public Estudiante(String nombre, int documento, String correo){
         this.setNombre(nombre);
         this.setDocumento(documento);
         this.setCorreo(correo);
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
        return "---------------------------------------------------------------"+
                "\n\tmi nombre es " + this.getNombre() +
                "\n\tmi documento de identidad es " + this.getDocumento() +
                "\n\tmi direccion es " + this.getDireccion() +
                "\n\tmi numero_telefono es " + this.getNumero_telefono() +
                "\n\testoy estudiando " + this.programa_academico.getEstudios() + " en " + this.programa_academico.getNombre() +
                "\n\tmi tutor es " + this.tutor.getNombre() +
                "\n\tpertenezco a los grupos " + this.grupos +
                "\n\tmi estado financiero es " + this.info_financiera.getEstado_cuenta() +
                "\n";
    }
}
