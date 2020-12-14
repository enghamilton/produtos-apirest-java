package com.produtos.apirest.controllers;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ControllerServlet extends HttpServlet {
 
   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello World";
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();

      RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");
      rd.forward(request, response);

      /*
      String name=request.getParameter("name");
      String password=request.getParameter("password");

      LoginBean bean=new LoginBean();
      bean.setName(name);
      bean.setPassword(password);
      request.setAttribute("bean",bean);

      boolean status=bean.validate();

      if(status){
       RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");
       rd.forward(request, response);
      }
      else{
       RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");
       rd.forward(request, response);
      }
      */


   }

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
      doPost(req, resp);
   }
 
   public void destroy() {
      // do nothing.
   }
}
