package patrones.ejercicio22;

import java.time.LocalDate;

public class FileOO2 implements FileDisplay {
    private String nombre;
    private String extension;
    private double tamanio;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String permisos;

    public FileOO2(String nombre, String extension, double tamanio,
                   LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
    }

    @Override
    public String prettyPrint() {
        return ""; // por defecto no muestra nada
    }

    public String getNombre() { return nombre; }
    public String getExtension() { return extension; }
    public double getTamanio() { return tamanio; }
    public LocalDate getFechaCreacion() { return fechaCreacion; }
    public LocalDate getFechaModificacion() { return fechaModificacion; }
    public String getPermisos() { return permisos; }
}

