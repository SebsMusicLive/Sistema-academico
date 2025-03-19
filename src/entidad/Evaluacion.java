

import java.util.Date;
/**
 * 
 */
public class Evaluacion {

    private String codigoEvaluacion;
    private String tipo;
    private float ponderacion;
    private Curso curso;
    private Date fecha;

    public Evaluacion(String codigoEvaluacion, String tipo, float ponderacion, Curso curso, Date fecha) {
        this.codigoEvaluacion = codigoEvaluacion;
        this.tipo = tipo;
        this.ponderacion = ponderacion;
        this.curso = curso;
        this.fecha = fecha;
    }

    public String getCodigoEvaluacion() {
        return codigoEvaluacion;
    }

    public void setCodigoEvaluacion(String codigoEvaluacion) {
        this.codigoEvaluacion = codigoEvaluacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(float ponderacion) {
        if (ponderacion >= 0 && ponderacion <= 100) {
            this.ponderacion = ponderacion;
        } else {
            throw new IllegalArgumentException("La ponderación debe estar entre 0 y 100.");
        }
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void crearEvaluacion() {
        System.out.println("Evaluación creada: " + this.codigoEvaluacion);
    }

    public void eliminarEvaluacion() {
        System.out.println("Evaluación eliminada: " + this.codigoEvaluacion);
    }

    public void modificarEvaluacion(String nuevoTipo, float nuevaPonderacion, Date nuevaFecha) {
        this.tipo = nuevoTipo;
        setPonderacion(nuevaPonderacion);
        this.fecha = nuevaFecha;
        System.out.println("Evaluación modificada: " + this.codigoEvaluacion);
    }

    public void publicarResultados() {
        System.out.println("Resultados de la evaluación " + this.codigoEvaluacion + " publicados.");
    }

    public void aplicarEvaluacion() {
        System.out.println("Evaluación " + this.codigoEvaluacion + " aplicada.");
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "codigoEvaluacion='" + codigoEvaluacion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ponderacion=" + ponderacion +
                ", curso=" + curso.getNombre() +
                ", fecha=" + fecha +
                '}';
    }
}