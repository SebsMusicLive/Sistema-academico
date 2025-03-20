//package entidad;

import java.util.Objects;

public class Usuario {
    private String codigo;
    private String persona_documento;
    private String nombre;
    private String clave;
    private Rol rol;
    private boolean sesionActiva;

    public Usuario (){
        this.sesionActiva = false;
    }

    public Usuario(String codigo, String persona_documento, String nombre, String clave, Rol rol) {
        this.codigo = codigo;
        this.persona_documento = persona_documento;
        this.nombre = nombre;
        this.clave = clave;
        this.rol = rol;
        this.sesionActiva = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPersona_documento() {
        return persona_documento;
    }

    public void setPersona_documento(String persona_documento) {
        this.persona_documento = persona_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean iniciarSesion(String nombre, String clave){
        if(Objects.equals(this.nombre, nombre) && Objects.equals(this.clave, clave)) {
            System.out.println("Sesión iniciada correctamente, Bienvenido, " + nombre);
            return this.sesionActiva=true;
        }else{
            System.out.println("Datos incorrectos");
            return this.sesionActiva;
        }
    }

    public void cerrarSesion(){
        if(this.sesionActiva){
            this.sesionActiva = false;
            System.out.println("Sesión cerrada correctamente, adiós, "+ this.nombre);
        }else{
            System.out.println("No hay sesión para cerrar");
        }
    }

    public boolean autenticar(String clave){
        return Objects.equals(this.clave, clave);
    }

    public void cambiarClave(String nuevaClave){
        if(this.clave != null || !this.clave.isEmpty()
        && nuevaClave != null || !nuevaClave.isEmpty()){
            this.clave = nuevaClave;
            System.out.println("Contraseña actualizada correctamente.");
        }
    }

    public void recuperarClave(){

    }
    private String generarClaveTemporal(){
        return "";
    }
}
