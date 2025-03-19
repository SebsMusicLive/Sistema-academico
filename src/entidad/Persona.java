
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 
 */
public class Persona {
 private String documento;
    private String tipoDocumento;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;

    // Constructor vacío
    public Persona() {}

    // Constructor con parámetros
    public Persona(String documento, String tipoDocumento, String nombre, String correo, String telefono, String direccion, Date fechaNacimiento) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.contains("@")) {
            this.correo = correo;
        } else {
            System.out.println("Correo inválido. Debe contener '@'.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.matches("\\d{10}")) { // Verifica que tenga 10 dígitos
            this.telefono = telefono;
        } else {
            System.out.println("Número de teléfono inválido. Debe contener 10 dígitos.");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos de gestión de datos
    public void registrarDatos() {
        System.out.println("Registrando datos de la persona: " + this.nombre);
        // Aquí podrías agregar lógica para guardar en una base de datos
    }

    public void actualizarDatos(String nuevoCorreo, String nuevoTelefono, String nuevaDireccion) {
        setCorreo(nuevoCorreo);
        setTelefono(nuevoTelefono);
        setDireccion(nuevaDireccion);
        System.out.println("Datos actualizados para: " + this.nombre);
    }

    public void eliminarDatos() {
        System.out.println("Eliminando datos de la persona: " + this.nombre);
        this.documento = null;
        this.tipoDocumento = null;
        this.nombre = null;
        this.correo = null;
        this.telefono = null;
        this.direccion = null;
        this.fechaNacimiento = null;
        System.out.println("Datos eliminados correctamente.");
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNac = (fechaNacimiento != null) ? sdf.format(fechaNacimiento) : "No registrada";

        System.out.println("----- Información de la Persona -----");
        System.out.println("Documento: " + (documento != null ? documento : "No registrado"));
        System.out.println("Tipo de Documento: " + (tipoDocumento != null ? tipoDocumento : "No registrado"));
        System.out.println("Nombre: " + (nombre != null ? nombre : "No registrado"));
        System.out.println("Correo: " + (correo != null ? correo : "No registrado"));
        System.out.println("Teléfono: " + (telefono != null ? telefono : "No registrado"));
        System.out.println("Dirección: " + (direccion != null ? direccion : "No registrada"));
        System.out.println("Fecha de Nacimiento: " + fechaNac);
        System.out.println("------------------------------------");
    }
}