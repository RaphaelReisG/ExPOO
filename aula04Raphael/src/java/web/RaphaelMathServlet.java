/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "RaphaelMathServlet", urlPatterns = {"/operacao.html"})
public class RaphaelMathServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RaphaelMathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RaphaelMathServlet at " + request.getContextPath() + "</h1>");
            
            
            double nn1 = 1;
            double nn2 = 1;
            String op = "";
            
            try{
                nn1 = Double.parseDouble(request.getParameter("nn1"));
               
                nn2 = Double.parseDouble(request.getParameter("nn2"));
                
                op = request.getParameter("op");
            }catch(Exception ex){
                out.println("<h1 style='color:red'>USUARISSE ENCONTRADA <br> parametro invalido</h1>");
            }
            
            out.println("<h4><a href='index.html'>voltar</a></h4>");
            out.println("<form >\n" +
                "            <input type=\"number\" step=\"0.1\" name=\"nn1\" value=\""+nn1+"\"/>\n" +
                "            <select name=\"op\">\n" +
                "                <option value=\""+op+"\">"+op+"</option>\n" +
                "                <option value=\"soma\">+</option>\n" +
                "                <option value=\"sub\">-</option>\n" +
                "                <option value=\"mult\">*</option>\n" +
                "                <option value=\"div\">/</option>\n" +
                "            </select>\n" +
                "            <input type=\"number\" step=\"0.1\" name=\"nn2\" value=\""+nn2+"\"/>\n" +
                "            <input type=\"submit\"  value=\"=\"/>           \n" +
                "        </form>");
            
             out.println("<h2>Operação "+op+"</h2>");
             String somar = "soma";
             if(op.equals("soma")){
                 out.println("<h3>"+nn1+" + " +nn2+ " = " +(nn1+nn2)+ "</h3>");
             }
             else if(op.equals("sub")){
                 out.println("<h3>"+nn1+" - " +nn2+ " = " +(nn1-nn2)+ "</h3>");
             }
             else if(op.equals("mult")){
                 out.println("<h3>"+nn1+" * " +nn2+ " = " +(nn1*nn2)+ "</h3>");
             }
             else if(op.equals("div")){
                 out.println("<h3>"+nn1+" / " +nn2+ " = " +(nn1/nn2)+ "</h3>");
             }
             else{
        
                 out.println("<h3>Sem USUARISSE digite a opção certa</h3>");
             }
              
            
            
            
            
            out.println("</body>");
            out.println("</html>");
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
