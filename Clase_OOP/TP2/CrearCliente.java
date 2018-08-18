/**
 * Write a description of class CrearCliente here.
 * 
 * @author (Lukestik, Nicolás) 
 * @version (14/08/18)
 */
public class CrearCliente{
    public static void main(String[] args){
        Cliente nuevoCliente = new Cliente(Integer.valueOf(args[0]), args[1], args[2], Double.valueOf(args[3]));
        nuevoCliente.mostrar();
        
        nuevoCliente.agregaSaldo(3000);
        System.out.println("\n- Primera Actualizacion: agregaSaldo(3000) -");
        nuevoCliente.mostrar();

        nuevoCliente.nuevoSaldo(3000);
        System.out.println("\n- Segunda Actualizacion: nuevoSaldo(3000) -");
        nuevoCliente.mostrar();
    }
}
