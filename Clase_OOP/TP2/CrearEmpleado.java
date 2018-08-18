import java.util.Scanner;
/**
 * Write a description of class CrearEmpleado here.
 * 
 * @author (Lukestik, Nicolás) 
 * @version (16/08/18)
 */

public class CrearEmpleado{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        while (true){
            System.out.print("¿Crear nuevo empleado? \n[1]SI - [2]NO ------> ");
            int x = teclado.nextInt();
            if(x==2) break;
            
            System.out.println("Ingrese datos del nuevo empleado");
            System.out.print("CUIL: ");
            long cuil = teclado.nextLong();
            System.out.print("NOMBRE: ");
            String nombre = teclado.next();
            System.out.print("APELLIDO: ");
            String apellido = teclado.next();
            System.out.print("SUELDO BASICO: ");
            double sueldoBasico = teclado.nextDouble();
            System.out.print("AÑO DE INGRESO: ");
            int anioIngreso = teclado.nextInt();
            
            Empleado nuevoEmpleado = new Empleado(cuil, nombre, apellido, sueldoBasico, anioIngreso);
            System.out.println();
            nuevoEmpleado.mostrar();
            System.out.println(nuevoEmpleado.mostrarLinea());
        }
    }
}
