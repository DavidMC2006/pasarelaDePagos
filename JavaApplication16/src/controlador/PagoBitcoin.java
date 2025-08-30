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

public class PagoBitcoin implements Pagos {
    private int idPago;            
    private String walletAddress;
    private double monto = 200000;
        

    public PagoBitcoin(int idPago, String walletAddress) {
        this.idPago = idPago;
        this.walletAddress = walletAddress;
    }
    
    public PagoBitcoin() {
       
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
public void crearPago() {
        walletAddress = JOptionPane.showInputDialog("Ingrese la dirección de su billetera Bitcoin:");
        JOptionPane.showMessageDialog(null,
                "Pago con BITCOIN realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Wallet: " + walletAddress);
        }
   
}




