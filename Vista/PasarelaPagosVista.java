/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasarelapagos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PasarelaPagosVista extends JFrame {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasarelaPagosVista::new);
    }
    
    private JPanel panelFormulario;
    private JComboBox<String> comboMetodoPago;
    private JButton btnPagar;
    

    public PasarelaPagosVista() {
        setTitle("Pasarela de Pagos");
        setSize(450, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // ComboBox para método de pago
        JPanel panelTop = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboMetodoPago = new JComboBox<>(new String[]{
            "Elija un metodo de pago", "Apple Pay", "Transferencia", "Tarjeta Débito", "Tarjeta Crédito",
            "Paypal", "Efectivo", "Consignación", "Bitcoin"
        });
        comboMetodoPago.addActionListener(e -> mostrarFormulario());

        panelTop.add(new JLabel("Método de Pago:"));
        panelTop.add(comboMetodoPago);

        // Panel para campos dinámicos
        panelFormulario = new JPanel(new GridBagLayout());
        JScrollPane scroll = new JScrollPane(panelFormulario);
        
        // Botón de pagar
        btnPagar = new JButton("Pagar");
        btnPagar.setEnabled(false); // Solo habilitado si se selecciona un método válido
        

        // Agregar componentes a la ventana principal
        add(panelTop, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(btnPagar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void mostrarFormulario() {
        panelFormulario.removeAll();
        String metodo = (String) comboMetodoPago.getSelectedItem();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 5, 5, 5);
        gbc.gridy = 0;

        switch (metodo) {
            case "Apple Pay":
                agregarCampo("Apple ID", gbc);
                agregarCampo("Token Transacción", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            case "Transferencia":
                agregarCampo("ID Pago", gbc);
                agregarCampo("Banco", gbc);
                agregarCampo("Referencia", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            case "Tarjeta Débito":
                agregarCampo("Número de Tarjeta", gbc);
                agregarCampo("Titular", gbc);
                agregarCampo("Banco", gbc);
                agregarCampo("Fecha Exp", gbc);
                agregarCampo("CVV", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            case "Tarjeta Crédito":
                agregarCampo("Número de Tarjeta", gbc);
                agregarCampo("Titular", gbc);
                agregarCampo("Fecha Exp", gbc);
                agregarCampo("CVV", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            case "Paypal":
                agregarCampo("Email Paypal", gbc);
                agregarCampo("Clave", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            case "Efectivo":
                agregarCampo("Monto Recibido", gbc);
                agregarCampo("Cambio", gbc);
                agregarCampo("Correo", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            case "Consignación":
                agregarCampo("Número de Cuenta", gbc);
                agregarCampo("Banco", gbc);
                agregarCampo("Referencia", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            case "Bitcoin":
                agregarCampo("Wallet Address", gbc);
                agregarCampo("Monto", gbc, "");
                break;

            default:
                btnPagar.setEnabled(false);
                panelFormulario.revalidate();
                panelFormulario.repaint();
                return;
        }

        btnPagar.setEnabled(true);
        panelFormulario.revalidate();
        panelFormulario.repaint();
    }

    private void agregarCampo(String etiqueta, GridBagConstraints gbc) {
        agregarCampo(etiqueta, gbc, "");
    }

    private void agregarCampo(String etiqueta, GridBagConstraints gbc, String valorDefault) {
        JLabel label = new JLabel(etiqueta + ":");
        JTextField field = new JTextField(valorDefault, 20);
        gbc.gridx = 0;
        panelFormulario.add(label, gbc);
        gbc.gridx = 1;
        panelFormulario.add(field, gbc);
        gbc.gridy++;
    }

}
