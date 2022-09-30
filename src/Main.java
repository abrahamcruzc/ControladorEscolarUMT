public class Main {
    public static void main(String[] args) {
//        CatalogoEstudiante vista = new CatalogoEstudiante();
//
//        ControladorEstudiante Estudiantes = new ControladorEstudiante(vista);
//
//        Estudiantes.menuEstudiantes();

        CatalogoAsignatura vistaAsignatura = new CatalogoAsignatura();

        ControladorAsignatura asignaturas = new ControladorAsignatura(vistaAsignatura);

        asignaturas.menuAsignaturas();

//        CatalogoProfesor vista = new CatalogoProfesor();
//
//        ControladorProfesor Profesores = new ControladorProfesor(vista);
//
//        Profesores.menuProfesores();
    }
}