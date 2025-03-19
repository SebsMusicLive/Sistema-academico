
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class Docente extends Persona {

    private String codigoDocente;
    private Departamento departamento;
    private String titulo;
    private String especializacion;
    private int cargaHoraria;
    private List<Curso> cursosAsignados;
    private List<Evaluacion> historialEvaluaciones;

    // Constructor vacío
    public Docente() {
        this.cursosAsignados = new ArrayList<>();
        this.historialEvaluaciones = new ArrayList<>();
    }

    // Constructor con parámetros
    public Docente(String documento, String tipoDocumento, String nombre, String correo, String telefono, 
                   String direccion, Date fechaNacimiento, String codigoDocente, Departamento departamento, 
                   String titulo, String especializacion, int cargaHoraria) {
        super(documento, tipoDocumento, nombre, correo, telefono, direccion, fechaNacimiento);
        this.codigoDocente = codigoDocente;
        this.departamento = departamento;
        this.titulo = titulo;
        this.especializacion = especializacion;
        setCargaHoraria(cargaHoraria);
        this.cursosAsignados = new ArrayList<>();
        this.historialEvaluaciones = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("Error: La carga horaria no puede ser negativa.");
        }
    }

    public List<Curso> getCursosAsignados() {
        return cursosAsignados;
    }

    public List<Evaluacion> getHistorialEvaluaciones() {
        return historialEvaluaciones;
    }

    // Métodos funcionales
    public void asignarCurso(Curso curso) {
        if (!cursosAsignados.contains(curso)) {
            cursosAsignados.add(curso);
            System.out.println("El docente " + getNombre() + " ha sido asignado al curso: " + curso.getNombre());
        } else {
            System.out.println("El docente ya está asignado a este curso.");
        }
    }

    public void generarEvaluacion(Curso curso, String nombreEvaluacion) {
        Evaluacion evaluacion = new Evaluacion(nombreEvaluacion, curso);
        historialEvaluaciones.add(evaluacion);
        System.out.println("Evaluación '" + nombreEvaluacion + "' creada para el curso: " + curso.getNombre());
    }

    public void registrarCalificacion(Estudiante estudiante, Evaluacion evaluacion, float nota) {
        if (nota < 0 || nota > 5) {
            System.out.println("Error: La nota debe estar entre 0 y 5.");
            return;
        }
        System.out.println("Registrando calificación de " + nota + " para el estudiante " + estudiante.getNombre() 
                           + " en la evaluación '" + evaluacion.getNombre() + "'.");
    }

    public boolean validarDisponibilidad() {
        boolean disponible = cargaHoraria < 40;
        System.out.println("Disponibilidad del docente " + getNombre() + ": " + (disponible ? "Disponible" : "No disponible"));
        return disponible;
    }

    public void mostrarCursosAsignados() {
        System.out.println("Cursos asignados a " + getNombre() + ":");
        if (cursosAsignados.isEmpty()) {
            System.out.println("Ninguno.");
        } else {
            for (Curso curso : cursosAsignados) {
                System.out.println("- " + curso.getNombre());
            }
        }
    }

    public void mostrarHistorialEvaluaciones() {
        System.out.println("Historial de evaluaciones de " + getNombre() + ":");
        if (historialEvaluaciones.isEmpty()) {
            System.out.println("Ninguna evaluación registrada.");
        } else {
            for (Evaluacion evaluacion : historialEvaluaciones) {
                System.out.println("- " + evaluacion.getNombre() + " (Curso: " + evaluacion.getCurso().getNombre() + ")");
            }
        }
    }
}