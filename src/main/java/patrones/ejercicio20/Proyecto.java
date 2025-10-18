package patrones.ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String objetivo;
    private int integrantes;
    private double montoPorIntegrante;
    private double margen;
    private EstadoProyecto state;

    public Proyecto(String nombre, LocalDate inicio, LocalDate fin, String objetivo, int cant, double monto) {
        this.nombre = nombre;
        this.fechaInicio = inicio;
        this.fechaFin = fin;
        this.objetivo = objetivo;
        this.integrantes = cant;
        this.montoPorIntegrante = monto;
        this.margen = 0.07;
        this.state = new Construccion();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public double getMontoPorIntegrante() {
        return montoPorIntegrante;
    }

    public double getMargen() {
        return margen;
    }

    public EstadoProyecto getState() {
        return state;
    }

    public void setState(EstadoProyecto estado) {
        this.state = estado;
    }

    public void setMargen(double nuevoMargen) {
        this.margen = nuevoMargen;
    }

    public void aprobarEtapa() {
        this.state.aprobarEtapa(this);
    }

    public double costoProyecto() {
        return (this.integrantes * this.montoPorIntegrante) * (ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin) + 1);
    }

    public double precioProyecto() {
        return this.costoProyecto() + (this.margen * this.costoProyecto());
    }

    public void modificarMargen(double nuevoMargen) {
        this.state.modificarMargen(this, nuevoMargen);
    }

    public void cancelar() {
        this.state.cancelar(this);
    }

    public void cancelarObjetivo() {
        this.objetivo = this.objetivo + "\n CANCELADO";
    }
}
