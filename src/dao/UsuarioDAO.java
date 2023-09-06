package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import entidades.Usuario;

public class UsuarioDAO {
    Connection con; 
    
    PreparedStatement ps;
    
    ResultSet rs;
    
    Conexion cn = new Conexion();
    
    public boolean registrarUsuario(Usuario u){        
        String sql = "insert into USUARIO (CORREO, PASS, DNI, ESTADO, NOMBREAPELLIDOS, TELEFONO, DIRECCION, RAZON,TIPO) values (?,?,?,?,?,?,?,?,?)" ;        
        try {            
            con = cn.getConnection();

            ps = con.prepareStatement(sql);            
            ps.setString(1, u.getCorreo());
            ps.setString(2, u.getPass());
            ps.setInt(3,u.getDni());
            ps.setString(4, u.getEstado());
            ps.setString(5, u.getNombre());
            ps.setInt(6, u.getTelefono());
            ps.setString(7, u.getDireccion());
            ps.setString(8, u.getRazon());            
            ps.setString(9, u.getTipo());
            
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
    
    public ArrayList ListarUsuario(){
        
        ArrayList<Usuario> listaAuxiliares = new ArrayList();
        
        String sql = "select * from TRABAJADOR";
        //
        try {            
            con = cn.getConnection();                        
            
            ps = con.prepareStatement(sql);      
            
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                
                Usuario usuario = new Usuario();
                
                usuario.setId(rs.getInt("ID"));
                usuario.setCorreo(rs.getString("CORREO"));
                usuario.setPass(rs.getString("PASS"));
                usuario.setDni(rs.getInt("DNI"));
                usuario.setEstado(rs.getString("ESTADO"));
                usuario.setNombre(rs.getString("NOMBREAPELLIDOS"));
                usuario.setTelefono(rs.getInt("TELEFONO"));
                usuario.setDireccion(rs.getString("DIRECCION"));
                usuario.setRazon(rs.getString("RAZON"));
                usuario.setTipo(rs.getString("TIPO"));
                
                listaAuxiliares.add(usuario);                
            }
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        } 
        return listaAuxiliares;
    }
}
