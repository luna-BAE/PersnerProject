<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="utf-8">
<%@ include file="../layout/header.jspf"%>

<title>STUDIO DETAIL</title>
</head>
<body>
	<div class="page">
		<div class="content">
			<div class="banner">
				<img src="/image/camera/lens-ge7d052d95_1920_solo.jpg">
			</div>

			<div class="bannerText">
				<p>찰나를 담는 공간</p>
				<div></div>
				<div></div>
			</div>

			<div class="container">

				<c:forEach var = "list" items="${studioList}">
					<div class="card" id="studioDetail">
						<img class="card-img-top" src="${list.studioPhoto}">
						<div class="card-body">
							<h4 class="card-title">${list.studioName}</h4>
							<p class="card-text">${list.studioAdd}</p>
							<a href="#" class="detailButton">See Detail</a>
						</div>
					</div>
				</c:forEach>
				
			</div>
		</div>
		<%@ include file="../layout/footer.jspf"%>
	</div>
</body>
</html>