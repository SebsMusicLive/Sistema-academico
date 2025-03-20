import java.util.ArrayList;
import java.util.List;


public class Facultad {
    private String codigoFacultad;
    private String nombre;
    private List<Departamento> departamentos;

    // Constructor vacío
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
        System.out.println("Facultad " + nombre + " agregada con éxito.");
    }

    public void modificarFacultad(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("Facultad modificada. Nuevo nombre: " + nuevoNombre);
    }

    public void eliminarFacultad() {
        System.out.println("Facultad " + nombre + " eliminada.");
    }

    public void crearDepartamento(String nombreDepartamento) {
        Departamento nuevoDepartamento = new Departamento();
        nuevoDepartamento.setNombre(nombreDepartamento);
        departamentos.add(nuevoDepartamento);
        System.out.println("Departamento " + nombreDepartamento + " agregado a la facultad " + nombre);
    }

    public String generarReporteEstadistico() {
        return "Reporte de Facultad: " + nombre + "\nCódigo: " + codigoFacultad + 
               "\nTotal de Departamentos: " + departamentos.size();
    }
}