package entidad;

import java.util.ArrayList;
import java.util.List;


public class HistorialAcademico {

    private String codigoHistorial;
    private float promedioGeneral;
    private Estudiante estudiante;
    private List<Curso> cursosAprobados;
    private List<Curso> cursosEnProceso;

    // Constructor vacío
    public HistorialAcademico() {
        this.cursosAprobados = new ArrayList<>();
        this.cursosEnProceso = new ArrayList<>();
    }

    // Constructor con parámetros
    public HistorialAcademico(String codigoHistorial, float promedioGeneral, Estudiante estudiante,
                              List<Curso> cursosAprobados, List<Curso> cursosEnProceso) {
        this.codigoHistorial = codigoHistorial;
        this.promedioGeneral = promedioGeneral;
        this.estudiante = estudiante;
        this.cursosAprobados = cursosAprobados != null ? cursosAprobados : new ArrayList<>();
        this.cursosEnProceso = cursosEnProceso != null ? cursosEnProceso : new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoHistorial() {
        return codigoHistorial;
    }

    public void setCodigoHistorial(String codigoHistorial) {
        this.codigoHistorial = codigoHistorial;
    }

    public float getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Curso> getCursosAprobados() {
        return cursosAprobados;
    }

    public List<Curso> getCursosEnProceso() {
        return cursosEnProceso;
    }

    // Métodos
    public void consultar() {
        System.out.println("--- Historial Académico de " + estudiante.getNombre() + " ---");
        System.out.println("Código: " + codigoHistorial);
        System.out.println("Promedio General: " + promedioGeneral);

        System.out.println("\nCursos en proceso:");
        if (cursosEnProceso.isEmpty()) {
            System.out.println("No hay cursos en proceso.");
        } else {
            for (Curso curso : cursosEnProceso) {
                System.out.println("- " + curso.getNombre() + " (Código: " + curso.getCodigo() + ")");
            }
        }

        System.out.println("\nCursos aprobados:");
        if (cursosAprobados.isEmpty()) {
            System.out.println("No hay cursos aprobados.");
        } else {
            for (Curso curso : cursosAprobados) {
                System.out.println("- " + curso.getNombre() + " (Código: " + curso.getCodigo() + ")");
            }
        }
    }

    public String generarReporteDesempeño() {
        return "Reporte de desempeño del estudiante " + estudiante.getNombre() +
                "\nPromedio General: " + promedioGeneral;
    }

    public float calcularProyeccionRendimiento() {
        return promedioGeneral * 1.1f; // Simulación de proyección
    }

    public List<Curso> generarReporteCursosAprobados() {
        return new ArrayList<>(cursosAprobados);
    }

    public List<Curso> generarReporteCursosEnProceso() {
        return new ArrayList<>(cursosEnProceso);
    }

    public void agregarCursoHistorial(Curso curso, float nota) {
        if (nota >= 3.0) {
            cursosAprobados.add(curso);
        } else {
            cursosEnProceso.add(curso);
        }
    }
}