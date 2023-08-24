package EmpleadosSalarios;

public class EmpleadosSalariosApp {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Asalariado("Alice", 2000);
        empleados[1] = new PorHoras("Bob", 40, 15.5);
        empleados[2] = new PorHoras("Carol", 30, 12.0);

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + " - Salario: $ " + empleado.calcularSalario());
        }
    }
}
