<%@ page contentType="text/html;charset=UTF-8" %>
<html><body>
<% if(request.getAttribute("message") != null){ %>
  <h3 style="color:green;"><%= request.getAttribute("message") %></h3>
<% } else if(request.getAttribute("error") != null){ %>
  <h3 style="color:red;"><%= request.getAttribute("error") %></h3>
<% } %>
<a href="contacts">Back to Home</a>
</body></html>
