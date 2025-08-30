/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author zambr
 */
public class Pago {
    private int id_pago;
    private int id_usuario;
    private int id_producto;
    private double monto;
    private LocalDateTime fecha_pago;
    private String metodo_pago;
    private String estado;
    
    public Pago(){}
    

    public Pago(int id_pago, int id_usuario, int id_producto, double monto, LocalDateTime fecha, String metodo_Pago, String estado_pago  ) {
        this.id_pago = id_pago;
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
        this.monto = monto;
        this.fecha_pago = fecha_pago;
        this.metodo_pago = metodo_pago;
        this.estado = estado;
        
    }

    public int getId_pago() {
        return id_pago;
    }
    public void setId_pago(int id_pago){
        this.id_pago=id_pago;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario ){
        this.id_usuario=id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }
    public void setId_producto(int id_producto){
        this.id_producto=id_producto;
    }

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto){
        this.monto=monto;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }
    public void setFecha_pago(LocalDateTime fecha){
        this.fecha_pago=fecha_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }
    public void setMetodo_pago(String metodo_pago){
        this.metodo_pago=metodo_pago;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
public String toStriing(){
    return "Pago{" + "id del pago=" + id_pago +
                ", id del usuario='" + id_usuario + '\'' +
                ", id del producto=" + id_producto +
                ", monto=" + monto +
                ", fecha=" + fecha_pago +
                ", metodo='" + metodo_pago + '\'' +
                ", estado='" + estado + '\'' +
                '}';
} 
    
}
