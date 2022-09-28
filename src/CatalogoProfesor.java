import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoProfesor {

    private Scanner scanner;

    public String solicitarNombre() {
        System.out.println("Escribe el nombre: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String solicitarMateria() {
        System.out.println("Escribe la materia que ofrece: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer solicitarEdad() {
        System.out.println("Escribe su edad: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String solicitarFacultad() {
        System.out.println("Escribe la facultad a la que pertenece: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer solicitarClave() {
        System.out.println("Escribe la clave de profesor: ");
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void imprimirInfoTotal(ArrayList<Profesor> estudiantes) {
        estudiantes.forEach(System.out::println);
    }

    public Integer menu() {
        scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1- Agregar Profesor");
        System.out.println("2- Borrar Profesor");
        System.out.println("3- Modificar Profesor");
        System.out.println("4- Desplegar lista");
        System.out.println("5- Desplegar Profesor");
        System.out.println("6- Salir");
        System.out.println("\nOpcion: ");
        return scanner.nextInt();
    }

    public void imprimeInfoBorrado(boolean e) {
        if (e) {
            msgBajaExitosa();
        } else {
            msgNoRegistro();
        }
    }

    public void msgBajaExitosa() {
        System.out.println("Baja exitosa.");
    }

    public void msgModificacionExitosa() {
        System.out.println("Modificacion exitosa.");
    }

    public void msgNoRegistro() {
        System.out.println("No se encuentra el elemento.");
    }

    public void msgError(Integer e, String descripcion) {
        System.out.println("Error " + e);
        System.out.println(descripcion);
    }

    public void msgError() {
        System.out.println("Error");
    }

    public void imprimirInfoProfesor(Profesor obj1) {
        System.out.println(obj1);
    }

    public void msgGracias() {
        System.out.println("Gracias por utilizar el sistema.");
    }

    public void msgVersion() {
        System.out.println("Control Escolar ver. 0.1");
    }

    public Integer menuModificarProfesor() {
        scanner = new Scanner(System.in);
        //scanner.useDelimiter("\n");
        System.out.println("Menu modificacion");
        System.out.println("1- Nombre del Profesor");
        System.out.println("2- Edad del Profesor");
        System.out.println("3- Facultad del profesor");
        System.out.println("4- Materia del profesor");
        System.out.println("5- Salir");
        System.out.println("Opcion: ");
        return scanner.nextInt();
    }

    public void infoActualizacion(boolean e) {
        if (e) {
            msgModificacionExitosa();
        } else {
            msgError();
        }
    }
}
