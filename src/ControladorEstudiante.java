import java.util.ArrayList;

public class ControladorEstudiante {

    ArrayList<Estudiante> estList;
    CatalogoEstudiante vistaEstudiante;
    Estudiante obj1;

    ControladorEstudiante(CatalogoEstudiante vistaEstudiante) {
        estList = new ArrayList<Estudiante>();
        this.vistaEstudiante = vistaEstudiante;
        this.vistaEstudiante.msgVersion();
    }

    public void addEstudiante() {
        obj1 = new Estudiante(vistaEstudiante.solicitarMatricula(),
                vistaEstudiante.solicitarNombre(),
                vistaEstudiante.solicitarEdad(),
                vistaEstudiante.solicitarSemestre(),
                vistaEstudiante.solicitarFacultad(),
                vistaEstudiante.solicitarPromedio());
        estList.add(obj1);
    }

    public void menuEstudiantes(){
        int opcion = 0;
        while (opcion != 6){
            switch (vistaEstudiante.menu()){
                case 1:
                    addEstudiante();
                    break;
                case 2:
                    Integer aux = vistaEstudiante.solicitarMatricula();
                    vistaEstudiante.imprimeInfoBorrado(borrarEstudiante(aux));
                    break;
                case 3:
                    menuModificarEstudiante();
                    break;
                case 4:
                    vistaEstudiante.imprimirInfoTotal(estList);
                    break;
                case 5:
                    aux = vistaEstudiante.solicitarMatricula();
                    Integer pos = buscarEstudiante(aux);
                    vistaEstudiante.imprimirInfoEstudiante(estList.get(pos));
                    break;
                case 6:
                    opcion = 6;
                    vistaEstudiante.msgGracias();
                    break;
            }
        }
    }

    private Integer buscarEstudiante(Integer matricula) {
        for (int i = 0; i < estList.size(); i++){
            if (matricula.equals(estList.get(i).getMatricula())) {
                return i;
            }
        }
        return -1;
    }

    private boolean borrarEstudiante(Integer matricula) {
        Integer indiceEst = buscarEstudiante(matricula);
        if (indiceEst != -1) {
            estList.remove((int)indiceEst);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarNombreEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vistaEstudiante.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setNombre(vistaEstudiante.solicitarNombre());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarEdadEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vistaEstudiante.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setEdad(vistaEstudiante.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarPromedioEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            vistaEstudiante.imprimirInfoEstudiante(estList.get(indiceEstudiante));
            estList.get(indiceEstudiante).setPromedio(vistaEstudiante.solicitarPromedio());
            return true;
        } else {
            return false;
        }
    }

    private void menuModificarEstudiante() {
        int opcion = 0;
        Integer auxMatricula = 0;
        boolean resultado;

        while (opcion != 4) {
            switch (vistaEstudiante.menuModificarEstudiante()) {
                case 1:
                    auxMatricula = vistaEstudiante.solicitarMatricula();
                    resultado = modificarNombreEstudiante(auxMatricula);
                    break;
                case 2:
                    auxMatricula = vistaEstudiante.solicitarMatricula();
                    resultado = modificarEdadEstudiante(auxMatricula);
                    break;
                case 3:
                    auxMatricula = vistaEstudiante.solicitarMatricula();
                    resultado = modificarPromedioEstudiante(auxMatricula);
                    break;
                case 4:
                    opcion = 4;
                    break;
            }
        }
    }
}
