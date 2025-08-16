/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasareladepagos;

import java.util.HashMap;
import java.util.Map;
public class PagoFactory {
    private final static Map<TipoDePago, Pagos> pagos=new HashMap<>(){{
        //crean los pagos para cada uno
        put(TipoDePago.PAYPAL, new PagoPayPal());   
       put(TipoDePago.EFECTIVO, new PagoEfectivo());
        
    }};
    
    public Pagos obtenerPago(TipoDePago tipoDePago) {
        return pagos.get(tipoDePago);
    }
         
    
  
}
