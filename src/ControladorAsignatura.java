import java.util.ArrayList;

public class ControladorAsignatura {

    ArrayList<Asignatura> estList;
    CatalogoAsignatura vista;
    Asignatura obj1 = new Asignatura();

    ControladorAsignatura(CatalogoAsignatura vista) {
        estList = new ArrayList<Asignatura>();
        this.vista = vista;
    }

    public void menuAsignaturas() {
        int opcion = vista.menu();

        while (opcion != 4) {

            switch (opcion) {
                case 1:
                    addAsignaturas();
                    System.exit(0);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
            }
        }
    }

    public void addAsignaturas() {
        printAsignaturas();
        String matricula = vista.solicitarMatricula();
        String clave = vista.solicitarClave();




    }

    public void printAsignaturas() {
        int semestre = vista.solicitarSemestre();

        switch (semestre) {
            case 1 -> print1erSemestre();
            case 2 -> print2doSemestre();
            case 3 -> print3erSemestre();
            case 4 -> print4toSemestre();
            case 5 -> print5toSemestre();
            case 6 -> print6toSemestre();
            case 7 -> print7moSemestre();
            case 8 -> print8voSemestre();
            case 9 -> print9noSemestre();
        }
    }

    public void print1erSemestre() {
        String[] asignaturas = obj1.getAsignaturas1erSemestre();
        String[] claves = obj1.getClaves1erSemestre();
        Integer[] creditos = obj1.getCreditos1erSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print2doSemestre() {
        String[] asignaturas = obj1.getAsignaturas2doSemestre();
        String[] claves = obj1.getClaves2doSemestre();
        Integer[] creditos = obj1.getCreditos2doSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print3erSemestre() {
        String[] asignaturas = obj1.getAsignaturas3erSemestre();
        String[] claves = obj1.getClaves3erSemestre();
        Integer[] creditos = obj1.getCreditos3erSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print4toSemestre() {
        String[] asignaturas = obj1.getAsignaturas4toSemestre();
        String[] claves = obj1.getClaves4toSemestre();
        Integer[] creditos = obj1.getCreditos4toSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print5toSemestre() {
        String[] asignaturas = obj1.getAsignaturas5toSemestre();
        String[] claves = obj1.getClaves5toSemestre();
        Integer[] creditos = obj1.getCreditos5toSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print6toSemestre() {
        String[] asignaturas = obj1.getAsignaturas6toSemestre();
        String[] claves = obj1.getClaves6toSemestre();
        Integer[] creditos = obj1.getCreditos6toSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print7moSemestre() {
        String[] asignaturas = obj1.getAsignaturas7moSemestre();
        String[] claves = obj1.getClaves7moSemestre();
        Integer[] creditos = obj1.getCreditos7moSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print8voSemestre() {
        String[] asignaturas = obj1.getAsignaturas8voSemestre();
        String[] claves = obj1.getClaves8voSemestre();
        Integer[] creditos = obj1.getCreditos8voSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }

    public void print9noSemestre() {
        String[] asignaturas = obj1.getAsignaturas9noSemestre();
        String[] claves = obj1.getClaves9noSemestre();
        Integer[] creditos = obj1.getCreditos9noSemestre();
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Clave: " + "[" + claves[i] + "]" + " " +
                    "Asignatura: " + "[" + asignaturas[i] + "]" + " " +
                    "Creditos: " + "[" + creditos[i]+ "]");
        }
    }


}
