<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>泰尔新材料</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
<style type="text/css" media="screen">
html,body {
	height: 100%;
}

body {
	margin: 0;
	padding: 0;
	overflow: auto;
}

#flashContent {
	display: none;
}
</style>

<script type="text/javascript" src="flexpaper/js/jquery.js"></script>
<script type="text/javascript" src="flexpaper/js/flexpaper_flash.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				var fileURL = "upload/" + $("#name").val();
				var filenumber = $("#number").val();

				var fpr = new FlexPaperViewer('flexpaper/FlexPaperViewer',
						'viewerPlaceHolder', {
							config : {
								SwfFile : "{" + fileURL + "[*,1].swf,"
										+ filenumber + "}",
								Scale : 0.8,
								ZoomTransition : 'easeOut',
								ZoomTime : 0.5,
								ZoomInterval : 0.2,
								FitPageOnLoad : false,
								FitWidthOnLoad : true,
								PrintEnabled : false,
								FullScreenAsMaxWindow : true,
								ProgressiveLoading : true,
								MinZoomSize : 0.8,
								MaxZoomSize : 5,
								SearchMatchAll : false,
								InitViewMode : 'Portrait',
								ViewModeToolsVisible : false,
								ZoomToolsVisible : false,
								NavToolsVisible : false,
								CursorToolsVisible : false,
								SearchToolsVisible : false,
								localeChain : 'zh_CN'
							}
						});

			});
</script>
</head>
<body style="overflow-x:hidden;overflow-y:auto;">
	<div class="topbar">

		<h1>
			<a href="./"><img src="localimages/logo.jpg" alt="泰尔新材料"></a>
		</h1>

	</div>
	<div class="nav-t">

		<div class="p_nav" id="com_mainmenu" editok="online">
			<div id="smoothmenu1" class="ddsmoothmenu">
				<ul class="nav-n" id="nav">
					<li class="yahei"><a class="firstla" href="./">首页</a></li>
					<li class="line">|</li>
					<li class="yahei"><a href="#" class="nava">挑选款式</a>
						<ul>

							<li><a href="showdetail.action?name=MyFlexPaper"
								target="_blank"><span>男女正装</span></a></li>

							<li><a href="showdetail.action?name=MyFlexPaper"
								target="_blank"><span>女士旗袍</span></a></li>

						</ul></li>
					<li class="line">|</li>
					<li style="z-index: 100;" class="yahei"><a target="_blank"
						href="showdetail.action?name=chick">面料赏析</a></li>
					<li class="line">|</li>
					<li class="yahei"><a target="_blank"
						href="showdetail.action?name=chick" class="nava">时尚资讯</a></li>
					<li class="line">|</li>
					<li class="yahei"><a target="_blank"
						href="showdetail.action?name=chick" class="nava">VIP礼遇</a></li>
					<li class="line">|</li>
					<li class="yahei"><a target="_blank"
						href="showdetail.action?name=chick" class="nava">新品服务覆盖地区</a></li>
					<li class="line">|</li>
					<li class=""><a target="_blank"
						href="showdetail.action?name=chick" class="nava">关于我们</a>
						<ul>

							<li><a target="_blank" href="showdetail.action?name=chick">公司动态</a></li>

							<li><a target="_blank" href="showdetail.action?name=chick">关于我们</a></li>

							<li><a target="_blank" href="showdetail.action?name=chick">联系我们</a></li>

						</ul></li>
				</ul>
			</div>
		</div>

	</div>
	<input type="text" id="name" value="<s:property value='name'/>"
		style="visibility: hidden;" />
	<input type="text" id="number" value="<s:property value='number'/>"
		style="visibility: hidden;" />
	<div align="center" id="viewerPlaceHolder"
		style="width:100%;height:100%;display:block">努力加载中............</div>


</body>
</html>