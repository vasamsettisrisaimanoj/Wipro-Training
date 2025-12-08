package com.contacts;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/contacts")
public class ContactServlet extends HttpServlet {
    private static List<Contact> contacts = new ArrayList<>();

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.setAttribute("contacts", contacts);
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        rd.forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");

        if (name == null || phone == null || email == null || name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            req.setAttribute("error", "All fields are required!");
            req.getRequestDispatcher("message.jsp").forward(req, res);
            return;
        }

        contacts.add(new Contact(name, phone, email));
        req.setAttribute("message", "Contact added successfully!");
        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("message.jsp").forward(req, res);
    }

    // To allow controller to access list
    public static List<Contact> getContacts() {
        return contacts;
    }
}

