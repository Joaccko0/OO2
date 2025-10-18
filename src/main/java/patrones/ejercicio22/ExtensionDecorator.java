package patrones.ejercicio22;

public class ExtensionDecorator extends FileDecorator {
    public ExtensionDecorator(FileDisplay component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return component.prettyPrint() + " | Extension: " + component.getExtension();
    }
}
