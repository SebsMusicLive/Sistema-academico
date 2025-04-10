
import java.io.*;
import java.util.*;

/**
 * 
 */
public class PrestamoRecurso {
private String codigo_prestamoRecurso;
    private RecursoAcademico codigo_recurso;
    private Usuario codigo_usuario;
    private Date fecha_prestamo;
    private Date fecha_devolucion;

    public PrestamoRecurso() {
    }

    public String getCodigo_prestamoRecurso() {
        return codigo_prestamoRecurso;
    }

    public void setCodigo_prestamoRecurso(String codigo_prestamoRecurso) {
        this.codigo_prestamoRecurso = codigo_prestamoRecurso;
    }

    public RecursoAcademico getCodigoRecurso() {
        return codigo_recurso;
    }

    public void setCodigoRecurso(RecursoAcademico codigo_recurso) {
        this.codigo_recurso = codigo_recurso;
    }

    public Usuario getCodigoUsuario() {
        return codigo_usuario;
    }

    public void setCodigoUsuario(Usuario codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public Date getFechaPrestamo() {
        return fecha_prestamo;
    }

    public void setFechaPrestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFechaDevolucion() {
        return fecha_devolucion;
    }

    public void setFechaDevolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public void registrarPrestamo() {
        this.fecha_prestamo = new Date();
        System.out.println("Préstamo registrado: " + this.codigo_prestamoRecurso);
    }

    public void devolverRecurso() {
        this.fecha_devolucion = new Date();
        System.out.println("Recurso devuelto: " + this.codigo_prestamoRecurso);
    }

    public void extenderPlazo(int dias_extra) {
        if (fecha_devolucion != null) {
            long tiempoExtra = dias_extra * 24L * 60 * 60 * 1000;
            this.fecha_devolucion = new Date(this.fecha_devolucion.getTime() + tiempoExtra);
            System.out.println("Plazo extendido en " + dias_extra + " días.");
        } else {
            System.out.println("No se puede extender el plazo sin fecha de devolución establecida.");
        }
    }

    public float generarMulta() {
        Date actual = new Date();
        if (fecha_devolucion != null && actual.after(fecha_devolucion)) {
            long diasRetraso = (actual.getTime() - fecha_devolucion.getTime()) / (24 * 60 * 60 * 1000);
            float multa = diasRetraso * 5.0f; // Multa de 5 unidades por día de retraso
            System.out.println("Multa generada: " + multa);
            return multa;
        }
        return 0.0f;
    }

    public void motivoprestamo() {
        System.out.println("Motivo del préstamo registrado para el recurso: " + codigo_recurso);
    }

}