

import java.util.Scanner;

public class CatalogoAsignatura {
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        int opcion = 0;

        do {
            System.out.println("Menu Asignaturas");
            System.out.println("1. Añadir Asignatura al Kardex");
            System.out.println("2. Eliminar Asignatura del Kardex");
            System.out.println("3. Mostrar Kardex");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            if ((opcion < 1) || (opcion > 4)) {
                System.out.println("Verifique que la opcion ingresada se encuentre en el menu.");
            }
        } while((opcion < 1) || (opcion > 4));

        return opcion;
    }

    public int solicitarSemestre() {
        int semestre = 0;

        do {
            System.out.print("\nIngrese su semestre: ");
            semestre = scanner.nextInt();

            if ((semestre < 1) || (semestre > 9)) {
                System.out.println("Verifieque el semestre ingresado.");
            }
        } while((semestre < 1) || (semestre > 9));

        return semestre;
    }

    public String solicitarMatricula() {
        String matricula = "N/A";
        boolean matriculaBoolean;

        do {
            System.out.print("\nIngrese su matricula: ");
            matricula = scanner.next();

            matriculaBoolean = matricula.isBlank();
            if (matriculaBoolean) {
                System.out.println("Verifique la matricula ingresada.");
            }
        } while (matriculaBoolean);

        return matricula;
    }

    public String solicitarClave() {
        String clave = "N/A";
        boolean claveBoolean;

        do {
            System.out.print("\nIngrese la clave de la materia: ");
            clave = scanner.next();

            claveBoolean = ((clave.isBlank()) || (clave.length() != 4));
            if (claveBoolean) {
                System.out.println("Verifique la clave ingresada.");
            }
        } while(claveBoolean);

        return clave.toUpperCase();
    }

    public boolean agregarAsignatura() {
        String respuesta = "N/A";
        boolean respuestaBoolean;

        do {
            System.out.print("\n¿Desea agregar otra asignatura? (S/N): ");
            respuesta = scanner.next();

            respuestaBoolean = ((respuesta.isBlank()) || (respuesta.length() != 1) ||
                    (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N")));

            if (respuestaBoolean) {
                System.out.println("Verifique la respuesta ingresada.");
            }
        } while(respuestaBoolean);

        return respuesta.equalsIgnoreCase("S");
    }

    public void msgAsignaturaAgregada() {
        System.out.println("Asignatura agregada con exito.");
    }

    public void msgAsignaturaEliminada() {
        System.out.println("Asignatura eliminada con exito.");
    }

    public void msgAsignaturaNoCorresponde() {
        System.out.println("Asignatura no corresponde al semestre.");
    }

    public void msgCreditosExcedidos() {
        System.out.println("Creditos excedidos. No puedes agregar mas asignaturas.");
    }

    public void msgAsignaturaRepetida() {
        System.out.println("Asignatura repetida. No puedes agregarla de nuevo.");
    }

    public void msgNoEncuentraKardex() {
        System.out.println("No se encontró ningún Kardex relacionado con la matrícula ingresada.");
    }


}
