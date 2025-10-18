package patrones.ejercicio22;

public class FechaModificacionDecorator extends FileDecorator {
    public FechaModificacionDecorator(FileDisplay component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return component.prettyPrint() + " | Fecha de ultima modificacion: " + component.getFechaModificacion();
    }
}

