
import java.time.LocalDateTime;


/**
 * 
 */
public class RecursoAcademico {
    private String codigoRecursoAcademico;
    private String titulo;
    private String tipo;
    private Curso codigoCurso;
    private boolean disponibilidad;
    private String ubicacion;
    private String tipoEspacio;

    // Constructor por defecto
    public RecursoAcademico() {}

    // Constructor con parámetros
    public RecursoAcademico(String codigoRecursoAcademico, String titulo, String tipo, Curso codigoCurso, boolean disponibilidad, String ubicacion, String tipoEspacio) {
        this.codigoRecursoAcademico = codigoRecursoAcademico;
        this.titulo = titulo;
        this.tipo = tipo;
        this.codigoCurso = codigoCurso;
        this.disponibilidad = disponibilidad;
        this.ubicacion = ubicacion;
        this.tipoEspacio = tipoEspacio;
    }

    // Getters y Setters con validaciones
    public String getCodigoRecursoAcademico() {
        return codigoRecursoAcademico;
    }

    public void setCodigoRecursoAcademico(String codigoRecursoAcademico) {
        this.codigoRecursoAcademico = codigoRecursoAcademico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String[] tiposValidos = {"Libro", "Artículo", "Material Multimedia", "Software", "Laboratorio"};
        for (String t : tiposValidos) {
            if (t.equalsIgnoreCase(tipo)) {
                this.tipo = t;
                return;
            }
        }
        throw new IllegalArgumentException("Tipo inválido. Debe ser uno de: Libro, Artículo, Material Multimedia, Software, Laboratorio.");
    }

    public Curso getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Curso codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }

    public void setTipoEspacio(String tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }

    // Métodos funcionales
    public void agregarRecurso() {
        System.out.println("Recurso académico agregado: " + this.titulo);
    }

    public void eliminarRecurso() {
        System.out.println("Recurso académico eliminado: " + this.titulo);
    }

    public void reservarRecurso(LocalDateTime fechaHora) {
        if (!disponibilidad) {
            System.out.println("Recurso no disponible para la reserva.");
            return;
        }
        System.out.println("Recurso reservado para el " + fechaHora);
        disponibilidad = false;
    }

    public boolean verificarDisponibilidad() {
        return disponibilidad;
    }

    public void gestionarMantenimiento() {
        System.out.println("Mantenimiento programado para el recurso: " + this.titulo);
        disponibilidad = false;
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigoRecursoAcademico);
        System.out.println("Título: " + titulo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Disponible: " + (disponibilidad ? "Sí" : "No"));
        System.out.println("Espacio: " + tipoEspacio);
    }
}
