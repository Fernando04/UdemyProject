package sistemanomina;

public class EmpleadoPorComision extends Empleado {

    private double ventaBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa) {
        super(nombre, apellido, nss);
        setVentaBrutas(ventas);
        setTarifaComision(tarifa);

    }

    public double getVentaBrutas() {
        return ventaBrutas;
    }

    public void setVentaBrutas(double ventaBrutas) {
        if (ventaBrutas < 0.0 ){
         ventaBrutas = 0.0 ;
        }else {
            this.ventaBrutas = ventaBrutas;
        }
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision > 0.0 && tarifaComision < 1.0) {
            this.tarifaComision = tarifaComision;
        } else {
            tarifaComision = 0.0;
        }
    }

    @Override
    public double ingresos() {
        return getTarifaComision() * getVentaBrutas();
    }
    @Override
    public String toString() {
        return String.format("Empleado por comisión: %s\n%s: $%,.2f", super.toString(), "Salario Semanal", getVentaBrutas(),
                "Tarifa de comisión", getTarifaComision());
    }

}
