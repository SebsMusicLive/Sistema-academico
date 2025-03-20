import java.util.ArrayList;
import java.util.List;




public class Facultad {
    private String codigoFacultad;
    private String nombre;
    private List<Departamento> departamentos; // Lista de departamentos

    // Constructor por defecto
    public Facultad() {
        this.departamentos = new ArrayList<>();
    }

    // Constructor con parámetros
    public Facultad(String codigoFacultad, String nombre) {
        this.codigoFacultad = codigoFacultad;
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(String codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    // Métodos funcionales
    public void agregarFacultad() {
        System.out.println("Facultad '" + nombre + "' agregada con éxito.");
    }

    public void modificarFacultad(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("Facultad actualizada a: " + nuevoNombre);
    }

    public void eliminarFacultad() {
        System.out.println("Facultad '" + nombre + "' eliminada.");
    }

    public void crearDepartamento(String nombreDepartamento) {
        Departamento nuevoDepartamento = new Departamento("DPT-" + (departamentos.size() + 1), nombreDepartamento, this);
        departamentos.add(nuevoDepartamento);
        System.out.println("Departamento '" + nombreDepartamento + "' creado en la facultad '" + nombre + "'.");
    }

    public String generarReporteEstadistico() {
        return "Facultad: " + nombre + "\nNúmero de Departamentos: " + departamentos.size();
    }

    public void mostrarInformacion() {
        System.out.println("Código de Facultad: " + codigoFacultad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamentos: " + (departamentos.isEmpty() ? "Ninguno" : departamentos.size()));
    }
}
