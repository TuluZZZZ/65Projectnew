package com.tms;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/age18")
public class Age18 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String age = request.getParameter("age");
        try {
                      int i = Integer.parseInt(request.getParameter("age"));
                        if (i >= 18) {
                writer.println("<h2>Вы совершеннолетний</h2>");
                ;
            } else {
                writer.println("<h2>Вы не совершеннолетний</h2>");
            }
        }finally {
            writer.close();
        }

    }




        }


