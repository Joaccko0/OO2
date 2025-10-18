package patrones.ejercicio20;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class ProyectoTest {

    @Test
    public void aprobarProyectoEnEvaluacionDebePasarAConfirmada() {
        // (i) Datos iniciales del proyecto
        Proyecto proyecto = new Proyecto(
                "Vacaciones de invierno",                    // nombre
                LocalDate.of(2025, 7, 15),                   // inicio
                LocalDate.of(2025, 7, 20),                   // fin
                "salir con amigos",                          // objetivo
                3,                                           // integrantes
                100                                          // monto por integrante/día
        );

        // Pasamos el proyecto manualmente a estado "Evaluacion"
        proyecto.setState(new Evaluacion());

        // Acción: aprobar la etapa
        proyecto.aprobarEtapa();

        // Verificación: ahora debe estar en estado "Confirmada"
        assertTrue(proyecto.getState() instanceof Confirmada,
                "El proyecto debería pasar a estado Confirmada");

        // También verificamos que los datos originales se mantengan
        assertEquals("Vacaciones de invierno", proyecto.getNombre());
        assertEquals("salir con amigos", proyecto.getObjetivo());
        assertEquals(3, proyecto.getIntegrantes());
    }
}

