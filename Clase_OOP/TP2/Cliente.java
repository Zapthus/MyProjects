/**
 * Write a description of class Cliente here.
 * 
 * @author (Lukestik, Nicolás) 
 * @version (14/08/18)
 */

public class Cliente{
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;
    double nuevoSaldo;
    
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
        this.setDni(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    private void setDni(int p_dni){
        this.nroDni = p_dni;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    
    public int getDni(){
        return this.nroDni;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double agregaSaldo(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    public double nuevoSaldo(double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();
    }
    
    public void mostrar(){
        System.out.println("- Cliente -");
        System.out.printf("Nombre y Apellido: %s (%d)\n", nomYApe(), getDni());
        System.out.printf("Saldo: $%.2f\n", getSaldo());
    }
    
}
