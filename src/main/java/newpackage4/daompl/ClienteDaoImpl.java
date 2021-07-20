/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage4.daompl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import newpackage1.dao.ClienteDao;
import newpackage2.config.Conexion;
import newpackage3.entity.cliente;

/**
 *
 * @author TOSHIBA
 */
public class ClienteDaoImpl implements ClienteDao{
      Connection cx;
    ResultSet rs;
    PreparedStatement pst;

    @Override
    public List<cliente> listar() {
       List<cliente> lista = new ArrayList<>();
        String consulta = "select * from cliente;";
        try {
            cx = Conexion.getConexion();
            pst = cx.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
                cliente s = new cliente();
                s.setIdcliente(rs.getInt("idcliente"));
                s.setNombres(rs.getString("nombres"));
                s.setApellidos(rs.getString("apellidos"));
                s.setTelefono(rs.getString("telefono"));
                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
}
