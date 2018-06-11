<%@ page language="java" import="java.util.*" %> 
<%@ page language="java" import="java.util.regex.*" %> 
<%@ page language="java" import="java.time.*" %> 
<%@ page language="java" import="java.time.format.*" %> 
<%@ page language="java" import="net.codetojoy.web.BuildInfo" %> 

<% 
// ------------- ENV label / CSS
// build tickle 20:00 26-JAN-2017

final String ENV_LOCAL = "5150";
final String ENV_DEV = "5555";
final String ENV_QA = "5566";
final String ENV_UAT = "5577";

Map<String,String> colorMap = new HashMap<String,String>();
colorMap.put("5150", "#b9fb9d");     // local green    
colorMap.put("5555", "#fbdb9b");     // DEV tan
colorMap.put("5566", "#9dc4f9");     // QA blue
colorMap.put("5577", "#b9fb9d");     // UAT green

Map<String,String> labelMap = new HashMap<String,String>();
labelMap.put("5150", "LOCAL");
labelMap.put("5555", "DEV");
labelMap.put("5566", "QA");
labelMap.put("5577", "UAT");
 
// NOTE: The Jetty plugin doesn't seem to like Pattern (!?)
Pattern regex = Pattern.compile(".*:(\\d\\d\\d\\d).*");
String requestURL = request.getRequestURL().toString();
Matcher matcher = regex.matcher(requestURL);

String backgroundColor = "white";
String env = "?";

if (matcher.matches()) {
    String port = matcher.group(1); 
    if (colorMap.keySet().contains(port)) {
        backgroundColor = colorMap.get(port);
    }
    if (labelMap.keySet().contains(port)) {
        env = labelMap.get(port);
    }
}

// ------------- current time in America/Halifax

Instant nowInstant = new Date().toInstant();
ZoneId zoneId = ZoneId.of("America/Halifax");
ZonedDateTime halifaxTime = ZonedDateTime.ofInstant(nowInstant, zoneId);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd kk:mm:ss a");
String currentTime = halifaxTime.format(formatter);

// ------------- build info

String buildInfo = new BuildInfo().toString();
%>

<html>
<head>
  <title>ENV: <%= env %></title>
</head>

<body style="background-color:<%= backgroundColor %>;">

<h3>EasyToo Build Info:</h3>
<pre>
<%= buildInfo %>
</pre>

<hr />

<h3>Current Time:</h3>
<pre>
<%= currentTime %>
</pre>

<h3>tag</h3><pre>latest dev</pre>

</body>
</html>
