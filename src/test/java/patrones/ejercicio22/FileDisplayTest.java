package patrones.ejercicio22;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class FileDisplayTest {

    @Test
    public void testDecoradoresCombinados() {
        // 1️⃣ Creamos un FileOO2 base
        FileOO2 file = new FileOO2(
                "documento",
                "txt",
                1024,
                LocalDate.of(2025, 10, 18),
                LocalDate.of(2025, 10, 18),
                "rw-r--r--"
        );

        // 2️⃣ Aplicamos varios decoradores
        FileDisplay decoratedFile = new NombreDecorator(
                new ExtensionDecorator(
                        new TamanioDecorator(
                                new FechaModificacionDecorator(
                                        new PermisosDecorator(file)
                                )
                        )
                )
        );

        // 3️⃣ Obtenemos el resultado
        String result = decoratedFile.prettyPrint();

        // 4️⃣ Verificamos que contiene cada información
        assertTrue(result.contains("Nombre: documento"));
        assertTrue(result.contains("Extension: txt"));
        assertTrue(result.contains("Tamaño: 1024.0"));
        assertTrue(result.contains("Fecha de ultima modificacion: 2025-10-18"));
        assertTrue(result.contains("Permisos: rw-r--r--"));
    }

    @Test
    public void testDecoradorIndividual() {
        FileOO2 file = new FileOO2(
                "foto",
                "jpg",
                2048,
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 5, 1),
                "rwxr-xr-x"
        );

        FileDisplay nombreDecorado = new NombreDecorator(file);
        assertTrue(nombreDecorado.prettyPrint().contains("Nombre: foto"));

        FileDisplay extensionDecorado = new ExtensionDecorator(file);
        assertTrue(extensionDecorado.prettyPrint().contains("Extension: jpg"));
    }
}
