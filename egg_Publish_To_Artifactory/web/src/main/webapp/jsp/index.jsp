<%@ page language="java" import="java.util.*" %> 
<%@ page language="java" import="net.codetojoy.common.UserDto" %> 

<% 
ResourceBundle resource = ResourceBundle.getBundle("build-info");
String version = resource.getString("version");
String timestamp = resource.getString("timestamp"); 

String dtoVersion = UserDto.VERSION; 
%>

<html>
<h3>Hello from the simple User webapp</h3>
<p>version     : <%= version %></p>
<p>timestamp   : <%= timestamp %></p>
<p>dto version : <%= dtoVersion %></p>
</html>
