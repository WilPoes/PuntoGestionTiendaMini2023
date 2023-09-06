package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

import entidades.Producto;

public class ProductoDAO {
    Connection con;  
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion cn = new Conexion();
    
    public boolean RegistrarProductos(Producto prod){
        String sql = "insert into producto (codigo,nombre,proveedor,stock,precio, id_compra) values (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getProveedor());
            ps.setInt(4, prod.getStock());
            ps.setDouble(5, prod.getPrecio());
            ps.setDouble(6, prod.getId_compra());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }    
    public void ConsultarProveedor(JComboBox prov){
        String sql = "select nombre from proveedor";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                prov.addItem(rs.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public List ListarProductos(){
        List<Producto> listProd = new ArrayList();
        String sql = "select * from producto";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                Producto pr = new Producto();
                pr.setId(rs.getInt("id"));
                pr.setCodigo(rs.getString("codigo"));
                pr.setNombre(rs.getString("nombre"));
                pr.setProveedor(rs.getString("proveedor"));
                pr.setStock(rs.getInt("stock"));
                pr.setPrecio(rs.getDouble("precio"));
                pr.setId_compra(rs.getInt("id_compra"));
                listProd.add(pr);                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listProd;
    }
    public boolean EliminarProducto(int id){
        String sql = "delete from producto where id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public boolean ModificarProducto(Producto prod){
        String sql="update producto set codigo=?, nombre=?, proveedor=?, stock=?, precio=? where id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getProveedor());
            ps.setInt(4, prod.getStock());
            ps.setDouble(5, prod.getPrecio());
            ps.setInt(6, prod.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public Producto BuscarProd(String cod){
        Producto prd = new Producto();
        String sql = "select * from producto where codigo=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                prd.setNombre(rs.getString("nombre"));
                prd.setPrecio(rs.getDouble("precio"));
                prd.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return prd;
    }
}
