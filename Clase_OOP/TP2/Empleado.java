import java.util.*;
/**
 * Write a description of class Empleado here.
 * 
 * @author (Lukestik, Nicolás) 
 * @version (16/08/18)
 */

public class Empleado{
    private long cuil;
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private int anioIngreso;
    
    public Empleado(long p_cuil, String p_nombre, String p_apellido, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    public long getCuil(){
        return this.cuil;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return (anioHoy - this.getAnioIngreso());
    }
    
    private double descuento(){
        return (this.getSueldoBasico() * 0.02 + 12);
    }
    
    private double adicional(){
        if(antiguedad() < 2) return (this.getSueldoBasico() * 0.02);
        else if(antiguedad() >= 2 && antiguedad() < 10)
                return (this.getSueldoBasico() * 0.04);
             else return (this.getSueldoBasico() * 0.06);
    }
    
    public double sueldoNeto(){
        return ((this.getSueldoBasico() + adicional()) - descuento());
    }
    
    public String nomYApe(){
        return (this.getNombre() + " " + this.getApellido());
    }
    
    public String apeYNom(){
        return (this.getApellido() + ", " + this.getNombre());
    }
    
    public void mostrar(){
        System.out.printf("Nombre y Apellido: %s\n", nomYApe());
        System.out.print("CUIL: " + this.getCuil() + " - Antiguedad: " + antiguedad() + " años de servicio\n");
        System.out.printf("Sueldo Neto: $%.2f\n\n", sueldoNeto());
    }
    
    public String mostrarLinea(){
        return (this.getCuil() + "\t" + apeYNom() + ".............. $" + sueldoNeto() + "\n\n");
    }
}
