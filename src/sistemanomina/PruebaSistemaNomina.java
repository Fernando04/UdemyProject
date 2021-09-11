package sistemanomina;

public class PruebaSistemaNomina {

    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Fernando", "Torres", "21", 1000.0);

        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Oscar", "Valencia", "22", 500.0, 40);

        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Axel", "Rios", "21", 10000, .06);

        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Jorge", "Rosas", "23",
                500.0, 0.4, 300);

        System.out.println("Empleado por separado:\n");

     /*   System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "Ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "Ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "Ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "Ingresos", empleadoBaseMasComision.ingresos());*/

        //Polimorfismo

        Empleado[] empleados = new Empleado[4];

        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados de forma polimorfica: \n");

        // proceso en forma gerarquica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);

            if (empleadoActual instanceof EmpleadoBaseMasComision) {

                // Conversion descendente de la referencia de Empleado
                //a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;

                double salarioBaseAnterior = empleado.getSalarioBase();
                empleado.setSalarioBase(1.10 * salarioBaseAnterior);

                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n", empleado.getSalarioBase());
            }//Fin del if
            System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }

        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("El empleado %d es un %s\n", i, empleados[i].getClass().getName());
        }
    }
}
