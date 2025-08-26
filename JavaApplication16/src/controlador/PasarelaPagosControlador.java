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

        if (opcion != null) {
            procesarPago(opcion);
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ningún método de pago.");
        }
    }

    private void procesarPago(TipoDePago tipo) {
        switch (tipo) {
            case EFECTIVO:
                pagoEfectivo();
                break;
            case TARJETA_DEBITO:
            case TARJETA_CREDITO:
                pagoTarjeta(tipo);
                break;
            case PAYPAL:
                pagoPayPal();
                break;
            case TRANSFERENCIAS:
                pagoTransferencia();
                break;
            case BITCOIN:
                pagoBitcoin();
                break;
            case CONSIGNACION:
                pagoConsignacion();
                break;
            case APPLE_PAY:
                pagoApplePay();
                break;
            case GOOGLE_PAY:
                pagoGooglePay();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Método no implementado.");
        }
    }

    private void pagoEfectivo() {
        double entregado = Double.parseDouble(JOptionPane.showInputDialog("Monto a pagar: $" + monto + " COP\nIngrese el dinero entregado:"));

        if (entregado < monto) {
            JOptionPane.showMessageDialog(null, "El dinero entregado es insuficiente.\nFaltan: $" + (monto - entregado) + " COP");
        } else {
            double cambio = entregado - monto;
            String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico para enviar la factura:");
            JOptionPane.showMessageDialog(null,
                    "Pago en EFECTIVO realizado\n" +
                    "Monto: $" + monto + " COP\n" +
                    "Entregado: $" + entregado + " COP\n" +
                    "Cambio: $" + cambio + " COP\n" +
                    "Factura enviada a: " + correo);
        }
    }

    private void pagoTarjeta(TipoDePago tipo) {
        String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de la tarjeta:");
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        String cvv = JOptionPane.showInputDialog("Ingrese el CVV:");

        JOptionPane.showMessageDialog(null,
                "Pago con " + tipo + " realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Tarjeta terminada en ****" + numeroTarjeta.substring(numeroTarjeta.length() - 4) + "\n" +
                "Titular: " + titular);
    }

    private void pagoPayPal() {
        String correo = JOptionPane.showInputDialog("Ingrese su correo de PayPal:");
        String clave = JOptionPane.showInputDialog("Ingrese su contraseña de PayPal:");

        JOptionPane.showMessageDialog(null,
                "Pago con PayPal realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Correo asociado: " + correo);
    }

    private void pagoTransferencia() {
        String banco = JOptionPane.showInputDialog("Ingrese el banco desde el que transfiere:");
        String referencia = JOptionPane.showInputDialog("Ingrese el número de referencia de la transacción:");

        JOptionPane.showMessageDialog(null,
                "Pago con TRANSFERENCIA realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Banco: " + banco + "\n" +
                "Referencia: " + referencia);
    }

    private void pagoBitcoin() {
        String wallet = JOptionPane.showInputDialog("Ingrese la dirección de su billetera Bitcoin:");
        JOptionPane.showMessageDialog(null,
                "Pago con BITCOIN realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Wallet: " + wallet);
    }

    private void pagoConsignacion() {
        String banco = JOptionPane.showInputDialog("Ingrese el banco donde consigna:");
        String referencia = JOptionPane.showInputDialog("Ingrese el número de consignación:");

        JOptionPane.showMessageDialog(null,
                "Pago con CONSIGNACIÓN realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Banco: " + banco + "\n" +
                "Referencia: " + referencia);
    }

    private void pagoApplePay() {
        String appleId = JOptionPane.showInputDialog("Ingrese su Apple ID:");
        JOptionPane.showMessageDialog(null,
                "Pago con APPLE PAY realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Apple ID: " + appleId);
    }

    private void pagoGooglePay() {
        String correo = JOptionPane.showInputDialog("Ingrese su correo de Google Pay:");
        JOptionPane.showMessageDialog(null,
                "Pago con GOOGLE PAY realizado\n" +
                "Monto: $" + monto + " COP\n" +
                "Correo: " + correo);
    }
}
