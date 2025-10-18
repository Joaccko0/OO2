package patrones.ejercicio20;

public class Cancelado extends EstadoProyecto{
    @Override
    public void aprobarEtapa(Proyecto proyecto) {}

    @Override
    public void modificarMargen(Proyecto proyecto, double nuevoMargen) {}

    @Override
    public void cancelar(Proyecto proyecto) {}
}
