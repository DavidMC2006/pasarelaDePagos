/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author David Mansilla
 */

public class PagoPaypal {
    private int idPago;          
    private String emailPaypal;
    private String idTransaccion;

    public PagoPaypal(int idPago, String emailPaypal, String idTransaccion) {
        this.idPago = idPago;
        this.emailPaypal = emailPaypal;
        this.idTransaccion = idTransaccion;
    }

    public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public String getEmailPaypal() {
        return emailPaypal; 
    }
    public void setEmailPaypal(String emailPaypal) {
        this.emailPaypal = emailPaypal; 
    }

    public String getIdTransaccion() {
        return idTransaccion; 
    }
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion; 
    }
}
