package entidad;
import java.util.Date;

public class AsignacionDocente {
    private String codigoAsignacionDocente;
    private Date fecha;
    private Docente docente;
    private Curso curso;

    public AsignacionDocente(String codigoAsignacionDocente, Date fecha, Docente docente, Curso curso) {
        this.codigoAsignacionDocente = codigoAsignacionDocente;
        this.fecha = fecha;
        this.docente = docente;
        this.curso = curso;
    }

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

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void asignarCurso() {
        if (verificarDisponibilidad()) {
            docente.asignarCurso(curso);
            docente.setCargaHoraria(docente.getCargaHoraria() + curso.getCupos());
            System.out.println("El curso " + curso.getNombre() + " ha sido asignado al docente " + docente.getNombre());
        } else {
            System.out.println("El docente " + docente.getNombre() + " no tiene disponibilidad para este curso.");
        }
    }

    public boolean verificarDisponibilidad() {
        return docente.getCargaHoraria() + curso.getCupos() <= 40; // Suponiendo 40 horas como límite
    }

    public void ajustarCargaHoraria(int nuevaCarga) {
        if (nuevaCarga > 0) {
            curso.setCupos(nuevaCarga);
            System.out.println("La carga horaria del curso " + curso.getNombre() + " ha sido ajustada a " + nuevaCarga + " horas.");
        } else {
            System.out.println("La carga horaria no puede ser negativa o cero.");
        }
    }
}
