<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="utf-8">

<%@ include file="../layout/header.jspf"%>

<title>GUESTBOOK</title>
</head>
<body>
	<div class="container">
		<br />
		<h1>소중한 의견을 남겨주세요 :)</h1>
		<div class="card" id="guestbookCard">
			<form>
				<div class="card-body">
					<textarea id="reply-content" class="form-control" rows="10"></textarea>
				</div>
				<div class="card-footer">
					<button type="button" id="btn-reply-save" class="btny">등록</button>
				</div>
			</form>
		</div>

		<div class="card" id="guestbookCard">
			<div class="card-header">작성자</div>
			<div class="card-body">동해물과 백두산이 마르고 닳도록</div>
			<div class="card-footer">2023-04-05</div>
		</div>
	</div>

	<%@ include file="../layout/footer.jspf"%>