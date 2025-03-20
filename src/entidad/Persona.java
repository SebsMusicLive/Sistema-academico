
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;


enum TipoDocumento {
    CC, TI, PASAPORTE;
}


/**
 * 
 */
public abstract class Persona{
   private String documento;
    private TipoDocumento tipoDocumento;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;

    public Persona() {}

    public Persona(String documento, TipoDocumento tipoDocumento, String nombre, String correo, String telefono, String direccion, Date fechaNacimiento) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        setCorreo(correo);
        setTelefono(telefono);
        this.direccion = direccion;
        setFechaNacimiento(fechaNacimiento);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", correo)) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("Correo inválido. Debe tener un formato válido.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (Pattern.matches("\\d{10}", telefono)) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Número de teléfono inválido. Debe contener 10 dígitos.");
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
        if (fechaNacimiento != null && fechaNacimiento.before(new Date())) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("Fecha de nacimiento inválida.");
        }
    }

    public void registrarDatos() {
        System.out.println("Registrando datos de la persona: " + this.nombre);
    }

    public void actualizarDatos(String nuevoCorreo, String nuevoTelefono, String nuevaDireccion) {
        setCorreo(nuevoCorreo);
        setTelefono(nuevoTelefono);
        setDireccion(nuevaDireccion);
        System.out.println("Datos actualizados para: " + this.nombre);
    }

    public void eliminarDatos() {
        this.documento = "";
        this.tipoDocumento = null;
        this.nombre = "";
        this.correo = "";
        this.telefono = "";
        this.direccion = "";
        this.fechaNacimiento = null;
        System.out.println("Datos eliminados correctamente.");
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNac = (fechaNacimiento != null) ? sdf.format(fechaNacimiento) : "No registrada";
        return "Persona{" +
                "documento='" + documento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNac +
                '}';
    }
}