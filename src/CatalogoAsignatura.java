

import java.util.Scanner;

public class CatalogoAsignatura {

    Scanner scanner = new Scanner(System.in);

    public int menu() {
        int opcion = 0;

        do {
            System.out.println("Menu Asignaturas");
            System.out.println("1. Añadir Asignatura a mi Cardex");
            System.out.println("2. Eliminar Asignatura de mi Cardex");
            System.out.println("3. Mostrar Cardex");
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
            System.out.println("Ingrese su semestre: ");
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
            System.out.println("Ingrese su matricula: ");
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
            System.out.println("Ingrese la clave de la materia: ");
            clave = scanner.next();

            claveBoolean = ((clave.isBlank()) || (clave.length() != 4));
            if (claveBoolean) {
                System.out.println("Verifique la clave ingresada.");
            }

        } while(claveBoolean);

        return clave.toUpperCase();
    }

}
