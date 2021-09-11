package sistemanomina;

public class EmpleadoPorHoras extends Empleado{

    private double sueldo;
    private double horas;

    public EmpleadoPorHoras(String nombre, String apellido, String nss, double salarioPorHoras, double horasTrabajadas){
        super(nombre,apellido,nss);
        setSueldo(salarioPorHoras);
        setHoras(horasTrabajadas);

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo < 0.0){
            sueldo =0.0;
        }else {
            this.sueldo = sueldo;
        }

    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        if (horas >= 0 && horas <=168 ){
            horas = horas;
        }else {
            horas = 0.0;
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\n%s: $%,.2f", super.toString(), "Sueldo por horas", getSueldo(), "Horas trabajadas");
    }
    @Override
    public double ingresos() {
        if (getHoras() <= 40 ){
            return getSueldo() * getHoras();
        }else{
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
        }
    }
}
