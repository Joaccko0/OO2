package patrones.ejercicio20;

public class Evaluacion extends EstadoProyecto{
    @Override
    public void aprobarEtapa(Proyecto proyecto) {
        proyecto.setState(new Confirmada());
    }

    @Override
    public void modificarMargen(Proyecto proyecto, double nuevoMargen) {
        if(nuevoMargen >= 0.11 && nuevoMargen <= 0.15) {
            proyecto.setMargen(nuevoMargen);
        }
    }
}
