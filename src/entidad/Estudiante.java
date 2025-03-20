
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class Estudiante extends Persona {

   private String codigo_estudiante;
    private Carrera codigo_carrera;
    private int semestre;
    private List<Curso> cursosInscritos;

    public Estudiante() {
        this.cursosInscritos = new ArrayList<>();
    }

    public Estudiante(String documento, TipoDocumento tipoDocumento, String nombre, String correo, String telefono,
                      String direccion, Date fechaNacimiento, String codigo_estudiante, Carrera codigo_carrera, int semestre) {
        super(documento, tipoDocumento, nombre, correo, telefono, direccion, fechaNacimiento);
        this.codigo_estudiante = codigo_estudiante;
        this.codigo_carrera = codigo_carrera;
        this.semestre = semestre;
        this.cursosInscritos = new ArrayList<>();
    }

    public String getCodigoEstudiante() {
        return codigo_estudiante;
    }

    public void setCodigoEstudiante(String codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    public Carrera getCodigoCarrera() {
        return codigo_carrera;
    }

    public void setCodigoCarrera(Carrera codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
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
                "codigo_estudiante='" + codigo_estudiante + '\'' +
                ", codigo_carrera=" + (codigo_carrera != null ? codigo_carrera.getNombre() : "No asignada") +
                ", semestre=" + semestre +
                ", cursosInscritos=" + cursosInscritos.size() +
                '}';
    }
}