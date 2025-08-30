/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoPasarelaDePagos implements Crud<Pago> {

    @Override
    public List<Pago> listar() {
        List<Pago> pagos = new ArrayList<>();
        String sql = "select * from pagos";

        try (
                Connection con = ConexionPasarela.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Pago p = new Pago();
                p.setId_pago(rs.getInt(1));
                p.setId_usuario(rs.getInt(2));
                p.setId_producto(rs.getInt(3));
                p.setMonto(rs.getDouble(4));
                p.setFecha_pago(rs.getTimestamp(5).toLocalDateTime());
                p.setMetodo_pago(rs.getString(6));
                p.setEstado(rs.getString(7));
                pagos.add(p);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
        return pagos;

    }

    @Override
    public int setAgregar(Pago p) {
        String sql = "insert into pagos values(?,?,?,?,?,?,?)";
        try (
                Connection con = ConexionPasarela.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, p.getId_pago());
            ps.setInt(2, p.getId_usuario());
            ps.setInt(3, p.getId_producto());
            ps.setDouble(4, p.getMonto());
            ps.setTimestamp(5, java.sql.Timestamp.valueOf(p.getFecha_pago()));
            ps.setString(6, p.getMetodo_pago());
            ps.setString(7, p.getEstado());
            return ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error de insersion", JOptionPane.ERROR_MESSAGE);
            return 0;
        }

    }

    @Override
    public int setActualizar(Pago p) {
        String sql = "update pagos set monto=?, fecha_pago=?, metodo_pago=?, estado=?, id_usuario=?, id_producto=? where id_pago=?  ";

        try (
                Connection con = ConexionPasarela.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, p.getMonto());
            ps.setTimestamp(2, java.sql.Timestamp.valueOf(p.getFecha_pago()));
            ps.setString(3, p.getMetodo_pago());
            ps.setString(4, p.getEstado());
            ps.setInt(5, p.getId_usuario());
            ps.setInt(6, p.getId_producto());
            ps.setInt(7, p.getId_pago());
            return ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error de Actualizacion", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    @Override
    public int setEliminar(int id_pago) {
        String sql = "delete from pagos where id_pago=?";

        try (
                Connection con = ConexionPasarela.getInstance().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id_pago);
            return ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error de eliminacion", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
}
