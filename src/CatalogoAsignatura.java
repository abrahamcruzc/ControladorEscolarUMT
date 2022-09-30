

import java.util.Scanner;

public class CatalogoAsignatura {
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        int opcion;

        do {
            System.out.println("\n- MENÚ ASIGNATURAS -");
            System.out.println("1. Añadir Asignatura al Kardex");
            System.out.println("2. Eliminar Asignatura del Kardex");
            System.out.println("3. Mostrar Kardex");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            if ((opcion < 1) || (opcion > 4)) {
                System.out.println("Verifique que la opción ingresada se encuentre en el menú.");
            }
        } while((opcion < 1) || (opcion > 4));

        return opcion;
    }

    public int solicitarSemestre() {
        int semestre;

        do {
            System.out.print("Ingrese su semestre: ");
            semestre = scanner.nextInt();

            if ((semestre < 1) || (semestre > 9)) {
                System.out.println("Verifique que el semestre ingresado sea correcto.");
            }
        } while((semestre < 1) || (semestre > 9));

        return semestre;
    }

    public String solicitarMatricula() {
        String matricula;
        boolean matriculaBoolean;

        do {
            System.out.print("Ingrese su matrícula: ");
            matricula = scanner.next();

            matriculaBoolean = matricula.isBlank();
            if (matriculaBoolean) {
                System.out.println("Verifique que la matrícula ingresada sea correcta.");
            }
        } while (matriculaBoolean);

        return matricula;
    }

    public String solicitarClave() {
        String clave;
        boolean claveBoolean;

        do {
            System.out.print("Ingrese la clave de la asignatura: ");
            clave = scanner.next();

            claveBoolean = ((clave.isBlank()) || (clave.length() != 4));
            if (claveBoolean) {
                System.out.println("Verifique que la clave ingresada sea correcta.");
            }
        } while(claveBoolean);

        return clave.toUpperCase();
    }

    public boolean agregarAsignatura() {
        String respuesta;
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
        System.out.println("Asignatura agregada con éxito.");
    }

    public void msgAsignaturaEliminada() {
        System.out.println("Asignatura eliminada con éxito.");
    }

    public void msgAsignaturaNoCorresponde() {
        System.out.println("Asignatura no corresponde al semestre.");
    }

    public void msgCreditosExcedidos() {
        System.out.println("Créditos excedidos. No puedes agregar más asignaturas.");
    }

    public void msgAsignaturaRepetida() {
        System.out.println("Asignatura repetida. No puedes agregarla de nuevo.");
    }

    public void msgNoEncuentraKardex() {
        System.out.println("No se encontró ningún Kardex relacionado con la matrícula ingresada.");
    }


}
