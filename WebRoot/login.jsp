<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>̩���²��ϵ�¼ҳ��</title>

<script type="text/javascript">
	
</script>


</head>
<body>

	<s:form action="login" theme="simple" enctype="multipart/form-data"
		method="post">

		<table align="center" width="30%" border="2">


			<tr>
				<td>�û���:</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>����:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><s:submit value="��¼"></s:submit></td>
			</tr>

		</table>
	</s:form>

</body>
</html>