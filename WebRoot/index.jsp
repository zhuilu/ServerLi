<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <base href="<%=basePath%>">
 
        <title>My JSP 'index.jsp' starting page</title>
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <meta http-equiv="expires" content="0">
        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
        <meta http-equiv="description" content="This is my page">
        <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    </head>
 
    <body>
    <body>
        <%
            //String swfPath = (String) application.getAttribute("swfPath");
            //out.println(swfPath);
        %>
          
        <div align="center">
            <embed src="swf/android_20150329.swf" quality="high" wmode="transparent"
                bgcolor="#ffffff" width="1200" height="1000" align="middle"
                allowScriptAccess="sameDomain" type="application/x-shockwave-flash"
                pluginspage="http://www.macromedia.com/go/getflashplayer" />
        </div>
         
 
    </body>
  
</html>