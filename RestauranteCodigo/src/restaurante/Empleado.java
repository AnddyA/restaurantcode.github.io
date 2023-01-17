/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Asus
 */
public abstract class Empleado extends Persona implements Registro {
    private String horaDeIngreso;
    private String horaDeSalida;
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public void cobrar(Factura totalAPagar){
        
    }
    public void registrarEntrada(){
        
    }
    public void registrarSalida(){
        
    }
    public void registrarUsuario(Usuario usuario){
        
    }

    public String getHoraDeIngreso() {
        return horaDeIngreso;
    }

    public void setHoraDeIngreso(String horaDeIngreso) {
        this.horaDeIngreso = horaDeIngreso;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    
    
    
    
    
}
