package entidad;

import java.util.List;
import java.util.ArrayList;


public class Curso {
    private String codigo;
    private String nombre;
    private int cupos;
    private List<Estudiante> estudiantesInscritos;
    private List<Evaluacion> evaluaciones;
    private List<Curso> prerrequisitos;

    public Curso(String codigo, String nombre, int cupos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupos = cupos;
        this.estudiantesInscritos = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
        this.prerrequisitos = new ArrayList<>();
    }

    public String getCodigoCurso() {
        return codigo;
    }

    public void setCodigoCurso(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupos() {
        return cupos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public boolean inscribirEstudiante(Estudiante estudiante){
        if (validarCupos() && !estudiantesInscritos.contains(estudiante)) {
            estudiantesInscritos.add(estudiante);
            cupos--;
            return true;
        }
        return false;
    }

    public boolean cancelarInscripcion(Estudiante estudiante){
        if (estudiantesInscritos.remove(estudiante)) {
            cupos++;
            return true;
        }
        return false;
    }

    public boolean validarCupos() {
        return cupos > 0;
    }

    public List<Estudiante> listarEstudiantes() {
        return estudiantesInscritos;
    }

    public void agregarPrerrequisito(Curso prerrequisito) {
        if (!prerrequisitos.contains(prerrequisito)) {
            prerrequisitos.add(prerrequisito);
        }
    }

    public boolean validarPrerrequisitos(Estudiante estudiante) {
        for (Curso prerrequisito : prerrequisitos) {
            if (!estudiante.generarReporteCursosAprobados().contains(prerrequisito)) {
                return false;
            }
        }
        return true;
    }

    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
    }

    public List<Evaluacion> obtenerEvaluaciones() {
        return evaluaciones;
    }
}
