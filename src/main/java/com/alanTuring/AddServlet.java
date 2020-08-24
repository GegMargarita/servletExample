package com.alanTuring;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {

        int i = Integer.parseInt(req.getParameter("num"));
        System.out.println(i);

        int j = Integer.parseInt(req.getParameter("num2"));
        int m= i+j;

        PrintWriter out = response.getWriter();
        out.println(m);
        response.getWriter().write("TagNamespaceChangeHandler  works");


    }


}
