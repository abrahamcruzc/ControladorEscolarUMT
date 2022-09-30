import java.util.ArrayList;
import java.util.Objects;

public class ControladorProfesor {

    ArrayList<Profesor> estList;
    CatalogoProfesor vistaProfesor;
    Profesor obj1;

    ControladorProfesor(CatalogoProfesor vistaProfesor) {
        estList = new ArrayList<Profesor>();
        this.vistaProfesor = vistaProfesor;
        this.vistaProfesor.msgVersion();
    }

    public void addProfesor() {
        obj1 = new Profesor(vistaProfesor.solicitarNombre(),
                vistaProfesor.solicitarMateria(),
                vistaProfesor.solicitarEdad(),
                vistaProfesor.solicitarFacultad(),
                vistaProfesor.solicitarClave());
        estList.add(obj1);
    }

    public void menuProfesores(){
        int opcion = 0;
        while (opcion != 6){
            switch (vistaProfesor.menu()){
                case 1:
                    addProfesor();
                    break;
                case 2:
                    Integer aux = vistaProfesor.solicitarClave();
                    vistaProfesor.imprimeInfoBorrado(borrarProfesor(aux));
                    break;
                case 3:
                    menuModificarProfesor();
                    break;
                case 4:
                    vistaProfesor.imprimirInfoTotal(estList);
                    break;
                case 5:
                    aux = vistaProfesor.solicitarClave();
                    Integer pos = buscarProfesor(aux);
                    vistaProfesor.imprimirInfoProfesor(estList.get(pos));
                    break;
                case 6:
                    opcion = 6;
                    vistaProfesor.msgGracias();
                    break;
            }
        }
    }

    private Integer buscarProfesor(Integer clave) {
        for (int i = 0; i < estList.size(); i++){
            if (Objects.equals(clave, estList.get(i).getClave())) {
                return i;
            }
        }
        return -1;
    }

    private boolean borrarProfesor(Integer clave) {
        Integer indiceEst = buscarProfesor(clave);
        if (indiceEst != -1) {
            estList.remove((int)indiceEst);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarNombreProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vistaProfesor.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setNombre(vistaProfesor.solicitarNombre());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarEdadProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vistaProfesor.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setEdad(vistaProfesor.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarFacultadProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vistaProfesor.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setEdad(vistaProfesor.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarMateriaProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vistaProfesor.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setEdad(vistaProfesor.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    private void menuModificarProfesor() {
        Integer opcion = 0;
        Integer auxClave = 0;
        boolean resultado;

        while (opcion != 5) {
            switch (vistaProfesor.menuModificarProfesor()) {
                case 1:
                    auxClave = vistaProfesor.solicitarClave();
                    resultado = modificarNombreProfesor(auxClave);
                    vistaProfesor.msgAgregadoExitoso();
                    break;
                case 2:
                    auxClave = vistaProfesor.solicitarClave();
                    resultado = modificarEdadProfesor(auxClave);
                    vistaProfesor.msgModificacionExitosa();
                    break;
                case 3:
                    auxClave = vistaProfesor.solicitarClave();
                    resultado = modificarFacultadProfesor(auxClave);
                    vistaProfesor.msgModificacionExitosa();
                    break;
                case 4:
                    auxClave = vistaProfesor.solicitarClave();
                    resultado = modificarMateriaProfesor(auxClave);
                    vistaProfesor.msgModificacionExitosa();
                    break;
                case 5:
                    opcion = 5;
                    break;
            }
        }
    }
}
