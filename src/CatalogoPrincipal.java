import java.util.Scanner;

public class CatalogoPrincipal {
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        int opcion;

        do {
            System.out.println("\n- MENÚ PRINCIPAL -");
            System.out.println("1. Menú Estudiantes");
            System.out.println("2. Menú Profesores");
            System.out.println("3. Menú Asignaturas");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            if ((opcion < 1) || (opcion > 4)) {
                System.out.println("Verifique que la opción ingresada se encuentre en el menú.");
            }
        } while((opcion < 1) || (opcion > 4));

        return opcion;
    }
}
