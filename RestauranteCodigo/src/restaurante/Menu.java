/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Asus
 */
public class Menu  {
    private String alimentos[];
    private float precio;
    private Alimento alimentoList[];
    private Gerente gerenteList[];

    public Gerente[] getGerenteList() {
        return gerenteList;
    }

    public void setGerenteList(Gerente[] gerenteList) {
        this.gerenteList = gerenteList;
    }
    

    public Alimento[] getAlimentoList() {
        return alimentoList;
    }

    public void setAlimentoList(Alimento[] alimentoList) {
        this.alimentoList = alimentoList;
    }
    
    
    public void añadirAlimento(){
        
    }
    public void eliminarAlimento(){
        
    }
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String[] getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String[] alimentos) {
        this.alimentos = alimentos;
    }
}
