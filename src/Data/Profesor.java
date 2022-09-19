package Data;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String nombre;
    private String correo;
    private ArrayList<String> titulos;
    private String categoria;
    private String ubicacion_oficina;
    private List<Estudiante> encargados;
    private List<Grupo> grupos_a_cargo;

    public Profesor(String nombre,String correo, ArrayList<String> titulos, String categoria, String ubicacion_oficina,
                    List<Estudiante> encargados, List<Grupo> grupos_a_cargo) {
        this.setNombre(nombre);
        this.setCodigo(correo);
        this.setTitulos(titulos);
        this.setCategoria(categoria);
        this.setUbicacion_oficina(ubicacion_oficina);
        this.setEncargados(encargados);
        this.setGrupos_a_cargo(grupos_a_cargo);
    }
    public Profesor(String nombre,String correo, ArrayList<String> titulos, String categoria, String ubicacion_oficina){
        this.setNombre(nombre);
        this.setCodigo(correo);
        this.setTitulos(titulos);
        this.setCategoria(categoria);
        this.setUbicacion_oficina(ubicacion_oficina);
    }
    public Profesor(String nombre,String correo, ArrayList<String> titulos){
        this.setNombre(nombre);
        this.setCodigo(correo);
        this.setTitulos(titulos);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return correo;
    }

    public void setCodigo(String correo) {
        this.correo = correo;
    }

    public List<String> getTitulos() {
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

    public String getUbicacion_oficina() {
        return ubicacion_oficina;
    }

    public void setUbicacion_oficina(String ubicacion_oficina) {
        this.ubicacion_oficina = ubicacion_oficina;
    }

    public List<Estudiante> getEncargados() {
        return encargados;
    }

    public void setEncargados(List<Estudiante> encargados) {
        this.encargados = encargados;
    }

    public List<Grupo> getGrupos_a_cargo() {
        return grupos_a_cargo;
    }

    public void setGrupos_a_cargo(List<Grupo> grupos_a_cargo) {
        this.grupos_a_cargo = grupos_a_cargo;
    }

    @Override
    public String toString() {
        return "Mi nombre es" + nombre +
                ", tengo estos titulos=" + titulos +
                ", soy " + categoria +
                ", la ubicación de mi oficina es " + ubicacion_oficina +
                ", los estudiantes a mi cargo son " + encargados +
                "y enseño en estos grupos " + grupos_a_cargo;
    }
}

