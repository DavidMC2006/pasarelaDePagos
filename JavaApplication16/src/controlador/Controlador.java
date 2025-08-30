/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author misoj
 */
public class Controlador {


        public static void main(String[] args) {
             PagoFactory factory = new PagoFactory();

        // Menú de selección
        String[] opciones = {"PAYPAL", "EFECTIVO", "TARJETA_CREDITO", "TARJETA_DEBITO","TRANSFERENCIAS", "BITCOIN", "CONSIGNACION", "APPLE_PAY", "GOOGLE_PAY"
        };

        String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione el método de pago:","Método de Pago",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);

        if (seleccion != null) {
            try {
                TipoDePago tipo = TipoDePago.valueOf(seleccion);

                Pagos pago = factory.obtenerPago(tipo);

                pago.crearPago();  

                JOptionPane.showMessageDialog(null, 
                    "El pago con " + seleccion + " se procesó correctamente.");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, 
                    "Error: " + e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ningún método de pago.");
        }
    }
}

