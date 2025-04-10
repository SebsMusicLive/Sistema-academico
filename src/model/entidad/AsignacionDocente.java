package entidad;
import java.util.Date;

public class AsignacionDocente {
    private String codigoAsignacionDocente;
    private Date fecha;
    private Docente codigoDocente;
    private Curso codigoCurso;
    private int cargaHoraria; // Nueva variable para almacenar la carga horaria

    public AsignacionDocente() {
    }

    public AsignacionDocente(String codigoAsignacionDocente, Date fecha, Docente codigoDocente, Curso codigoCurso, int cargaHoraria) {
        this.codigoAsignacionDocente = codigoAsignacionDocente;
        this.fecha = fecha;
        this.codigoDocente = codigoDocente;
        this.codigoCurso = codigoCurso;
        this.cargaHoraria = cargaHoraria;
    }

    // Getters y Setters
    public String getCodigoAsignacionDocente() {
        return codigoAsignacionDocente;
    }

    public void setCodigoAsignacionDocente(String codigo) {
        this.codigoAsignacionDocente = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Docente getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(Docente codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public Curso getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Curso codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Métodos funcionales
    public void asignarCurso() {
        if (codigoDocente == null || codigoCurso == null) {
            System.out.println("No se puede asignar un curso sin un docente o curso válido.");
        } else {
            System.out.println("Docente " + codigoDocente.getNombre() + " asignado al curso " + codigoCurso.getNombre());
        }
    }

    public boolean verificarDisponibilidad() {
        int cargaMaxima = 40; // Suponiendo que la carga máxima del docente es 40 horas
        return (cargaHoraria <= cargaMaxima);
    }

    public void ajustarCargaHoraria(int nuevaCarga) {
        this.cargaHoraria = nuevaCarga;
        System.out.println("Carga horaria ajustada a: " + nuevaCarga + " horas.");
    }

    public void mostrarInformacion() {
        System.out.println("Código de Asignación: " + codigoAsignacionDocente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Docente: " + (codigoDocente != null ? codigoDocente.getNombre() : "No asignado"));
        System.out.println("Curso: " + (codigoCurso != null ? codigoCurso.getNombre() : "No asignado"));
        System.out.println("Carga Horaria: " + cargaHoraria + " horas.");
        System.out.println("Disponibilidad: " + (verificarDisponibilidad() ? "Disponible" : "Excede el límite"));
    }
}
