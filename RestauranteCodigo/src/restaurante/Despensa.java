/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Asus
 */
public class Despensa {
 private Gerente gerente;
 private String ingredientesList[];

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String[] getIngredientesList() {
        return ingredientesList;
    }

    public void setIngredientesList(String[] ingredientesList) {
        this.ingredientesList = ingredientesList;
    }
 
}
