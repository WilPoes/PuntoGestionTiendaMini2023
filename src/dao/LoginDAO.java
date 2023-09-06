package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entidades.Usuario;

public class LoginDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Usuario Ingreso(String correo, String pass) {

        Usuario usuario = new Usuario();
        String sql = "select * from USUARIO where CORREO = ? and PASS = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
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
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return usuario;
    }
}
