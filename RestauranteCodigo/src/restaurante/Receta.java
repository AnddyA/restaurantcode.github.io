/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Asus
 */
public class Receta {
    private Ingrediente ingredienteList[];
    private Chef chefLsit[];
    private Alimento alimentoList[];
    private String descripcionProceso;
    private String nombreRecetaList[];

    public Alimento[] getAlimentoList() {
        return alimentoList;
    }

    public void setAlimentoList(Alimento[] alimentoList) {
        this.alimentoList = alimentoList;
    }

    
    public Ingrediente[] getIngredienteList() {
        return ingredienteList;
    }

    public void setIngredienteList(Ingrediente[] ingredienteList) {
        this.ingredienteList = ingredienteList;
    }

    public Chef[] getChefLsit() {
        return chefLsit;
    }

    public void setChefLsit(Chef[] chefLsit) {
        this.chefLsit = chefLsit;
    }

    public String getDescripcionProceso() {
        return descripcionProceso;
    }

    public void setDescripcionProceso(String descripcionProceso) {
        this.descripcionProceso = descripcionProceso;
    }

    public String[] getNombreRecetaList() {
        return nombreRecetaList;
    }

    public void setNombreRecetaList(String[] nombreRecetaList) {
        this.nombreRecetaList = nombreRecetaList;
    }
    
    
    
}
