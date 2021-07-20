/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1.dao;

import java.util.HashMap;
import java.util.List;
import newpackage3.entity.*;
/**
 *
 * @author TOSHIBA
 */
public interface VentaDao {
     List<HashMap<String,Object>> listar();
    int insertar(Venta v);
    int eliminar(int id_v);
}
