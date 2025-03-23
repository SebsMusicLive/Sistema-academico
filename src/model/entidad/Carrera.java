package entidad;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class Carrera {

     private String codigoCarrera;
    private String nombre;
    private int duracion;
    private Departamento codigoDepartamento;
    private List<Curso> mallaCurricular;

    public Carrera() {
        this.mallaCurricular = new ArrayList<>();
    }

    public Carrera(String codigoCarrera, String nombre, int duracion, Departamento codigoDepartamento) {
        this.codigoCarrera = codigoCarrera;
        this.nombre = nombre;
        this.duracion = duracion;
        this.codigoDepartamento = codigoDepartamento;
        this.mallaCurricular = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Departamento getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(Departamento codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public List<Curso> getMallaCurricular() {
        return mallaCurricular;
    }

    // Métodos funcionales
    public void agregarCarrera() {
        System.out.println("Carrera " + this.nombre + " agregada al sistema.");
    }

    public void modificarCarrera(String nuevoNombre, int nuevaDuracion) {
        this.nombre = nuevoNombre;
        this.duracion = nuevaDuracion;
        System.out.println("Carrera actualizada: " + this.nombre + " (Duración: " + this.duracion + " semestres).");
    }

    public void eliminarCarrera() {
        System.out.println("Carrera " + this.nombre + " eliminada del sistema.");
    }

    public void actualizarMallaCurricular(List<Curso> nuevaMalla) {
        this.mallaCurricular = nuevaMalla;
        System.out.println("Malla curricular de " + this.nombre + " actualizada.");
    }

    public void agregarCursoAMalla(Curso curso) {
        if (!mallaCurricular.contains(curso)) {
            mallaCurricular.add(curso);
            System.out.println("Curso " + curso.getNombre() + " agregado a la malla curricular de " + this.nombre);
        }
    }

    public void eliminarCursoDeMalla(Curso curso) {
        if (mallaCurricular.remove(curso)) {
            System.out.println("Curso " + curso.getNombre() + " eliminado de la malla curricular de " + this.nombre);
        } else {
            System.out.println("El curso no se encontró en la malla curricular.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Carrera: " + nombre);
        System.out.println("Código: " + codigoCarrera);
        System.out.println("Duración: " + duracion + " semestres");
        System.out.println("Departamento: " + (codigoDepartamento != null ? codigoDepartamento.getNombre() : "No asignado"));
        System.out.println("Cursos en la malla curricular:");
        for (Curso curso : mallaCurricular) {
            System.out.println(" - " + curso.getNombre());
        }
    }

}