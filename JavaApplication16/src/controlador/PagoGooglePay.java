/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author David Mansilla
 */

public class PagoGooglePay {
    private int idPago;             
    private String googleAccount;
    private String tokenPago;

    public PagoGooglePay(int idPago, String googleAccount, String tokenPago) {
        this.idPago = idPago;
        this.googleAccount = googleAccount;
        this.tokenPago = tokenPago;
    }

   public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public String getGoogleAccount() {
        return googleAccount; 
    }
    public void setGoogleAccount(String googleAccount) {
        this.googleAccount = googleAccount; 
    }

    public String getTokenPago() {
        return tokenPago; 
    }
    public void setTokenPago(String tokenPago) {
        this.tokenPago = tokenPago; 
    }
}

