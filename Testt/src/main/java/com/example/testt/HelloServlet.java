package com.example.testt;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static java.lang.System.out;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n=request.getParameter("userName");
        String p=request.getParameter("userPass");

    try{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection con= null;
        try {
            con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/"+"test",
                    "Yasmin","Yasmin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PreparedStatement ps= null;
        try {
            ps = con.prepareStatement("insert into login values(?,?,?,?)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ps.setString(1,n);
        ps.setString(2,p);

        int i= 0;
        try {
            i = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(i>0)
            out.print("You are successfully registered...");


    }
    catch (SQLException e) {
        throw new RuntimeException(e);
    }
        //catch (Exception e2) {
        // out.println(e2);}

		//out.close();
}

}