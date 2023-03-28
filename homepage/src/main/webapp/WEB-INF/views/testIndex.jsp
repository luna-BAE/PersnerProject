<%@ include file = "layout/testHeader.jspf" %>

<title>Insert title here</title>
</head>
<body>
	<c:forEach var="list" items="${list}">
		<ul class="list-group">
			<li class="list-group-item">${list.content }</li>
		</ul>
	</c:forEach>
</body>
</html>