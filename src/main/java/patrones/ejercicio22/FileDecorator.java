package patrones.ejercicio22;

import java.time.LocalDate;

public abstract class FileDecorator implements FileDisplay {
    protected FileDisplay component;

    public FileDecorator(FileDisplay component) {
        this.component = component;
    }

    @Override
    public abstract String prettyPrint();

    @Override public String getNombre() { return component.getNombre(); }
    @Override public String getExtension() { return component.getExtension(); }
    @Override public double getTamanio() { return component.getTamanio(); }
    @Override public String getPermisos() { return component.getPermisos(); }
    @Override public LocalDate getFechaCreacion() { return component.getFechaCreacion(); }
    @Override public LocalDate getFechaModificacion() { return component.getFechaModificacion(); }
}
