
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class Estudiante extends Persona {

   private String codigoEstudiante;
    private Carrera carrera;
    private int semestre;
    private List<Curso> cursosInscritos; // Lista de cursos en los que está inscrito

    public Estudiante() {
        this.cursosInscritos = new ArrayList<>();
    }

    public Estudiante(String documento, String tipoDocumento, String nombre, String correo, String telefono, 
                      String direccion, Date fechaNacimiento, String codigoEstudiante, Carrera carrera, int semestre) {
        super(documento, tipoDocumento, nombre, correo, telefono, direccion, fechaNacimiento);
        this.codigoEstudiante = codigoEstudiante;
        this.carrera = carrera;
        this.semestre = semestre;
        this.cursosInscritos = new ArrayList<>();
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public boolean inscribirseCurso(Curso curso) {
        if (curso.getCupos() > 0 && !cursosInscritos.contains(curso)) {
            if (validarPrerrequisitos(curso)) {
                curso.inscribirEstudiante(this);
                cursosInscritos.add(curso);
                System.out.println("Estudiante " + getNombre() + " inscrito en " + curso.getNombre());
                return true;
            } else {
                System.out.println("No cumple con los prerrequisitos para " + curso.getNombre());
            }
        } else {
            System.out.println("No hay cupos o ya está inscrito en " + curso.getNombre());
        }
        return false;
    }

    public boolean cancelarInscripcion(Curso curso) {
        if (cursosInscritos.contains(curso)) {
            curso.cancelarInscripcion(this);
            cursosInscritos.remove(curso);
            System.out.println("Inscripción cancelada en " + curso.getNombre());
            return true;
        } else {
            System.out.println("No está inscrito en " + curso.getNombre());
            return false;
        }
    }

    public HistorialAcademico consultarHistorialAcademico() {
        System.out.println("Consultando historial académico de " + getNombre());
        return new HistorialAcademico();
    }

    public boolean validarPrerrequisitos(Curso curso) {
        // Aquí se validaría si el estudiante ha aprobado cursos previos requeridos
        System.out.println("Validando prerrequisitos para " + curso.getNombre());
        return true;
    }

    public List<Curso> generarReporteCursosAprobados() {
        System.out.println("Generando reporte de cursos aprobados...");
        return new ArrayList<>();
    }

    public List<Curso> generarReporteCursosEnProceso() {
        System.out.println("Generando reporte de cursos en proceso...");
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigoEstudiante='" + codigoEstudiante + '\'' +
                ", carrera=" + (carrera != null ? carrera.getNombre() : "No asignada") +
                ", semestre=" + semestre +
                ", cursosInscritos=" + cursosInscritos.size() +
                '}';
    }
}