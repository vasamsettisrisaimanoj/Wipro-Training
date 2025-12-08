package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		int number = Integer.parseInt(req.getParameter("phone"));
		PrintWriter out = res.getWriter();
		out.println("name is :"+name);
		out.println("number is :"+number);
		
	}
}
