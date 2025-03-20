package entidad;

import java.util.List;
import java.util.ArrayList;


public class Curso {
 private String codigoCurso;
    private String nombre;
    private int creditos;
    private int horasTeoricas;
    private int horasPracticas;
    private Docente codigoDocente;
    private Carrera codigoCarrera;
    private Curso codigoPrerrequisito;
    private Programa codigoPrograma;
    private Semestre codigoSemestre;
    private String tipoCurso;
    private String contenidos;
    private String objetivos;
    private String competencias;
    private List<Estudiante> estudiantesInscritos;
    private List<Curso> prerrequisitos;

    public Curso() {
        this.estudiantesInscritos = new ArrayList<>();
        this.prerrequisitos = new ArrayList<>();
    }

    public Curso(String codigoCurso, String nombre, int creditos, int horasTeoricas, int horasPracticas,
                 Docente codigoDocente, Carrera codigoCarrera, Curso codigoPrerrequisito, Programa codigoPrograma,
                 Semestre codigoSemestre, String tipoCurso, String contenidos, String objetivos, String competencias) {
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
        this.codigoDocente = codigoDocente;
        this.codigoCarrera = codigoCarrera;
        this.codigoPrerrequisito = codigoPrerrequisito;
        this.codigoPrograma = codigoPrograma;
        this.codigoSemestre = codigoSemestre;
        this.tipoCurso = tipoCurso;
        this.contenidos = contenidos;
        this.objetivos = objetivos;
        this.competencias = competencias;
        this.estudiantesInscritos = new ArrayList<>();
        this.prerrequisitos = new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public int getHorasPracticas() {
        return horasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public Docente getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(Docente codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public Carrera getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(Carrera codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public Curso getCodigoPrerrequisito() {
        return codigoPrerrequisito;
    }

    public void setCodigoPrerrequisito(Curso codigoPrerrequisito) {
        this.codigoPrerrequisito = codigoPrerrequisito;
    }

    public Programa getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(Programa codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public Semestre getCodigoSemestre() {
        return codigoSemestre;
    }

    public void setCodigoSemestre(Semestre codigoSemestre) {
        this.codigoSemestre = codigoSemestre;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getContenidos() {
        return contenidos;
    }

    public void setContenidos(String contenidos) {
        this.contenidos = contenidos;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getCompetencias() {
        return competencias;
    }

    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public List<Curso> getPrerrequisitos() {
        return prerrequisitos;
    }

    // Métodos funcionales
    public void inscribirEstudiante(Estudiante estudiante) {
        if (!validarPrerrequisitos(estudiante)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " no cumple con los prerrequisitos.");
            return;
        }
        if (!validarCupos()) {
            System.out.println("No hay cupos disponibles para el curso " + this.nombre);
            return;
        }
        estudiantesInscritos.add(estudiante);
        System.out.println("Estudiante " + estudiante.getNombre() + " inscrito en el curso " + this.nombre);
    }

    public void agregarPrerrequisito(Curso prerrequisito) {
        if (!prerrequisitos.contains(prerrequisito)) {
            prerrequisitos.add(prerrequisito);
            System.out.println("Prerrequisito " + prerrequisito.getNombre() + " agregado al curso " + this.nombre);
        }
    }

    public boolean validarPrerrequisitos(Estudiante estudiante) {
        for (Curso prerrequisito : prerrequisitos) {
            if (!estudiante.hasCursoAprobado(prerrequisito)) {
                return false;
            }
        }
        return true;
    }

    public void agregarCurso() {
        System.out.println("Curso " + this.nombre + " agregado al sistema.");
    }

    public void eliminarCurso() {
        System.out.println("Curso " + this.nombre + " eliminado del sistema.");
    }

    public boolean validarCupos() {
        return estudiantesInscritos.size() < 30;
    }

    public Horario generarHorario() {
        System.out.println("Generando horario para el curso " + this.nombre);
        return new Horario();
    }

    public boolean verificarDisponibilidad() {
        return validarCupos();
    }

    public void mostrarEstudiantesInscritos() {
        System.out.println("Estudiantes inscritos en el curso " + this.nombre + ":");
        for (Estudiante estudiante : estudiantesInscritos) {
            System.out.println("- " + estudiante.getNombre());
        }
    }
