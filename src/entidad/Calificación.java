
import java.util.Objects;

/**
 * 
 */
public class Calificación {

    private String codigoCalificacion;
    private float nota;
    private Estudiante estudiante;
    private Evaluacion evaluacion;

    public Calificacion(String codigoCalificacion, float nota, Estudiante estudiante, Evaluacion evaluacion) {
        this.codigoCalificacion = codigoCalificacion;
        setNota(nota);
        this.estudiante = estudiante;
        this.evaluacion = evaluacion;
    }

    public String getCodigoCalificacion() {
        return codigoCalificacion;
    }

    public void setCodigoCalificacion(String codigoCalificacion) {
        this.codigoCalificacion = codigoCalificacion;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("La nota debe estar entre 0.0 y 5.0");
        }
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public void actualizarNota(float nuevaNota) {
        setNota(nuevaNota);
        System.out.println("Nota actualizada a: " + nuevaNota);
    }

    public void eliminarCalificacion() {
        System.out.println("Calificación eliminada: " + codigoCalificacion);
        this.nota = 0.0f;
    }

    public Calificacion consultarCalificacion() {
        System.out.println("Consulta de calificación: " + this);
        return this;
    }

    public String generarRetroalimentacion() {
        if (nota >= 4.5) {
            return "Excelente desempeño.";
        } else if (nota >= 3.5) {
            return "Buen trabajo, puedes mejorar.";
        } else if (nota >= 2.5) {
            return "Debes esforzarte más.";
        } else {
            return "Reprobado. Necesitas reforzar tus conocimientos.";
        }
    }

    public void enviarRetroalimentacion() {
        System.out.println("Retroalimentación para " + estudiante.getNombre() + ": " + generarRetroalimentacion());
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "codigoCalificacion='" + codigoCalificacion + '\'' +
                ", nota=" + nota +
                ", estudiante=" + estudiante.getNombre() +
                ", evaluacion=" + evaluacion.getCodigoEvaluacion() +
                '}';
    }
}