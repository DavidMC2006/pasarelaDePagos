/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author zambr
 */
public interface Crud<Pago>{
    
    public List<Pago> listar();
    public int setAgregar(Pago p);
    public int setActualizar(Pago p);
    public int setEliminar(int id);
    
    
    
}
