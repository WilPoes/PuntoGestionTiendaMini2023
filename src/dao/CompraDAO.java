package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.DetalleCompra;

import entidades.Compra;
public class CompraDAO {
    Connection con;  
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;        
    
    public int RegistrarCompra(Compra compra){
            String sql = "insert into compra (PRECIOTOTAL, REMITENTE, PROVEEDOR, MOVIL, COSTOMOVIL) values (?,?,?,?,?)";
        try {            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setDouble(1, compra.getPreciototal());
            ps.setString(2, compra.getRemitente());
            ps.setString(3, compra.getProveedor());
            ps.setString(4, compra.getMovil());
            ps.setDouble(5, compra.getPreciomovil());
            
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
    
    public int RegistrarDetalle(DetalleCompra detallecompra){
        String sql = "insert into detallecompra (CODPRODUCTO, CANTIDAD, PRECIO, ID_COMPRA) values (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, detallecompra.getCodproducto());
            ps.setInt(2, detallecompra.getCantidad());
            ps.setDouble(3, detallecompra.getPrecio());
            ps.setInt(4, detallecompra.getId_compra());
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
    
    public List ListarDetalleCompra(){
        List<DetalleCompra> listDetalleCompras = new ArrayList();
        String sql = "select * from detallecompra";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                DetalleCompra pr = new DetalleCompra();
                pr.setId(rs.getInt("id"));
                pr.setCodproducto(rs.getString("codproducto"));
                pr.setCantidad(rs.getInt("cantidad"));
                pr.setPrecio(rs.getDouble("precio"));
                pr.setId_compra(rs.getInt("id_compra"));
                
                listDetalleCompras.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listDetalleCompras;
    }
    
    public List ListarCompras(){
        List<Compra> listCompras = new ArrayList();
        String sql = "select * from compra";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Compra pr = new Compra();
                
                pr.setId(rs.getInt("id"));
                pr.setPreciototal(rs.getDouble("preciototal"));
                pr.setRemitente(rs.getString("remitente"));
                pr.setProveedor(rs.getString("proveedor"));
                pr.setMovil(rs.getString("movil"));
                pr.setPreciomovil(rs.getDouble("costomovil"));
                
                listCompras.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listCompras;
    }
    
}
