/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Asus
 */
public class Pedido {

    private boolean estado;
    private String fechaPedido;
    private String horaPedido;
    private float precioTotalPedido;
    private Mesero mesero;
    public Cliente clienteList[];
    private Alimento alimentoList[];

    public Alimento[] getAlimentoList() {
        return alimentoList;
    }

    public void setAlimentoList(Alimento[] alimentoList) {
        this.alimentoList = alimentoList;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public float getPrecioTotalPedido() {
        return precioTotalPedido;
    }

    public void setPrecioTotalPedido(float precioTotalPedido) {
        this.precioTotalPedido = precioTotalPedido;
    }
    
    
    
    
}
