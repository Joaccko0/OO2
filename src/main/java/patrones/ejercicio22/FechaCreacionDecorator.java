package patrones.ejercicio22;

public class FechaCreacionDecorator extends FileDecorator {
    public FechaCreacionDecorator(FileDisplay component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return component.prettyPrint() + " | Fecha de Creacion: " + component.getFechaCreacion();
    }
}

