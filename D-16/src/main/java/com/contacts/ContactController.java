package com.contacts;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");
        String email = req.getParameter("email");
        List<Contact> contacts = ContactServlet.getContacts();

        switch (action) {
            case "delete":
                contacts.removeIf(c -> c.getEmail().equals(email));
                req.setAttribute("message", "Contact deleted successfully!");
                break;
            case "edit":
                for (Contact c : contacts) {
                    if (c.getEmail().equals(email)) {
                        req.setAttribute("contact", c);
                        req.getRequestDispatcher("editContact.jsp").forward(req, res);
                        return;
                    }
                }
                req.setAttribute("error", "Contact not found!");
                break;
            case "update":
                String newName = req.getParameter("name");
                String newPhone = req.getParameter("phone");
                for (Contact c : contacts) {
                    if (c.getEmail().equals(email)) {
                        c.setName(newName);
                        c.setPhone(newPhone);
                        req.setAttribute("message", "Contact updated successfully!");
                        break;
                    }
                }
                break;
        }
        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("index.jsp").forward(req, res);
    }
}
