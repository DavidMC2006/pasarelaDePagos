/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author David Mansilla
 */

public class PagoApplePay implements Pagos  {
    private int idPago;             
    private String appleId;
    private String tokenTransaccion;
    private double monto =200000;
    
    
    public PagoApplePay(int idPago, String appleId, String tokenTransaccion) {
        this.idPago = idPago;
        this.appleId = appleId;
        this.tokenTransaccion = tokenTransaccion;
        
    }
    
    public PagoApplePay() {
       
    }


    public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public String getAppleId() {
        return appleId; 
    }
    public void setAppleId(String appleId) {
        this.appleId = appleId; 
    }

    public String getTokenTransaccion() {
        return tokenTransaccion; 
    }
    public void setTokenTransaccion(String tokenTransaccion) {
        this.tokenTransaccion = tokenTransaccion; 
    }
    
        public void crearPago() {
        appleId = JOptionPane.showInputDialog("Ingrese su Apple ID:");
        tokenTransaccion = JOptionPane.showInputDialog("Ingrese su Token :");
        JOptionPane.showMessageDialog(null,
                "Pago con APPLE PAY realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Apple ID: " + appleId);
        }


}
