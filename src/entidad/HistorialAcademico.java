package entidad;

import java.util.List;

public class HistorialAcademico {
    private List<Curso> cursosAprobados;
    private List<Curso> cursosEnProceso;

    public HistorialAcademico() {
    }

    public HistorialAcademico(List<Curso> cursosAprobados, List<Curso> cursosEnProceso) {
        this.cursosAprobados = cursosAprobados;
        this.cursosEnProceso = cursosEnProceso;
    }

    public void consultar(){
        System.out.println("--- Historial Académico ---");

        System.out.println("\nCursos en proceso:");
        if (cursosEnProceso == null || cursosEnProceso.isEmpty()){
            System.out.println("No hay cursos en proceso");
        }
        else{
            for (Curso curso : cursosEnProceso){
                System.out.println("- "+curso.getNombre() + " (Código: "+curso.getCodigo()+")");
            }
        }

        System.out.println("\nCursos aprobados:");
        if(cursosAprobados == null || cursosAprobados.isEmpty()){
            System.out.println("No hay cursos aprobados");
        }
        else{
            for (Curso curso : cursosAprobados){
                System.out.println("- "+curso.getNombre() + " (Código: "+curso.getCodigo()+")");
            }
        }
    }
}
