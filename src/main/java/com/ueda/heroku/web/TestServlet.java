/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import JavaBeans.testBeans;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author syumpei
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req
     * @param res
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
         this.doPost(req,res);
     }
    

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        
        String message;
        String name;
        Integer counter;
        
        RequestDispatcher rd;
        HttpSession session = req.getSession(false);
        
        //セッション獲得
        if(session == null){
            session = req.getSession(true);
            message = "This is first access";
            counter = new Integer(1);
        }else {
            counter = (Integer)session.getAttribute("counter");
            if(counter == 2){
                message = "This is second times access";
            }else if(counter == 3){
                message = "This is third times access";
            }else{
                message = "This is " + counter + "th times access";
                }
        }
        
        //カウンターセット
        counter++;
        session.setAttribute("counter",counter );
        session.setAttribute("message",message );
        //Formデータ獲得
        name = req.getParameter("name");

        //Formデータをセッションにセット
        testBeans tb = new testBeans();
        tb.setName(name);
        tb.setMessage(message);
        
        session.setAttribute("testbeans",tb);
        
        //フォワード
        rd = req.getRequestDispatcher("/JSP/testJsp.jsp");
        rd.forward(req, res);
        
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
