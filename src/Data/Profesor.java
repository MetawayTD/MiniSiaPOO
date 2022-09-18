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



}

