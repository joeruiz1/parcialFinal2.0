/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Dao.CrudColmena;
import VO.RegistroMiel;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando stiven
 */
public class ControlMiel extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     boolean resultado = false;
        String fecha = request.getParameter("fecha");
        String recolector = request.getParameter("recolector");
        String idColmena = request.getParameter("idColmena");
        String KilosMiel = request.getParameter("KilosMiel");

        int id_colmena = Integer.parseInt(idColmena);
        int K_colmena =Integer.parseInt(KilosMiel);

        if (KilosMiel.trim().length() > 0  ) {
         try {
             resultado = true;
             RegistroMiel m=new RegistroMiel(fecha,recolector,id_colmena,K_colmena);
             CrudColmena c=new CrudColmena();
             c.agregarColmena(m);
             
             RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
             if (resultado == true) {
                 request.setAttribute("resultado", true);
             } else {
                 request.setAttribute("resultado", false);
             }
             rq.forward(request, response);
         } catch (URISyntaxException ex) {
             Logger.getLogger(ControlMiel.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
