/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author David Mansilla
 */
public class PagoTransferencia {
    private int idTransferencia;
    private int idPago;         
    private int idProducto;    
    private int cantidad;

    public PagoTransferencia(int idTransferencia, int idPago, int idProducto, int cantidad) {
        this.idTransferencia = idTransferencia;
        this.idPago = idPago;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getIdTransferencia() {
        return idTransferencia; 
    }
    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia; 
    }

    public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public int getIdProducto() {
        return idProducto; 
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto; 
    }

    public int getCantidad() {
        return cantidad; 
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad; 
    }
}

