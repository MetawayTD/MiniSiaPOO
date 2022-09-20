package Data;

import java.util.ArrayList;

public class Profesor {

    private String nombre;
    private String correo;
    private ArrayList<String> titulos;
    private String categoria;
    private String departamento;
    private  ArrayList<Estudiante> encargados;
    private  ArrayList<Grupo> grupos_a_cargo;

    public Profesor(String nombre,String correo, ArrayList<String> titulos, String categoria, String departamento,
                    ArrayList<Estudiante> encargados, ArrayList<Grupo> grupos_a_cargo) {
        this.setNombre(nombre);
        this.setCorreo(correo);
        this.setTitulos(titulos);
        this.setCategoria(categoria);
        this.setDepartamento(departamento);
        this.setEncargados(encargados);
        this.setGrupos_a_cargo(grupos_a_cargo);
    }
    public Profesor(String nombre,String correo, ArrayList<String> titulos, String categoria, String departamento){
        this.setNombre(nombre);
        this.setCorreo(correo);
        this.setTitulos(titulos);
        this.setCategoria(categoria);
        this.setDepartamento(departamento);
    }
    public Profesor(String nombre,String correo, ArrayList<String> titulos){
        this.setNombre(nombre);
        this.setCorreo(correo);
        this.setTitulos(titulos);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Estudiante> getEncargados() {
        return encargados;
    }

    public void setEncargados(ArrayList<Estudiante> encargados) {
        this.encargados = encargados;
    }

    public ArrayList<Grupo> getGrupos_a_cargo() {
        return grupos_a_cargo;
    }

    public void setGrupos_a_cargo(ArrayList<Grupo> grupos_a_cargo) {
        this.grupos_a_cargo = grupos_a_cargo;
    }

    public ArrayList<String> getnombresEncargados(){
        ArrayList<String> nombres = new ArrayList<>();
        if(getEncargados()!=null) {
            for (int i = 0; i < this.getEncargados().size(); i++) {
                nombres.add(this.getEncargados().get(i).getNombre());
            }
            return nombres;
        }
        return null;
    }

    public ArrayList<Integer> getNumerosGruposACargo(){
        ArrayList<Integer> numeros = new ArrayList<>();
        if(getGrupos_a_cargo()!=null) {
            for (int i = 0; i < this.getGrupos_a_cargo().size(); i++) {
                numeros.add(this.getGrupos_a_cargo().get(i).getNumero());
            }
            return numeros;
        }
        return null;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------"+
                "\n\tMi nombre es " + this.getNombre() +
                "\n\tTengo estos titulos " + this.getTitulos() +
                "\n\tSoy " + this.getCategoria() +
                "\n\tPertenezco al departamento de " + this.getDepartamento() +
                "\n\tLos estudiantes a mi cargo son " + this.getnombresEncargados() +
                "\n\tEnseño en estos grupos " + this.getNumerosGruposACargo();
    }
}

