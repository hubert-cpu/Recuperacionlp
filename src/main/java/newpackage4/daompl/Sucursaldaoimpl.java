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
import newpackage1.dao.SucursalDao;
import newpackage2.config.Conexion;
import newpackage3.entity.Sucursal;
;

/**
 *
 * @author TOSHIBA
 */
public class Sucursaldaoimpl implements SucursalDao{
    Connection cx;
    ResultSet rs;
    PreparedStatement pst;

    @Override
    public List<Sucursal> listar() {
      List<Sucursal> lista = new ArrayList<>();
        String consulta = "select * from sucursal;";
        try {
            cx = Conexion.getConexion();
            pst = cx.prepareStatement(consulta);
            rs=pst.executeQuery();
            while (rs.next()) {                
                Sucursal s = new Sucursal();
                s.setIdsucursal(rs.getInt("idsucursal"));
                s.setNombre(rs.getString("nombre"));
                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }

   
    
}
