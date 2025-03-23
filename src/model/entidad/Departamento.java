package entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Departamento {

    private String codigoDepartamento;
    private String nombre;
    private Facultad codigoFacultad;
    private List<Docente> docentes; // Lista de docentes en el departamento

    public Departamento() {
        this.docentes = new ArrayList<>();
    }

    public Departamento(String codigoDepartamento, String nombre, Facultad codigoFacultad) {
        this.codigoDepartamento = codigoDepartamento;
        this.nombre = nombre;
        this.codigoFacultad = codigoFacultad;
        this.docentes = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(Facultad codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    // Métodos funcionales
    public void agregarDepartamento() {
        System.out.println("Departamento '" + nombre + "' agregado con éxito.");
    }

    public void modificarDepartamento(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("Departamento actualizado a: " + nuevoNombre);
    }

    public void eliminarDepartamento() {
        System.out.println("Departamento '" + nombre + "' eliminado.");
    }

    public void asignarDocente(Docente docente) {
        if (docente != null) {
            docentes.add(docente);
            System.out.println("Docente " + docente.getNombre() + " asignado al departamento " + nombre);
        } else {
            System.out.println("No se puede asignar un docente nulo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Código de Departamento: " + codigoDepartamento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Facultad: " + (codigoFacultad != null ? codigoFacultad.getNombre() : "No asignada"));
        System.out.println("Docentes Asignados: " + (docentes.isEmpty() ? "Ninguno" : docentes.size()));
    }
}