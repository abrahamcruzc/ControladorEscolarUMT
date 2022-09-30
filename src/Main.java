public class Main {
    public static void main(String[] args) {

        CatalogoPrincipal vistaPrincipal = new CatalogoPrincipal();
        ControladorPrincipal principal = new ControladorPrincipal(vistaPrincipal);
        principal.menuPrincipal();
    }
}