
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Mensaje {

    private String codigo_mensaje;
    private Chat codigo_chat;
    private Usuario codigo_emisor;
    private Usuario codigo_receptor;
    private String contenido;
    private Date fecha_envio;

    public Mensaje() {
        this.fecha_envio = new Date();
    }

    public String getCodigoMensaje() {
        return codigo_mensaje;
    }

    public void setCodigoMensaje(String codigo_mensaje) {
        this.codigo_mensaje = codigo_mensaje;
    }

    public Chat getCodigoChat() {
        return codigo_chat;
    }

    public void setCodigoChat(Chat codigo_chat) {
        this.codigo_chat = codigo_chat;
    }

    public Usuario getCodigoEmisor() {
        return codigo_emisor;
    }

    public void setCodigoEmisor(Usuario codigo_emisor) {
        this.codigo_emisor = codigo_emisor;
    }

    public Usuario getCodigoReceptor() {
        return codigo_receptor;
    }

    public void setCodigoReceptor(Usuario codigo_receptor) {
        this.codigo_receptor = codigo_receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaEnvio() {
        return fecha_envio;
    }

    public void setFechaEnvio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public void enviarMensaje() {
        System.out.println("Mensaje enviado: " + contenido);
        this.fecha_envio = new Date();
    }

    public void recibirMensaje() {
        System.out.println("Mensaje recibido de " + codigo_emisor.getNombre() + ": " + contenido);
    }

}