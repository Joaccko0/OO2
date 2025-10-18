package patrones.ejercicio22;

import java.time.LocalDate;

public interface FileDisplay {
    String prettyPrint();
    String getNombre();
    String getExtension();
    double getTamanio();
    String getPermisos();
    LocalDate getFechaCreacion();
    LocalDate getFechaModificacion();
}

