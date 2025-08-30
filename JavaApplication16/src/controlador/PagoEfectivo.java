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


public class PagoEfectivo implements Pagos{
    private int idPago;         
    private double montoRecibido;
    private double cambio;
    private String correo;
    private double monto=200000;

   
    
    public PagoEfectivo(int idPago, double montoRecibido, double cambio) {
        this.idPago = idPago;
        this.montoRecibido = montoRecibido;
        this.cambio = cambio;
    }
    
    public PagoEfectivo() {
       
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
    @Override
    public void crearPago() {
         montoRecibido = Double.parseDouble(JOptionPane.showInputDialog("Monto a pagar: $" + monto + " COP\nIngrese el dinero entregado:"));

        if (montoRecibido < monto) {
            JOptionPane.showMessageDialog(null, "El dinero entregado es insuficiente.\nFaltan: $" + (monto - montoRecibido) + " COP");
        } else {
             cambio = montoRecibido - monto;
             correo = JOptionPane.showInputDialog("Ingrese su correo electrónico para enviar la factura:");
            JOptionPane.showMessageDialog(null,
                    "Pago en EFECTIVO realizado\n" +
                    "Monto: $" + monto + " COP\n" +
                    "Entregado: $" + montoRecibido + " COP\n" +
                    "Cambio: $" + cambio + " COP\n" +
                    "Factura enviada a: " + correo);
        }
        }
}
