package entidad;

import java.util.ArrayList;
import java.util.Collections;
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
        this.cursosAprobados = (cursosAprobados != null) ? new ArrayList<>(cursosAprobados) : new ArrayList<>();
        this.cursosEnProceso = (cursosEnProceso != null) ? new ArrayList<>(cursosEnProceso) : new ArrayList<>();
    }

    // Getters y Setters
    public String getCodigoHistorial() { return codigoHistorial; }
    public void setCodigoHistorial(String codigoHistorial) { this.codigoHistorial = codigoHistorial; }
    
    public float getPromedioGeneral() { return promedioGeneral; }
    public void setPromedioGeneral(float promedioGeneral) { this.promedioGeneral = promedioGeneral; }

    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }

    public List<Curso> getCursosAprobados() { return Collections.unmodifiableList(cursosAprobados); }
    public List<Curso> getCursosEnProceso() { return Collections.unmodifiableList(cursosEnProceso); }

    // Métodos
    public void consultar() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Historial Académico de ").append(estudiante.getNombre()).append(" ---\n")
          .append("Código: ").append(codigoHistorial).append("\n")
          .append("Promedio General: ").append(promedioGeneral).append("\n\n");

        sb.append("Cursos en proceso:\n");
        if (cursosEnProceso.isEmpty()) {
            sb.append("No hay cursos en proceso.\n");
        } else {
            for (Curso curso : cursosEnProceso) {
                sb.append("- ").append(curso.getNombre()).append(" (Código: ").append(curso.getCodigo()).append(")\n");
            }
        }

        sb.append("\nCursos aprobados:\n");
        if (cursosAprobados.isEmpty()) {
            sb.append("No hay cursos aprobados.\n");
        } else {
            for (Curso curso : cursosAprobados) {
                sb.append("- ").append(curso.getNombre()).append(" (Código: ").append(curso.getCodigo()).append(")\n");
            }
        }
        
        System.out.println(sb.toString());
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
        final float NOTA_APROBACION = 3.0f; // Puede cambiar según la institución
        if (nota >= NOTA_APROBACION) {
            cursosAprobados.add(curso);
        } else {
            cursosEnProceso.add(curso);
        }
    }
}
