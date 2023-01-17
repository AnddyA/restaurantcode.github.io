/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Asus
 */
public class Ingrediente {
    
    private int cantidadStick;
    private String descripcion;
    private Despensa despensaList[];
    private Receta recetaList[];

    public Receta[] getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(Receta[] recetaList) {
        this.recetaList = recetaList;
    }
    
    public Despensa[] getDespensaList() {
        return despensaList;
    }

    public void setDespensaList(Despensa[] despensaList) {
        this.despensaList = despensaList;
    }

    public int getCantidadStick() {
        return cantidadStick;
    }

    public void setCantidadStick(int cantidadStick) {
        this.cantidadStick = cantidadStick;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
