

import java.util.Date;
/**
 * 
 */
public class Evaluacion {

    private String codigoEvaluacion;
    private String tipo;
    private float ponderacion;
    private Curso codigoCurso;
    private Date fecha;

    // Constructor por defecto
    public Evaluacion() {}

    // Constructor con parámetros
    public Evaluacion(String codigoEvaluacion, String tipo, float ponderacion, Curso codigoCurso, Date fecha) {
        this.codigoEvaluacion = codigoEvaluacion;
        this.tipo = tipo;
        this.ponderacion = Math.max(0, Math.min(ponderacion, 100)); // La ponderación no puede ser negativa ni mayor a 100
        this.codigoCurso = codigoCurso;
        this.fecha = fecha;
    }

    // Getters y Setters con validaciones
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
        if (tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        }
    }

    public float getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(float ponderacion) {
        if (ponderacion >= 0 && ponderacion <= 100) {
            this.ponderacion = ponderacion;
        }
    }

    public Curso getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Curso codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Métodos funcionales
    public void crearEvaluacion() {
        System.out.println("Evaluación creada: " + this.codigoEvaluacion + " - " + this.tipo);
    }

    public void eliminarEvaluacion() {
        System.out.println("Evaluación eliminada: " + this.codigoEvaluacion);
    }

    public void modificarEvaluacion(String nuevoTipo, float nuevaPonderacion, Date nuevaFecha) {
        setTipo(nuevoTipo);
        setPonderacion(nuevaPonderacion);
        setFecha(nuevaFecha);
        System.out.println("Evaluación modificada: " + this.codigoEvaluacion);
    }

    public Evaluacion consultarEvaluacion() {
        return this;
    }

    public void crearRubrica() {
        System.out.println("Rúbrica creada para la evaluación: " + this.codigoEvaluacion);
    }

    public void publicarResultados() {
        System.out.println("Resultados publicados para la evaluación: " + this.codigoEvaluacion);
    }

    public void aplicarEvaluacion() {
        System.out.println("Evaluación aplicada: " + this.codigoEvaluacion);
    }

    // Método para mostrar información detallada
    public void mostrarInformacion() {
        System.out.println("Código Evaluación: " + codigoEvaluacion);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ponderación: " + ponderacion + "%");
        System.out.println("Curso: " + (codigoCurso != null ? codigoCurso.getNombre() : "No asignado"));
        System.out.println("Fecha: " + fecha);
    }
}