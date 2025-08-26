/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author David Mansilla
 */

public class PagoTarjetaCredito {
    private int idPago;           
    private String numeroTarjeta;
    private String titular;
    private String fechaExp;
    private String cvv;

    // Constructor
    public PagoTarjetaCredito(int idPago, String numeroTarjeta, String titular, String fechaExp, String cvv) {
        this.idPago = idPago;
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaExp = fechaExp;
        this.cvv = cvv;
    }

    public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta; 
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta; 
    }

    public String getTitular() {
        return titular; 
    }
    public void setTitular(String titular) {
        this.titular = titular; 
    }

    public String getFechaExp() {
        return fechaExp; 
    }
    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp; 
    }

    public String getCvv() {
        return cvv; 
    }
    public void setCvv(String cvv) {
        this.cvv = cvv; 
    }
}
