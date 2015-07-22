<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>test</title>
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link type="text/css" rel="stylesheet" href="galleryview.css" />
<script type="text/javascript" src="js/jquery-1.4.min.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.galleryview-1.1.js"></script>
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery.effects.core.js" type="text/javascript"></script>
<script type="text/javascript" src="js/scripts.js"></script>
<script type="text/javascript" src="js/jquery.timers-1.1.2.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#photos').galleryView({
			panel_width : 800,
			panel_height : 300,
			frame_width : 100,
			frame_height : 100
		});
	});
</script>

<!-- <script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1255644402'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s4.cnzz.com/z_stat.php%3Fid%3D1255644402%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));</script> -->



</head>
<body>
	<%@ include file="cs.jsp"%>
	<%
		CS cs = new CS(1255644402);
		cs.setHttpServlet(request, response);
		String imgurl = cs.trackPageView();
	%><img src="<%=imgurl%>" width="0" height="0" />

</body>
</html>
