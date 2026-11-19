package abstractfactory;

public final class Main {
    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        new Application(new LightThemeFactory()).renderInterface();

        System.out.println();
        System.out.println("=== Tema Escuro ===");
        new Application(new DarkThemeFactory()).renderInterface();
    }
}
