package abstractfactory;

public final class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Renderizando Checkbox com tema claro");
    }
}
