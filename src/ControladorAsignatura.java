import java.util.ArrayList;

public class ControladorAsignatura {

    ArrayList<String> estList;
    ArrayList<String> auxList;
    CatalogoAsignatura vistaAsignatura;
    Asignatura obj1 = new Asignatura();

    ControladorAsignatura(CatalogoAsignatura vistaAsignatura) {
        estList = new ArrayList<>();
        auxList = new ArrayList<>();
        this.vistaAsignatura = vistaAsignatura;
    }

    public void menuAsignaturas() {
        int opcion = vistaAsignatura.menu();

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    addAsignaturas();
                    opcion = vistaAsignatura.menu();
                    break;
                case 2:
                    eliminarAsignatura();
                    opcion = vistaAsignatura.menu();
                    break;
                case 3:
                    imprimirKardex();
                    opcion = vistaAsignatura.menu();
                    break;
            }
        }
    }

    public void addAsignaturas() {
        String clave;
        String matricula = vistaAsignatura.solicitarMatricula();
        int semestre = vistaAsignatura.solicitarSemestre();
        printAsignaturas(semestre);

        switch (semestre) {
            case 1:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre1(clave);
                break;
            case 2:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre2(clave);
                break;
            case 3:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre3(clave);
                break;
            case 4:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre4(clave);
                break;
            case 5:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre5(clave);
                break;
            case 6:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre6(clave);
                break;
            case 7:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre7(clave);
                break;
            case 8:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre8(clave);
                break;
            case 9:
                estList = new ArrayList<>();
                estList.add(matricula);
                clave = vistaAsignatura.solicitarClave();
                addSemestre9(clave);
                break;
        }
    }

    public void eliminarAsignatura() {
        int semestre = vistaAsignatura.solicitarSemestre();

        switch (semestre) {
            case 1:
                eliminarAsignatura1();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }

    public void imprimirKardex() {
        int semestre = vistaAsignatura.solicitarSemestre();

        switch (semestre) {
            case 1:
                imprimirKardex1();
                break;
            case 2:
                imprimirKardex2();
                break;
            case 3:
                imprimirKardex3();
                break;
            case 4:
                imprimirKardex4();
                break;
            case 5:
                imprimirKardex5();
                break;
            case 6:
                imprimirKardex6();
                break;
            case 7:
                imprimirKardex7();
                break;
            case 8:
                imprimirKardex8();
                break;
            case 9:
                imprimirKardex9();
                break;
        }
    }


    public void addSemestre1(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves1erSemestre().length; i++) {
                claveBoolean = obj1.getClaves1erSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas1erSemestre()[i]);
                    totalCreditos += obj1.getCreditos1erSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos1erSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre2(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves2doSemestre().length; i++) {
                claveBoolean = obj1.getClaves2doSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas2doSemestre()[i]);
                    totalCreditos += obj1.getCreditos2doSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos2doSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre3(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves3erSemestre().length; i++) {
                claveBoolean = obj1.getClaves3erSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas3erSemestre()[i]);
                    totalCreditos += obj1.getCreditos3erSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos3erSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre4(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves4toSemestre().length; i++) {
                claveBoolean = obj1.getClaves4toSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas4toSemestre()[i]);
                    totalCreditos += obj1.getCreditos4toSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos4toSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre5(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves5toSemestre().length; i++) {
                claveBoolean = obj1.getClaves5toSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas5toSemestre()[i]);
                    totalCreditos += obj1.getCreditos5toSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos5toSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre6(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves6toSemestre().length; i++) {
                claveBoolean = obj1.getClaves6toSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas6toSemestre()[i]);
                    totalCreditos += obj1.getCreditos6toSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos6toSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre7(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves7moSemestre().length; i++) {
                claveBoolean = obj1.getClaves7moSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas7moSemestre()[i]);
                    totalCreditos += obj1.getCreditos7moSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos7moSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre8(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves8voSemestre().length; i++) {
                claveBoolean = obj1.getClaves8voSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas8voSemestre()[i]);
                    totalCreditos += obj1.getCreditos8voSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos8voSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void addSemestre9(String clave) {
        boolean claveBoolean = false;
        int totalCreditos = 0;
        boolean respuestaAgregar = false;
        boolean creditosEnRango = true;

        do {
            auxList.add(clave);

            for (int i = 0; i < obj1.getClaves9noSemestre().length; i++) {
                claveBoolean = obj1.getClaves9noSemestre()[i].equals(clave);

                if (claveBoolean) {
                    estList.add(obj1.getAsignaturas9noSemestre()[i]);
                    totalCreditos += obj1.getCreditos9noSemestre()[i];

                    if (totalCreditos > 25) {
                        creditosEnRango = false;
                        vistaAsignatura.msgCreditosExcedidos();
                        estList.remove(estList.size() - 1);
                        totalCreditos -= obj1.getCreditos9noSemestre()[estList.size() - 1];
                        break;
                    }
                    vistaAsignatura.msgAsignaturaAgregada();

                    System.out.println("\tAsignaturas Agregadas = " + estList.subList(1, estList.size()));
                    System.out.println("\tCreditos Agredados = " + totalCreditos);
                }
            }

            if (creditosEnRango) {
                respuestaAgregar = vistaAsignatura.agregarAsignatura();

                if (respuestaAgregar) {
                    clave = vistaAsignatura.solicitarClave();

                    if (auxList.contains(clave)) {
                        vistaAsignatura.msgAsignaturaRepetida();
                        break;
                    }
                }
            }
        } while (respuestaAgregar && creditosEnRango);
    }

    public void eliminarAsignatura1() {
        System.out.println("--MENÚ DE ELIMINACIÓN--");
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {
            String clave = vistaAsignatura.solicitarClave();

            for (int j = 0; j < obj1.getClaves1erSemestre().length; j++) {
                if (obj1.getClaves1erSemestre()[j].equals(clave)) {
                    estList.remove(obj1.getAsignaturas1erSemestre()[j]);
                    vistaAsignatura.msgAsignaturaEliminada();
                }
            }

            for (int i = 0; i < obj1.getAsignaturas1erSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas1erSemestre()[i])) {
                    creditos += obj1.getCreditos1erSemestre()[i];
                }
            }
        }
        System.out.println("\tAsignaturas: " + estList.subList(1, estList.size()));
        System.out.println("\tCréditos: " + creditos);
    }

    public void eliminarAsignatura2() {

    }

    public void imprimirKardex1() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas1erSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas1erSemestre()[i])) {
                    creditos += obj1.getCreditos1erSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }

    public void imprimirKardex2() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas2doSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas2doSemestre()[i])) {
                    creditos += obj1.getCreditos2doSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }

    public void imprimirKardex3() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas3erSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas3erSemestre()[i])) {
                    creditos += obj1.getCreditos3erSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }

    public void imprimirKardex4() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas4toSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas4toSemestre()[i])) {
                    creditos += obj1.getCreditos4toSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }

    public void imprimirKardex5() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas5toSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas5toSemestre()[i])) {
                    creditos += obj1.getCreditos5toSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }

    public void imprimirKardex6() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas6toSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas6toSemestre()[i])) {
                    creditos += obj1.getCreditos6toSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }
    public void imprimirKardex7() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas7moSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas7moSemestre()[i])) {
                    creditos += obj1.getCreditos7moSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }

    public void imprimirKardex8() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas8voSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas8voSemestre()[i])) {
                    creditos += obj1.getCreditos8voSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }

    public void imprimirKardex9() {
        String matricula = vistaAsignatura.solicitarMatricula();
        int creditos = 0;

        if (estList.contains(matricula)) {

            for (int i = 0; i < obj1.getAsignaturas9noSemestre().length; i++) {
                if (estList.contains(obj1.getAsignaturas9noSemestre()[i])) {
                    creditos += obj1.getCreditos9noSemestre()[i];
                }
            }

            System.out.println("Asignaturas: " + estList.subList(1, estList.size()));
            System.out.println("Creditos: " + creditos);
            System.out.println();
        } else {
            vistaAsignatura.msgNoEncuentraKardex();
        }
    }



    public void printAsignaturas(int semestre) {
        switch (semestre) {
            case 1:
                System.out.println("\n- ASIGNATURAS PRIMER SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas1erSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves1erSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos1erSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas1erSemestre()[i]+ "]");
                }
                break;
            case 2:
                System.out.println("\n- ASIGNATURAS SEGUNDO SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas2doSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves2doSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos2doSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas2doSemestre()[i]+ "]");
                }
                break;
            case 3:
                System.out.println("\n- ASIGNATURAS TERCER SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas3erSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves3erSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos3erSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas3erSemestre()[i]+ "]");
                }
                break;
            case 4:
                System.out.println("\n- ASIGNATURAS CUARTO SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas4toSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves4toSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos4toSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas4toSemestre()[i]+ "]");
                }
                break;
            case 5:
                System.out.println("\n- ASIGNATURAS QUINTO SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas5toSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves5toSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos5toSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas5toSemestre()[i]+ "]");
                }
                break;
            case 6:
                System.out.println("\n- ASIGNATURAS SEXTO SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas6toSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves6toSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos6toSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas6toSemestre()[i]+ "]");
                }
                break;
            case 7:
                System.out.println("\n- ASIGNATURAS SEPTIMO SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas7moSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves7moSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos7moSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas7moSemestre()[i]+ "]");
                }
                break;
            case 8:
                System.out.println("\n- ASIGNATURAS OCTAVO SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas8voSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves8voSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos8voSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas8voSemestre()[i]+ "]");
                }
                break;
            case 9:
                System.out.println("\n- ASIGNATURAS NOVENO SEMESTRE -");
                for (int i = 0; i < obj1.getAsignaturas9noSemestre().length; i++) {
                    System.out.println("Clave: " + "[" + obj1.getClaves9noSemestre()[i] + "]" + " " +
                            "Créditos: " + "[" + obj1.getCreditos9noSemestre()[i] + "]" + " " +
                            "Asignatura: " + "[" + obj1.getAsignaturas9noSemestre()[i]+ "]");
                }
                break;
        }
    }



}