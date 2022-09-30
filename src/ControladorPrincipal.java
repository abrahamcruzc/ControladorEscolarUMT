public class ControladorPrincipal {
    CatalogoPrincipal vistaPrincipal;

    CatalogoEstudiante vistaEstudiante = new CatalogoEstudiante();
    ControladorEstudiante estudiantes = new ControladorEstudiante(vistaEstudiante);


    CatalogoProfesor vistaProfesor = new CatalogoProfesor();
    ControladorProfesor profesores = new ControladorProfesor(vistaProfesor);

    CatalogoAsignatura vistaAsignatura = new CatalogoAsignatura();
    ControladorAsignatura asignaturas = new ControladorAsignatura(vistaAsignatura);

    ControladorPrincipal(CatalogoPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    public void menuPrincipal() {
        int opcion = vistaPrincipal.menu();

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    estudiantes.menuEstudiantes();
                    opcion = vistaPrincipal.menu();
                    break;
                case 2:
                    profesores.menuProfesores();
                    opcion = vistaPrincipal.menu();
                    break;
                case 3:
                    asignaturas.menuAsignaturas();
                    opcion = vistaPrincipal.menu();
                    break;
            }
        }
    }
}
