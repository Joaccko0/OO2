package patrones.ejercicio20;

public class Construccion extends EstadoProyecto{
    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        if(proyecto.precioProyecto() > 0) {
            proyecto.setState(new Evaluacion());
        } else {
            throw new RuntimeException("El precio del proyecto debe ser mayor a 0");
        }
    }

    @Override
    public void modificarMargen(Proyecto proyecto, double nuevoMargen) {
        if(nuevoMargen >= 0.08 && nuevoMargen <= 0.10) {
            proyecto.setMargen(nuevoMargen);
        }
    }
}
