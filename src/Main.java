public class Main {
    public static void main(String[] args) {
//        CatalogoEstudiante vista = new CatalogoEstudiante();
//
//        ControladorEstudiante Estudiantes = new ControladorEstudiante(vista);
//
//        Estudiantes.menuEstudiantes();

//        CatalogoAsignatura vista = new CatalogoAsignatura();
//
//        ControladorAsignatura asignaturas = new ControladorAsignatura(vista);
//
//        asignaturas.menuAsignaturas();

        CatalogoProfesor vista = new CatalogoProfesor();

        ControladorProfesor Profesores = new ControladorProfesor(vista);

        Profesores.menuProfesores();
    }
}