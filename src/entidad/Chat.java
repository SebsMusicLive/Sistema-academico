
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Chat {

    /**
     * Default constructor
     */
    public Chat() {
    }

    /**
     * 
     */
    private String codigo_chat;

    /**
     * 
     */
    private Date fecha_creacion;

    /**
     * 
     */
    private Usuario codigo_usuario1;

    /**
     * 
     */
    private Usuario codigo_usuario2;

    /**
     * @return
     */
    public String getCodigo_chat() {
        // TODO implement here
        return this.codigo_chat;
    }

    /**
     * @param codigo_chat 
     * @return
     */
    public void setCodigo_chat(String codigo_chat) {
        // TODO implement here
        this.codigo_chat = codigo_chat;
    }

    /**
     * @return
     */
    public Date getFechaCreacion() {
        // TODO implement here
        return this.fecha_creacion;
    }

    /**
     * @param fecha_creacion 
     * @return
     */
    public void setFechaCreacion(Date fecha_creacion) {
        // TODO implement here
        this.fecha_creacion = fecha_creacion;
    }

    /**
     * @return
     */
    public Usuario getCodigoUsuario1() {
        // TODO implement here
        return this.codigo_usuario1;
    }

    /**
     * @param codigo_usuario1 
     * @return
     */
    public void setCodigoUsuario1(Usuario codigo_usuario1) {
        // TODO implement here
        this.codigo_usuario1 = codigo_usuario1;
    }

    /**
     * @return
     */
    public Usuario getCodigoUsuario2() {
        // TODO implement here
        return this.codigo_usuario2;
    }

    /**
     * @param codigo_usuario2 
     * @return
     */
    public void setCodigoUsuario2(Usuario codigo_usuario2) {
        // TODO implement here
        this.codigo_usuario2 = codigo_usuario2;
    }

    /**
     * @return
     */
    public void iniciarChat() {
        // TODO implement here
        if(codigo_usuario1 == null || codigo_usuario2 == null){
            System.out.println("No se puede iniciar un chat sin dos usuarios.");
            return;
        }

        this.codigo_chat = UUID.randomUUID().toString();
        this.fecha_creacion = new Date();

        System.out.println("Chat iniciado con el código: " + this.codigo_chat);
        System.out.println("Código del chat: "+ this.codigo_chat);
    }

    /**
     * @return
     */
    public void cerrarChat() {
        // TODO implement here
        if(this.codigo_chat == null){
            System.out.println("No se puede cerrar un chat que no ha sido iniciado.");
            return;
        }

        System.out.println("El chat con código "+this.codigo_chat+ " ha sido cerrado.");
        
        this.codigo_chat = null;
        this.fecha_creacion = null;
        this.codigo_usuario1 = null;
        this.codigo_usuario2 = null;
        
    }

}