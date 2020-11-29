/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package com.ueda.heroku.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author syumpei
 */
@WebServlet(name="TestServlet", urlPatterns={"/"})
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

        String name = (String) req.getAttribute("name");
        res.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<hl>Welcome<hl>" + name);
        
        out.println("<hl>記事を作成しましょう！<hl>");
        out.println("<input type=\"text\" name=\"article\" />");
        out.println("</body></html>");
    }
    
     protected void doPost(HttpServletRequest req, HttpServletResponse res) 
    throws ServletException, IOException {
     this.doGet(req, res);
     }
}
