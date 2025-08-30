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

public class PagoPaypal implements Pagos{
    private int idPago;          
    private String emailPaypal;
    private String clave;
    private double monto=200000;
    
    public PagoPaypal(int idPago, String emailPaypal, String idTransaccion) {
        this.idPago = idPago;
        this.emailPaypal = emailPaypal;
        this.clave = idTransaccion;
    }
    public PagoPaypal() {
       
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

    public String getClave() {
        return clave; 
    }
    public void setClave(String idTransaccion) {
        this.clave = idTransaccion; 
    } 
    public void crearPago() {
         emailPaypal = JOptionPane.showInputDialog("Ingrese su correo de PayPal:");
         clave = JOptionPane.showInputDialog("Ingrese su contraseña de PayPal:");

        JOptionPane.showMessageDialog(null,
                "Pago con PayPal realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Correo asociado: " + emailPaypal);

        }
    
}
