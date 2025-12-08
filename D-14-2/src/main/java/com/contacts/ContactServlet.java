package com.contacts;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/contacts")
public class ContactServlet extends HttpServlet {
    private static List<Contact> contacts = new ArrayList<>();
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");
        res.setCharacterEncoding("UTF-8");
        PrintWriter out = res.getWriter();
        
        out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><meta name='viewport' content='width=device-width,initial-scale=1'>");
        out.println("<style>*{margin:0;padding:0;box-sizing:border-box}body{font-family:Arial;padding:20px;background:#f5f5f5}");
        out.println(".container{max-width:800px;margin:0 auto;background:white;padding:30px;border-radius:8px;box-shadow:0 2px 10px rgba(0,0,0,0.1)}");
        out.println("h1{color:#333;margin-bottom:20px}button{background:#007bff;color:white;border:none;padding:12px 24px;border-radius:5px;cursor:pointer;font-size:16px}");
        out.println("button:hover{background:#0056b3}.form{display:none;margin:20px 0;padding:20px;background:#f9f9f9;border-radius:5px}");
        out.println("input{width:100%;padding:10px;margin:10px 0;border:1px solid #ddd;border-radius:4px;font-size:14px}");
        out.println(".contact{background:#fff;padding:15px;margin:10px 0;border-left:4px solid #007bff;box-shadow:0 1px 3px rgba(0,0,0,0.1)}");
        out.println(".contact strong{color:#007bff;display:block;margin-bottom:5px}@media(max-width:600px){.container{padding:15px}button{width:100%}}</style></head><body>");
        
        out.println("<div class='container'><h1>Contact Manager</h1>");
        out.println("<button onclick=\"document.getElementById('form').style.display='block'\">Add Contact</button>");
        out.println("<div id='form' class='form'><form method='post'>");
        out.println("<input name='name' placeholder='Name' required>");
        out.println("<input name='phone' placeholder='Phone' required>");
        out.println("<input name='email' placeholder='Email' type='email' required>");
        out.println("<button type='submit'>Save Contact</button></form></div>");
        
        out.println("<h2 style='margin-top:30px;color:#555'>All Contacts (" + contacts.size() + ")</h2>");
        for(Contact c : contacts) {
            out.println("<div class='contact'><strong>" + c.name + "</strong> Phone: " + c.phone + "<br>Email: " + c.email + "</div>");
        }
        out.println("</div></body></html>");
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        contacts.add(new Contact(name, phone, email));
        res.sendRedirect("contacts");
    }
}