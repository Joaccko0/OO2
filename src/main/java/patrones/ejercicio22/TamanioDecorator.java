package patrones.ejercicio22;

public class TamanioDecorator extends FileDecorator {
    public TamanioDecorator(FileDisplay component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return component.prettyPrint() + " | Tamaño: " + component.getTamanio();
    }
}
