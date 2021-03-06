/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.controler;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import newpackage1.dao.ClienteDao;
import newpackage1.dao.SucursalDao;
import newpackage4.daompl.ClienteDaoImpl;
import newpackage4.daompl.Sucursaldaoimpl;

/**
 *
 * @author TOSHIBA
 */
@WebServlet(name = "TraerController", urlPatterns = {"/TC"})
public class TraerController extends HttpServlet{
    
    SucursalDao s = new Sucursaldaoimpl();
    ClienteDao c = new ClienteDaoImpl();
            
    Gson gson = new Gson();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter p = response.getWriter();
       int opcion = Integer.parseInt(request.getParameter("opc"));
       switch (opcion) {
		//Traer Sucursal
		case 1:
			System.out.println(opcion);
                        p.println(gson.toJson(s.listar()));
			break;
		//Traer Cliente
		case 2:
			System.out.println(opcion);
			p.println(gson.toJson(c.listar()));
			break;
		default:
			p.println("No hay nada");
			break;
		}
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
