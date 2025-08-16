/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasareladepagos;

/**
 *
 * @author zambr
 */
public class UsaFactoryPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PagoFactory pagoFactory = new PagoFactory();
      Pagos pagos = pagoFactory.obtenerPago(TipoDePago.EFECTIVO);
      pagos.crearPago();
    }
    
}

