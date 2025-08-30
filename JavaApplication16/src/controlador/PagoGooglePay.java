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

public class PagoGooglePay implements Pagos{
    private int idPago;             
    private String tokenPago;
    private String correo;
    private double monto=200000;
    
    
    public PagoGooglePay(int idPago, String correo, String tokenPago) {
        this.idPago = idPago;
        this.tokenPago = tokenPago;
        this.correo = correo;
    }
    public PagoGooglePay() {
       
    }

   public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public String getGoogleAccount() {
        return correo; 
    }
    public void setCorreo(String correo) {
        this.correo = correo; 
    }

    public String getTokenPago() {
        return tokenPago; 
    }
    public void setTokenPago(String tokenPago) {
        this.tokenPago = tokenPago; 
    }
    public void crearPago() {
        correo = JOptionPane.showInputDialog("Ingrese su correo de Google Pay:");
        JOptionPane.showMessageDialog(null,
                "Pago con GOOGLE PAY realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Correo: " + correo);
        }

}

