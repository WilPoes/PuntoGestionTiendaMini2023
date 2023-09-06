package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entidades.DetalleVenta;
import entidades.Venta;

public class VentaDAO {
    Connection con;  
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;        
    public int RegistrarVenta(Venta v){
        String sql = "insert into venta (preciototal,remitente,cliente) values (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setDouble(1, v.getPreciototal());
            ps.setString(2, v.getRemitente());
            ps.setString(3, v.getCliente());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public int RegistrarDetalle(DetalleVenta dv){
        String sql = "insert into detalleventa (codproducto, cantidad, precio, id_venta) values (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dv.getCodproducto());
            ps.setInt(2, dv.getCantidad());
            ps.setDouble(3, dv.getPrecio());
            ps.setInt(4, dv.getId());
            ps.execute();
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public List ListarDetalleVenta(){
        List<DetalleVenta> listarDetalleVenta = new ArrayList();
        String sql = "select * from detalleventa";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                DetalleVenta pr = new DetalleVenta();
                pr.setId(rs.getInt("id"));
                pr.setCodproducto(rs.getString("codproducto"));
                pr.setCantidad(rs.getInt("cantidad"));
                pr.setPrecio(rs.getDouble("precio"));
                pr.setId_venta(rs.getInt("id_venta"));
                
                listarDetalleVenta.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listarDetalleVenta;
    }
    
    public List ListarVentas(){
        List<Venta> listVentas = new ArrayList();
        String sql = "select * from venta";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Venta pr = new Venta();
                
                pr.setId(rs.getInt("id"));
                pr.setPreciototal(rs.getDouble("preciototal"));
                pr.setRemitente(rs.getString("remitente"));
                pr.setCliente(rs.getString("cliente"));                
                
                listVentas.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listVentas;
    }
}
