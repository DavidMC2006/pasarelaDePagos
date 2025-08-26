/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author David Mansilla
 */

public class PagoConsignacion {
    private int idPago;               
    private String numeroCuenta;
    private String entidadFinanciera;
    private String comprobanteConsignacion;

    public PagoConsignacion(int idPago, String numeroCuenta, String entidadFinanciera, String comprobanteConsignacion) {
        this.idPago = idPago;
        this.numeroCuenta = numeroCuenta;
        this.entidadFinanciera = entidadFinanciera;
        this.comprobanteConsignacion = comprobanteConsignacion;
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
        return entidadFinanciera; 
    }
    public void setEntidadFinanciera(String entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera; 
    }

    public String getComprobanteConsignacion() {
        return comprobanteConsignacion; 
    }
    public void setComprobanteConsignacion(String comprobanteConsignacion) {
        this.comprobanteConsignacion = comprobanteConsignacion; 
    }
}

