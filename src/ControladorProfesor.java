import java.util.ArrayList;

public class ControladorProfesor {

    ArrayList<Profesor> estList;
    CatalogoProfesor vista;
    Profesor obj1;

    ControladorProfesor(CatalogoProfesor vista) {
        estList = new ArrayList<Profesor>();
        this.vista = vista;
        this.vista.msgVersion();
    }

    public void addProfesor() {
        obj1 = new Profesor(vista.solicitarNombre(),
                vista.solicitarMateria(),
                vista.solicitarEdad(),
                vista.solicitarFacultad(),
                vista.solicitarClave());
        estList.add(obj1);
    }

    public void menuProfesores(){
        int opcion = 0;
        while (opcion != 6){
            switch (vista.menu()){
                case 1:
                    addProfesor();
                    break;
                case 2:
                    Integer aux = vista.solicitarClave();
                    vista.imprimeInfoBorrado(borrarProfesor(aux));
                    break;
                case 3:
                    menuModificarProfesor();
                    break;
                case 4:
                    vista.imprimirInfoTotal(estList);
                    break;
                case 5:
                    aux = vista.solicitarClave();
                    Integer pos = buscarProfesor(aux);
                    vista.imprimirInfoProfesor(estList.get(pos));
                    break;
                case 6:
                    opcion = 6;
                    vista.msgGracias();
                    break;
            }
        }
    }

    private Integer buscarProfesor(Integer clave) {
        for (int i = 0; i < estList.size(); i++){
            if (clave == estList.get(i).getClave()) {
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
            vista.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setNombre(vista.solicitarNombre());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarEdadProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setEdad(vista.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarFacultadProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setEdad(vista.solicitarEdad());
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarMateriaProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            vista.imprimirInfoProfesor(estList.get(indiceProfesor));
            estList.get(indiceProfesor).setEdad(vista.solicitarEdad());
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
            switch (vista.menuModificarProfesor()) {
                case 1:
                    auxClave = vista.solicitarClave();
                    resultado = modificarNombreProfesor(auxClave);
                    break;
                case 2:
                    auxClave = vista.solicitarClave();
                    resultado = modificarEdadProfesor(auxClave);
                    break;
                case 3:
                    auxClave = vista.solicitarClave();
                    resultado = modificarFacultadProfesor(auxClave);
                    break;
                case 4:
                    auxClave = vista.solicitarClave();
                    resultado = modificarMateriaProfesor(auxClave);
                    break;
                case 5:
                    opcion = 5;
                    break;
            }
        }
    }

}
