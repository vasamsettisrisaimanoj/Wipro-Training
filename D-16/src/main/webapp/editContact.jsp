<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.contacts.Contact" %>
<%
Contact c = (Contact) request.getAttribute("contact");
%>
<html><body>
<h2>Edit Contact</h2>
<form action="ContactController" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="email" value="<%= c.getEmail() %>">
    Name: <input name="name" value="<%= c.getName() %>" required><br>
    Phone: <input name="phone" value="<%= c.getPhone() %>" required><br>
    Email: <input value="<%= c.getEmail() %>" disabled><br>
    <button type="submit">Update</button>
</form>
<a href="contacts">Cancel</a>
</body></html>
