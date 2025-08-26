/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author misoj
 */
public class Controlador {


        public static void main(String[] args) {
            PasarelaPagosControlador pasarela = new PasarelaPagosControlador(200000); 
            pasarela.iniciarPago();
        }
    }

