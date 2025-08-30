/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author David Mansilla
 */
import java.util.HashMap;
import java.util.Map;
public class PagoFactory  {

   private static final Map<TipoDePago, Pagos> pagos = new HashMap<>() {{
        put(TipoDePago.PAYPAL, new PagoPaypal());
        put(TipoDePago.EFECTIVO, new PagoEfectivo());
        put(TipoDePago.TARJETA_CREDITO, new PagoTarjetaCredito());
        put(TipoDePago.TARJETA_DEBITO, new PagoTarjetaDebito());
        put(TipoDePago.TRANSFERENCIAS, new PagoTransferencia());
        put(TipoDePago.BITCOIN, new PagoBitcoin());
        put(TipoDePago.CONSIGNACION, new PagoConsignacion());
        put(TipoDePago.APPLE_PAY, new PagoApplePay());
        put(TipoDePago.GOOGLE_PAY, new PagoGooglePay());
    }};

    public Pagos obtenerPago(TipoDePago tipoDePago) {
        Pagos pago = pagos.get(tipoDePago);
        if (pago == null) {
            throw new IllegalArgumentException("Tipo de pago no soportado: " + tipoDePago);
        }
        return pago;
    }
}