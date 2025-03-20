import java.util.*;

public class Matricula {

    private String codigo_matricula;
    private Date fecha_matricula;
    private Curso codigo_curso;
    private Estudiante codigo_estudiante;
    private static final int CUPOS_MAXIMOS = 30; // Definir un límite de cupos
    private int cuposDisponibles = CUPOS_MAXIMOS;

    public Matricula() {
        this.fecha_matricula = new Date(); // Fecha por defecto cuando se crea una matrícula
    }

    public String getCodigoMatricula() {
        return this.codigo_matricula;
    }

    public void setCodigoMatricula(String codigo_matricula) {
        this.codigo_matricula = codigo_matricula;
    }

    public Date getFechaMatricula() {
        return this.fecha_matricula;
    }

    public void setFechaMatricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    public Curso getCodigoCurso() {
        return this.codigo_curso;
    }

    public void setCodigoCurso(Curso codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public Estudiante getCodigoEstudiante() {
        return this.codigo_estudiante;
    }

    public void setCodigoEstudiante(Estudiante codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    /**
     * Abre la convocatoria para nuevas inscripciones.
     */
    public void abrirConvocatoria() {
        System.out.println("Convocatoria abierta. Hay " + cuposDisponibles + " cupos disponibles.");
    }

    /**
     * Cierra la convocatoria de inscripciones.
     */
    public void cerrarConvocatoria() {
        System.out.println("Convocatoria cerrada. No se permiten más inscripciones.");
    }

    /**
     * Actualiza los cupos disponibles después de una inscripción.
     */
    public void actualizarCupos() {
        if (cuposDisponibles > 0) {
            cuposDisponibles--;
            System.out.println("Matrícula registrada. Cupos restantes: " + cuposDisponibles);
        } else {
            System.out.println("No hay cupos disponibles en este curso.");
        }
    }

    /**
     * Consulta los cupos disponibles en el curso.
     */
    public int consultarCuposDisponibles() {
        return this.cuposDisponibles;
    }

    /**
     * Valida si el estudiante cumple con los prerrequisitos para inscribirse en el curso.
     */
    public boolean validarPrerrequisitos(String codigo_curso) {
        // Simulación: Si el curso termina en '1', requiere prerrequisito
        boolean cumplePrerrequisitos = !codigo_curso.endsWith("1");
        System.out.println("Validación de prerrequisitos para curso " + codigo_curso + ": " + (cumplePrerrequisitos ? "Aprobado" : "Rechazado"));
        return cumplePrerrequisitos;
    }

    /**
     * Registra una matrícula si hay cupos disponibles y se cumplen los requisitos.
     */
    public void registrarMatricula() {
        if (validarPrerrequisitos(this.codigo_curso.getCodigoCurso()) && cuposDisponibles > 0) {
            this.fecha_matricula = new Date();
            actualizarCupos();
            System.out.println("Matrícula registrada con éxito para el estudiante " + this.codigo_estudiante.getNombre());
        } else {
            System.out.println("No se pudo registrar la matrícula. Verifique los prerrequisitos y los cupos.");
        }
    }

    /**
     * Cancela una matrícula y libera el cupo.
     */
    public void cancelarMatricula() {
        cuposDisponibles++;
        System.out.println("Matrícula cancelada. Cupos disponibles: " + cuposDisponibles);
    }
}
