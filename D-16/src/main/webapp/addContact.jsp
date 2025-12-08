<%@ page contentType="text/html;charset=UTF-8" %>
<html><body>
<h2>Add Contact</h2>
<form action="contacts" method="post">
    Name: <input name="name" required><br>
    Phone: <input name="phone" required><br>
    Email: <input name="email" type="email" required><br>
    <button type="submit">Save</button>
</form>
<a href="contacts">Back</a>
</body></html>
