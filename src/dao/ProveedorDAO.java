package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import entidades.Proveedor;

public class ProveedorDAO {
    Connection con;
    Conexion cn = new Conexion();
    
    PreparedStatement ps;
    ResultSet rs;    
    
    public boolean registrarProveedor(Proveedor p){
        String sql = "insert into proveedor (ruc, nombre, telefono, direccion, razon) values (?,?,?,?,?)" ;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getRuc());
            ps.setString(2, p.getNombre());
            ps.setInt(3,p.getTelefono());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getRazon());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public List ListarProveedor(){
        List<Proveedor> listProveedor = new ArrayList();
        String sql = "select * from proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Proveedor pr = new Proveedor();
                pr.setId(rs.getInt("id"));
                pr.setRuc(rs.getInt("ruc"));
                pr.setNombre(rs.getString("nombre"));
                pr.setTelefono(rs.getInt("telefono"));
                pr.setDireccion(rs.getString("direccion"));
                pr.setRazon(rs.getString("razon"));
                listProveedor.add(pr);                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listProveedor;
    }
    public boolean EliminarProveedor(int id){
        String sql = "delete from proveedor where id=?";
        try {
            con = cn.getConnection();
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
    public boolean ModificarProveedor(Proveedor pr){
        String sql="update proveedor set ruc=?, nombre=?, telefono=?, direccion=?, razon =? where id=?";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setInt(1, pr.getRuc());
            ps.setString(2, pr.getNombre());
            ps.setInt(3, pr.getTelefono());
            ps.setString(4, pr.getDireccion());
            ps.setString(5, pr.getRazon());
            ps.setInt(6, pr.getId());       
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
}
