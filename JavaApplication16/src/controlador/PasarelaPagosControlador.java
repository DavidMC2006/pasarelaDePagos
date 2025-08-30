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
public class PasarelaPagosControlador {
    private double monto;

    public PasarelaPagosControlador(double monto) {
        this.monto = monto;
    }

    public void iniciarPago() {
        TipoDePago[] opciones = TipoDePago.values();
        TipoDePago opcion = (TipoDePago) JOptionPane.showInputDialog(
                null,
                "Seleccione el método de pago",
                "Pasarela de Pagos",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    }
    
    
}