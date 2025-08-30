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
public class PagoTransferencia implements Pagos{
    private int idTransferencia;
    private int idPago;         
    private String banco;    
    private String referencia;
    private double monto = 200000;
    


    public PagoTransferencia(int idTransferencia, int idPago, String banco, String referencia) {
        this.idTransferencia = idTransferencia;
        this.idPago = idPago;
        this.banco = banco;
        this.referencia = referencia;
        
    }
    public PagoTransferencia() {
       
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

    public String getBanco() {
        return banco; 
    }
    public void setIdProducto(String banco) {
        this.banco = banco; 
    }

    public String getCantidad() {
        return referencia; 
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia; 
    }
        public void crearPago() {
        banco = JOptionPane.showInputDialog("Ingrese el banco desde el que transfiere:");
        referencia = JOptionPane.showInputDialog("Ingrese el número de referencia de la transacción:");

        JOptionPane.showMessageDialog(null,
                "Pago con TRANSFERENCIA realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Banco: " + banco + "\n" +
                "Referencia: " + referencia);
        }
}

