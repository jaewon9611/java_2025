<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card  my-5">
		<h3 class="card-header bg-info text-black"> Select box </h3>
		<form action="jsp017_result.jsp" method = "get" onsubmit="return select()">
		<div class="mb-3 mt-3">
			<label for="username" class="form-label">NAME:</label> <input
					type="text" class="form-control" id="username"
					placeholder="김재원" name="username">
		</div>
		<label for="fruit">좋아하는 과일 선택</label>
			<select class="form-select" id="fruit" name="fruit">
			 <option value="">-- 선택 --</option>
 			 <option value="apple"> APPLE</option>
			 <option value="banana">BANANA</option>
			 <option value="coconut">COCONUT</option>
			</select>
			<div class="my-3">
				<button type="submit" class="btn btn-primary">수신체크하러가기</button>
			</div>
		</form>
		<script>
			function select() {
				let username = document.querySelector("#username");
				let fruit = document.querySelector("#fruit option:checked");
				console.log(fruit.value);
				if (username.value =="") {
					alert("빈칸");
					username.focus();
					return false;
				}
				if (fruit.value =="") {
					alert("옵션선택"); color.focus();
					return false;
				}
			}
		</script>
	</div>
</body>
</html>		