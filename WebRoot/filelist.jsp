<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<title>�б��ϴ��ļ�ҳ��</title>

		<script type="text/javascript">
	function addMore() {
		var td = document.getElementById("more");
		var br = document.createElement("br");
		var input = document.createElement("input");
		var button = document.createElement("input");
		input.type = "file";
		input.name = "file";
		button.type = "button";
		button.value = "Remove";

		button.onclick = function() {
			td.removeChild(br);
			td.removeChild(input);
			td.removeChild(button);
		}

		td.appendChild(br);
		td.appendChild(input);
		td.appendChild(button);

	}
</script>


	</head>
	<body>
		<table align="center" width="60%">
			<tr>
				<s:iterator value="%{files}" id="id" status="status">
					<tr>
						<td align="center">
							�ļ�����
							<s:property value='%{id}' />
						</td>
						<td align="center">
							<s:a href="download.action?fileName=%{id}">�������</s:a>

						</td>
				</s:iterator>
			</tr>
		</table>

		<s:form action="upload" theme="simple" enctype="multipart/form-data"
			method="post">

			<table align="center" width="50%" border="2">


				<tr>
					<td>
						ѡ���ļ�:
					</td>
					<td id="more">
						<s:file name="file"></s:file>
						<input type="button" value="�ϴ�����..." onclick=
	addMore();
>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value=" ȫ���ϴ� "></s:submit>
					</td>
				</tr>

			</table>
		</s:form>

	</body>
</html>