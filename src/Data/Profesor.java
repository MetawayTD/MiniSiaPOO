package Data;

import java.util.List;

public class Profesor {

    private String nombre;
    private String apellido;
    private int codigo;
    private List<String> titulos;
    private String categoria;
    private String ubicacion_oficina;
    private List<Estudiante> encargados;
    private List<Grupo> grupos_a_cargo;

    public Profesor(String nombre, String apellido, int codigo, List<String> titulos, String categoria, String ubicacion_oficina,
                    List<Estudiante> encargados, List<Grupo> grupos_a_cargo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCodigo(codigo);
        this.setTitulos(titulos);
        this.setCategoria(categoria);
        this.setUbicacion_oficina(ubicacion_oficina);
        this.setEncargados(encargados);
        this.setGrupos_a_cargo(grupos_a_cargo);
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<String> titulos) {
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
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo=" + codigo +
                ", titulos=" + titulos +
                ", categoria='" + categoria + '\'' +
                ", ubicacion_oficina='" + ubicacion_oficina + '\'' +
                ", encargados=" + encargados +
                ", grupos_a_cargo=" + grupos_a_cargo +
                '}';
    }
}

