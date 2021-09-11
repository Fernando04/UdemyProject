package sistemanomina;

public class EmpleadoAsalariado extends Empleado {

    private double salario;

    EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    @Override
    public double ingresos() {
        return 0;
    }

    public void establecerSalarioSemanal(double sal) {
        salario = sal;
    }

    public double obtenerSalarioSemanal() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "Salario Semanal", obtenerSalarioSemanal());
    }

}
