package entidad;
import java.sql.Time;

/**
 * 
 */
public class Horario {
private String codigoHorario;
    private Curso codigoCurso;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String tipoSesion;

    // Constructor por defecto
    public Horario() {}

    // Constructor con parámetros
    public Horario(String codigoHorario, Curso codigoCurso, String dia, LocalTime horaInicio, LocalTime horaFin, String tipoSesion) {
        this.codigoHorario = codigoHorario;
        this.codigoCurso = codigoCurso;
        setDia(dia);
        setHoraInicio(horaInicio);
        setHoraFin(horaFin);
        this.tipoSesion = tipoSesion;
    }

    // Getters y Setters con validaciones
    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public Curso getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Curso codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String[] diasValidos = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (String d : diasValidos) {
            if (d.equalsIgnoreCase(dia)) {
                this.dia = d;
                return;
            }
        }
        throw new IllegalArgumentException("Día inválido. Debe ser un día de la semana.");
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        if (horaFin != null && horaInicio.isAfter(horaFin)) {
            throw new IllegalArgumentException("La hora de inicio no puede ser después de la hora de fin.");
        }
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        if (horaInicio != null && horaFin.isBefore(horaInicio)) {
            throw new IllegalArgumentException("La hora de fin no puede ser antes de la hora de inicio.");
        }
        this.horaFin = horaFin;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    // Métodos funcionales
    public void modificarHorario(String nuevoDia, LocalTime nuevaHoraInicio, LocalTime nuevaHoraFin) {
        setDia(nuevoDia);
        setHoraInicio(nuevaHoraInicio);
        setHoraFin(nuevaHoraFin);
        System.out.println("Horario modificado: " + this.codigoHorario);
    }

    public void asignarHorario() {
        System.out.println("Horario asignado: " + this.codigoHorario);
    }

    public boolean verificarDisponibilidad() {
        // Implementación de verificación de disponibilidad
        return true;  // Retorna true si está disponible (esto debe mejorarse con lógica real)
    }

    public void optimizarUsoRecursos() {
        System.out.println("Optimización de recursos realizada para el horario: " + this.codigoHorario);
    }

    // Método para mostrar información detallada
    public void mostrarInformacion() {
        System.out.println("Código Horario: " + codigoHorario);
        System.out.println("Curso: " + (codigoCurso != null ? codigoCurso.getNombre() : "No asignado"));
        System.out.println("Día: " + dia);
        System.out.println("Hora Inicio: " + horaInicio);
        System.out.println("Hora Fin: " + horaFin);
        System.out.println("Tipo de Sesión: " + tipoSesion);
    }
}