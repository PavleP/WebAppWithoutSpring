package com.packt.cookbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");

    PrintWriter out = resp.getWriter();

    String message = "If you're reading this, it worked!";

    out.println("<HTML><BODY>");
    out.println("<H1>" + message + "</H1>");
    out.println("</HTML></BODY>");
    out.close();
  }
}
