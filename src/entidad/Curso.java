package entidad;

import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private int cupos;
    private List<Estudiante> estudiantesInscritos;

    public Curso(String codigo, String nombre, int cupos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupos = cupos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public boolean inscribirEstudiante(Estudiante estudiante){
        if(cupos > 0 && !estudiantesInscritos.contains(estudiante)){
            cupos--;
            return true;
        }
        return false;
    }

    public boolean cancelarInscripcion(Estudiante estudiante){
        if(estudiantesInscritos.remove(estudiante)){
            cupos++;
            return true;
        }
        return false;
    }


}
