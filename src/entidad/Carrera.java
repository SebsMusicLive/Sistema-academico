import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class Carrera {

     private String codigoCarrera;
    private String nombre;
    private int duracion; // Duración en semestres
    private Departamento departamento;
    private List<String> mallaCurricular;

    // Constructor vacío
    public Carrera() {
        this.mallaCurricular = new ArrayList<>();
    }

    // Constructor con parámetros
    public Carrera(String codigoCarrera, String nombre, int duracion, Departamento departamento) {
        this.codigoCarrera = codigoCarrera;
        this.nombre = nombre;
        setDuracion(duracion);
        this.departamento = departamento;
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
        if (duracion > 0) {
            this.duracion = duracion;
        } else {
            System.out.println("Error: La duración debe ser mayor a 0.");
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<String> getMallaCurricular() {
        return mallaCurricular;
    }

    // Métodos de gestión de carrera
    public void agregarCarrera() {
        System.out.println("Carrera '" + nombre + "' agregada correctamente.");
    }

    public void modificarCarrera(String nuevoNombre, int nuevaDuracion, Departamento nuevoDepartamento) {
        this.nombre = nuevoNombre;
        setDuracion(nuevaDuracion);
        this.departamento = nuevoDepartamento;
        System.out.println("Carrera actualizada: " + nombre);
    }

    public void eliminarCarrera() {
        System.out.println("Carrera '" + nombre + "' eliminada.");
    }

    public void actualizarMallaCurricular(String materia) {
        if (!mallaCurricular.contains(materia)) {
            mallaCurricular.add(materia);
            System.out.println("Materia '" + materia + "' añadida a la malla curricular de " + nombre);
        } else {
            System.out.println("La materia ya está en la malla curricular.");
        }
    }

    public void mostrarMallaCurricular() {
        System.out.println("Malla curricular de la carrera " + nombre + ":");
        if (mallaCurricular.isEmpty()) {
            System.out.println("No hay materias registradas.");
        } else {
            for (String materia : mallaCurricular) {
                System.out.println("- " + materia);
            }
        }
    }

}