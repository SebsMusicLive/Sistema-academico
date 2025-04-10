
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Notificacion {

    private String codigo_notificacion;
    private Usuario codigo_usuario;
    private String mensaje;
    private Date fecha_envio;
    private String tipo;
    private String estado;
    private Usuario destinatario;

    public Notificacion() {
        this.estado = "No Leída";
    }

    public String getCodigo_notificacion() {
        return codigo_notificacion;
    }

    public void setCodigo_notificacion(String codigo_notificacion) {
        this.codigo_notificacion = codigo_notificacion;
    }

    public Usuario getCodigoUsuario() {
        return codigo_usuario;
    }

    public void setCodigoUsuario(Usuario codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaEnvio() {
        return fecha_envio;
    }

    public void setFechaEnvio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public void enviarNotificacion() {
        this.fecha_envio = new Date(); // Establece la fecha de envío como la actual
        System.out.println("Notificación enviada a: " + destinatario.getNombre());
        System.out.println("Mensaje: " + mensaje);
    }

    public void marcarComoLeida() {
        this.estado = "Leída";
        System.out.println("La notificación ha sido marcada como leída.");
    }

    public void programarNotificacionAutomatica() {
        System.out.println("Notificación programada para ser enviada automáticamente.");
    }

}