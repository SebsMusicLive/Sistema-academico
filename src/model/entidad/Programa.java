
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Programa {
    private String codigo_programa;
    private String nombre;
    private String descripcion;
    private Carrera codigo_carrera;
    private List<Curso> cursos;

    public Programa() {
        this.cursos = new ArrayList<>();
    }

    public String getCodigo_programa() {
        return codigo_programa;
    }

    public void setCodigo_programa(String codigo_programa) {
        this.codigo_programa = codigo_programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Carrera getCodigoCarrera() {
        return codigo_carrera;
    }

    public void setCodigoCarrera(Carrera codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public void registrarPrograma() {
        System.out.println("Programa " + nombre + " registrado exitosamente.");
    }

    public void eliminarPrograma() {
        System.out.println("Programa " + nombre + " eliminado exitosamente.");
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso agregado al programa " + nombre);
    }

    public void actualizarContenidos() {
        System.out.println("Contenidos del programa " + nombre + " actualizados.");
    }
}