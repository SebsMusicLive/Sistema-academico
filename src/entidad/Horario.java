package entidad;
import java.sql.Time;

/**
 * 
 */
public class Horario {
private String codigoHorario;
    private Curso curso;
    private String dia;
    private Time horaInicio;
    private Time horaFin;
    private String tipoSesion;

    public Horario(String codigoHorario, Curso curso, String dia, Time horaInicio, Time horaFin, String tipoSesion) {
        this.codigoHorario = codigoHorario;
        this.curso = curso;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoSesion = tipoSesion;
    }

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public void modificarHorario(String dia, Time horaInicio, Time horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        System.out.println("Horario modificado: " + this.codigoHorario);
    }

    public boolean verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad del horario...");
        return true; // Aquí podrías agregar lógica para verificar conflictos
    }

    public void optimizarUsoRecursos() {
        System.out.println("Optimizando el uso de recursos para el horario " + this.codigoHorario);
    }

    @Override
    public String toString() {
        return "Horario{" +
                "codigoHorario='" + codigoHorario + '\'' +
                ", curso=" + curso.getNombre() +
                ", dia='" + dia + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", tipoSesion='" + tipoSesion + '\'' +
                '}';
    }
}