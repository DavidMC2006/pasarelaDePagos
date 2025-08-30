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
public class PagoTarjetaCredito implements Pagos {

    private int idPago;
    private String numeroTarjeta;
    private String titular;
    private String fechaExp;
    private String cvv;
    private double monto = 200000;

    public PagoTarjetaCredito(int idPago, String numeroTarjeta, String titular, String fechaExp, String cvv) {
        this.idPago = idPago;
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaExp = fechaExp;
        this.cvv = cvv;
    }

    public PagoTarjetaCredito() {

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

    public void crearPago() {
        numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de la tarjeta:");
        titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        cvv = JOptionPane.showInputDialog("Ingrese el CVV:");

        JOptionPane.showMessageDialog(null,
                "Monto: $" + monto + " COP\n"
                + "Tarjeta terminada en ****" + numeroTarjeta.substring(numeroTarjeta.length() - 4) + "\n"
                + "Titular: " + titular + "\n"
                + "FechaExp: " + fechaExp);

    }
}
