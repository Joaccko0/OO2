package patrones.ejercicio22;

public class PermisosDecorator extends FileDecorator {
    public PermisosDecorator(FileDisplay component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return component.prettyPrint() + " | Permisos: " + component.getPermisos();
    }
}
