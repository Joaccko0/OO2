package patrones.ejercicio22;

public class NombreDecorator extends FileDecorator {
    public NombreDecorator(FileDisplay component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return component.prettyPrint() + " | Nombre: " + component.getNombre();
    }
}
