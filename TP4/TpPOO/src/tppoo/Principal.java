package tppoo;

public class Principal {

    public static void main(String[] args) {
        Empleado e = new Empleado("Empleado 1", "Vendedor");
        Empleado e1 = new Empleado("Empleado 2", "Obrero");
        Empleado e2 = new Empleado(0001, "Empleado 3", "Cajero", 150000);
        Empleado e3 = new Empleado(0002, "Empleado 4", "Repartidor", 150000);
        
        System.out.println("Actualizando salario empleado 1");
        e.actualizarSalario(0.15);
        
        System.out.println("Actualizando salario empleado 2");        
        e1.actualizarSalario();
        
        System.out.println("Actualizando salario empleado 3");
        e2.actualizarSalario(0.15);
        
        System.out.println("Actualizando salario empleado 4");        
        e3.actualizarSalario();
        
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        System.out.println("El total de empleados son: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
