public class Main {
    public static void main(String[] args) {

        CatalogoPrincipal vistaPrincipal = new CatalogoPrincipal();
        ControladorPrincipal Principal = new ControladorPrincipal(vistaPrincipal);
        Principal.menuPrincipal();
    }
}