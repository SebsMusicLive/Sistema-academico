import java.util.*;

public class Foro {

    private String codigo_foro;
    private Curso codigo_curso;
    private String titulo;
    private String descripcion;
    private Date fecha_creacion;
    private Usuario codigo_creador;
    private List<Mensaje> mensajes;  // Lista para almacenar los mensajes del foro

    public Foro() {
        this.mensajes = new ArrayList<>();  // Inicializamos la lista de mensajes
    }

    public String getCodigoForo() {
        return this.codigo_foro;
    }

    public void setCodigoForo(String codigo_foro) {
        this.codigo_foro = codigo_foro;
    }

    public Curso getCodigoCurso() {
        return this.codigo_curso;
    }

    public void setCodigoCurso(Curso codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return this.fecha_creacion;
    }

    public void setFechaCreacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Usuario getCodigoCreador() {
        return this.codigo_creador;
    }

    public void setCodigoCreador(Usuario codigo_creador) {
        this.codigo_creador = codigo_creador;
    }

    public List<Mensaje> getMensajes() {
        return this.mensajes;
    }

    /**
     * Método para crear un foro con la fecha actual.
     */
    public void crearForo() {
        this.fecha_creacion = new Date(); // Asigna la fecha actual
        System.out.println("Foro creado con éxito: " + this.titulo + " el " + this.fecha_creacion);
    }

    /**
     * Método para cerrar el foro.
     */
    public void cerrarForo() {
        System.out.println("El foro '" + this.titulo + "' ha sido cerrado.");
        this.mensajes.clear(); // Opcional: eliminar mensajes al cerrar el foro
    }

    /**
     * Método para agregar un mensaje al foro.
     */
    public void agregarMensaje(Mensaje mensaje) {
        if (mensaje != null) {
            this.mensajes.add(mensaje);
            System.out.println("Mensaje agregado por " + mensaje.getCodigoUsuario().getNombre() + ": " + mensaje.getContenido());
        } else {
            System.out.println("No se puede agregar un mensaje nulo.");
        }
    }
}
