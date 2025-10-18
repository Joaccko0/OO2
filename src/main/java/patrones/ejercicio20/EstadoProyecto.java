package patrones.ejercicio20;

public abstract class EstadoProyecto {

    public abstract void aprobarEtapa(Proyecto proyecto);
    public abstract void modificarMargen(Proyecto proyecto, double nuevoMargen);
    public void cancelar(Proyecto proyecto) {
        proyecto.cancelarObjetivo();
        proyecto.setState(new Cancelado());
    }

}
