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
        int opcion = 0;

        while (opcion != 4) {
            switch (vistaPrincipal.menu()) {
                case 1:
                    estudiantes.menuEstudiantes();
                    break;
                case 2:
                    profesores.menuProfesores();
                    break;
                case 3:
                    asignaturas.menuAsignaturas();
                    break;
                case 4:
                    opcion = 4;
                    vistaPrincipal.msgGracias();
                    break;
            }
        }
    }
}
