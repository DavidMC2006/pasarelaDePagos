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

public class PagoConsignacion implements Pagos{
    private int idPago;               
    private String numeroCuenta;
    private String banco;
    private String referencia;
    private double monto = 200000;
    
   

    public PagoConsignacion(int idPago, String numeroCuenta, String entidadFinanciera, String comprobanteConsignacion) {
        this.idPago = idPago;
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
        this.referencia = referencia;
    }
    public PagoConsignacion() {
       
    }

    public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public String getNumeroCuenta() {
        return numeroCuenta; 
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta; 
    }

    public String getEntidadFinanciera() {
        return banco; 
    }
    public void setBanco(String banco) {
        this.banco = banco; 
    }

    public String getreferencia() {
        return referencia; 
    }
    public void setreferencia(String referencia) {
        this.referencia = referencia; 
    }
     public void crearPago() {
        banco = JOptionPane.showInputDialog("Ingrese el banco donde consigna:");
        referencia = JOptionPane.showInputDialog("Ingrese el número de consignación:");

        JOptionPane.showMessageDialog(null,
                "Pago con CONSIGNACIÓN realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Banco: " + banco + "\n" +
                "Referencia: " + referencia);
        }
}

