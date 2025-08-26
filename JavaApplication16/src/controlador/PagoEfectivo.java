/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author David Mansilla
 */


public class PagoEfectivo {
    private int idPago;         
    private double montoRecibido;
    private double cambio;

    
    public PagoEfectivo(int idPago, double montoRecibido, double cambio) {
        this.idPago = idPago;
        this.montoRecibido = montoRecibido;
        this.cambio = cambio;
    }

    public int getIdPago() { 
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public double getMontoRecibido() {
        return montoRecibido;
    }
    public void setMontoRecibido(double montoRecibido) {
        this.montoRecibido = montoRecibido;
    }

    public double getCambio() { 
        return cambio; 
    }
    public void setCambio(double cambio) {
        this.cambio = cambio; 
    }
}
