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

public class PagoBitcoin {
    private int idPago;            
    private String walletAddress;
    private String hashTransaccion;

    public PagoBitcoin(int idPago, String walletAddress) {
        this.idPago = idPago;
        this.walletAddress = walletAddress;
    }

    public int getIdPago() {
        return idPago; 
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago; 
    }

    public String getWalletAddress() {
        return walletAddress; 
    }
    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress; 
    }

   
}

