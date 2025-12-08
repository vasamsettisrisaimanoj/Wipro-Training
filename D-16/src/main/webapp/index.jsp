<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*,com.contacts.Contact" %>
<html>
<head>
<title>Contact Manager</title>
<style>
body{font-family:Arial;background:#f5f5f5;padding:30px}
.container{max-width:800px;margin:auto;background:white;padding:20px;border-radius:10px}
table{width:100%;border-collapse:collapse;margin-top:20px}
th,td{padding:10px;border-bottom:1px solid #ddd;text-align:left}
button,a{background:#007bff;color:white;border:none;padding:8px 16px;border-radius:4px;text-decoration:none}
button:hover,a:hover{background:#0056b3}
</style>
</head>
<body>
<div class="container">
    <h1>Contact Manager</h1>
    <form action="addContact.jsp" method="get">
        <button type="submit">Add Contact</button>
    </form>

    <%
        List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
        if (contacts != null && !contacts.isEmpty()) {
    %>
    <table>
        <tr><th>Name</th><th>Phone</th><th>Email</th><th>Actions</th></tr>
        <% for (Contact c : contacts) { %>
        <tr>
            <td><%= c.getName() %></td>
            <td><%= c.getPhone() %></td>
            <td><%= c.getEmail() %></td>
            <td>
                <form action="ContactController" method="post" style="display:inline;">
                    <input type="hidden" name="action" value="edit">
                    <input type="hidden" name="email" value="<%= c.getEmail() %>">
                    <button type="submit">Edit</button>
                </form>
                <form action="ContactController" method="post" style="display:inline;">
                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" name="email" value="<%= c.getEmail() %>">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
        <% } %>
    </table>
    <% } else { %>
        <p>No contacts yet. Add one above!</p>
    <% } %>
</div>
</body>
</html>
