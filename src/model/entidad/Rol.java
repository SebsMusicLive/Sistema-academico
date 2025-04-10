//package entidad;

import java.util.List;

public class Rol {
    private int id;
    private String nombre;
    private String tipoRol;
    private List<Permiso> permisos;

    public Rol(){

    }

    public Rol(int id, String nombre, String tipoRol, List<Permiso> permisos) {
        this.id = id;
        this.nombre = nombre;
        this.tipoRol = tipoRol;
        this.permisos = permisos;
    }

    public void asignarPermiso(Permiso permiso){
        this.permisos.add(permiso);
    }
}
