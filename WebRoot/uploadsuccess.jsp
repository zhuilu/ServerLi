<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>黄山泰尔新材料有限公司</title>
</head>
<body>
   上传文件成功！<br>
   上传文件相关信息如下：<br>
   用户名：<s:property value="username"/><br>
   密码：<s:property value="password"/><br>
   文件：<s:property value="fileFileName"/><br>
   
   <a href="download.jsp">下载文件</a>

</body>
</html>