package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import entidades.Cliente;
        
public class ClienteDAO {
    
    Connection con;  
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public boolean registrarCliente(Cliente c){
        
        String sql = "insert into CLIENTE (dni, estado, nombreapellidos, telefono, direccion, razon) values (?,?,?,?,?,?)" ;
        try {
            
            con = cn.getConnection();
            
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, c.getDni());
            ps.setString(2, c.getEstado());
            ps.setString(3, c.getNombre());
            ps.setInt(4, c.getTelefono());
            ps.setString(5, c.getDireccion());
            ps.setString(6, c.getRazon());
            
            ps.execute();
            
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    public List ListarCliente(){
        List<Cliente> listCliente = new ArrayList();
        String sql = "select * from CLIENTE";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Cliente cl = new Cliente();
                
                cl.setId(rs.getInt("id"));
                cl.setDni(rs.getInt("dni"));
                cl.setEstado(rs.getString("estado"));
                cl.setNombre(rs.getString("nombreapellidos"));
                cl.setTelefono(rs.getInt("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setRazon(rs.getString("razon"));
                listCliente.add(cl);
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listCliente;
    }
    public boolean EliminarCliente(int id){
        String sql = "delete from CLIENTE where id=?";
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
    public boolean ModificarCliente(Cliente cl){
        String sql="update CLIENTE set dni=?, estado=?, nombreapellidos=?, telefono=?, direccion=?, razon =? where id=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, cl.getDni());
            ps.setString(2, cl.getEstado());
            ps.setString(3, cl.getNombre());
            ps.setInt(4, cl.getTelefono());
            ps.setString(5, cl.getDireccion());
            ps.setString(6, cl.getRazon());
            ps.setInt(7, cl.getId());       
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
    public Cliente BuscarCliente(int dni){
        Cliente cl = new Cliente();
        String sql = "select * from clientes where dni = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                cl.setNombre(rs.getString("nombre"));
                cl.setTelefono(rs.getInt("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setRazon(rs.getString("razon"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cl;
    }
}
