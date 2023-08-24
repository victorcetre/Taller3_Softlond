package EmpleadosSalarios;

public class PorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public PorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
