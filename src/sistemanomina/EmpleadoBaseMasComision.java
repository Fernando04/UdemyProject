package sistemanomina;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        setSalarioBase(salario);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            salarioBase = 0.0;
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public double ingresos() {
        return getSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {

        return String.format("Empleado base mas comisión: %s\n%s: $%,.2f", super.toString(), "Salario base",getSalarioBase());
    }

}
