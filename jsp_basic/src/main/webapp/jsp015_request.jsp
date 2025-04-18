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
	<div class="container card bg-info my-5">
		<h3 class="card-header bg-text-white"> 내장객체 </h3>
		<pre style="background-color:white">
		1. jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될때
		2. 고정된 이름의 객체 컨테이너로 자동으로 구현
		3. request(요청) , response(응답), session(정보저장) , out(출력)	
		</pre>
	</div> <!-- 내장객체안내 -->
	
	<div class="container card my-5">
		<h3 class="card-header bg-info text-white">request(요청)</h3>
		<pre>
		1. action="처리컴포넌트"
		2. method="처리방식"
		3. name="사용자가입력한값보관이름"
		</pre>
		<form action="jsp015_radio.jsp"  method="get" onsubmit="return checkbox()">
        <div class="mb-3 mt-3">
          <label for="username" class="form-label">NAME</label> 
          <input type="text" class="form-control" id="username"
               placeholder="Enter email" name="username">
         </div><!-- user name -->
         <div class="form-check">
           <input class="form-check-input" type="checkbox" 
                  id="check1" name="option1" value="dog" >
           <label class="form-check-label" for="check1">DOG</label>
         </div>
         <div class="form-check">
           <input class="form-check-input" type="checkbox" 
                  id="check2" name="option1" value="cat" >
           <label class="form-check-label" for="check2">CAT</label>
         </div>   
         <div class="form-check">
           <input class="form-check-input" type="checkbox" 
                  id="check3" name="option1" value="fish" >
           <label class="form-check-label" for="check3">FISH</label>
         </div>
         <div class="my-3">
         	<button type="submit" class="btn btn-primary">전송</button>
         </div>              
      </form>
      <script>
      // username 빈칸검사하기
      function checkbox(){
    	  let username = document.getElementById("username");
    	  let checkboxs= document.querySelectorAll(".form-check-input:checked");
    	  console.log(checkboxs);
    	  console.log(checkboxs.length);
    	  
    	  if(username.value == "") {
    		  alert("빈칸입니다."); username.focus(); return false;
    	  }
    	  if(checkboxs.length == 0) {
    		  alert("체크박스를 한개이상은 체크하셔야합니다.");
    		  return false;
    	  }
      }
      </script>
	</div> <!-- end checkbox -->
	
	<div class="container card my-5">
		<h3 class="card-header  bg-info text-white">request(요청) -radio</h3>
		<!-- http://localhost:8080/jsp_basic/jsp015_checkbox.jsp?username=sally&option1=dog&option1=cat -->
		<form action="jsp015_radio.jsp" method="get"
			onsubmit="return check2()">
			<div class="mb-3 mt-3">
				<label for="username1" class="form-label">NAME:</label> <input
					type="text" class="form-control" id="username1"
					placeholder="사용자 이름을 적어주세요" name="username">
			</div>
			<!-- user name -->
			<!-- radio *** 단일 선택 **** --> 
			<div class="form-check">
				<input type="radio" class="form-check-input1" id="radio1" style="margin-right:10px"
					name="optradio" value="YES" checked> YES <label
					class="form-check-label" for="radio1"></label>
			</div>
			<div class="form-check">
				<input type="radio" class="form-check-input1" id="radio2"
					name="optradio" value="NO"> NO <label
					class="form-check-label" for="radio2"></label>
			</div>
			<div class="form-check">
				<input type="radio" class="form-check-input1" disabled> disabled  사용 못 함 <label class="form-check-label"></label>
			</div>
			<!-- radio -->
			<div class="form-check form-switch">
				<input class="form-check-input" type="checkbox" id="mySwitch"
					name="darkmode" value="yes" checked> <label
					class="form-check-label" for="mySwitch">Dark Mode</label>
			</div>
			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>

		<script>
			// username 빈칸검사하기
			function check2() {
				let username1 = document.getElementById("username");
				let checkboxs = document
						.querySelectorAll(".form-check-input1:checked"); //다중선택
				//console.log(checkboxs); 
				//console.log(checkboxs.length); 

				if (username.value == "") {
					alert("빈칸입니다.");
					username.focus();
					return false;
				}
				if (checkboxs.length == 0) {
					alert("체크박스를 한개이상은 체크하셔야합니다.");
					return false;
				}

			}
		</script>
	</div> <!-- end radio -->
		<div class="container card my-5">
		<h3 class="card-header  bg-info text-white">request(요청) - select</h3>
		
		<form action="jsp015_select.jsp" method="get"
			onsubmit="return check3()">
			<div class="mb-3 mt-3">
				<label for="username3" class="form-label">NAME:</label> <input
					type="text" class="form-control" id="username3"
					placeholder="사용자 이름을 적어주세요" name="username">
			</div>
			<!-- select-->
			<!-- select-->
			<label for="color">COLOR 선택</label>
			<select class="form-select" id="color" name="color">
 			 <option value="bg-danger"> RED</option>
			 <option value="bg-success">GREEN</option>
			 <option value="bg-primary">BLUE</option>
			 <option value="bg-dark">   BLACK</option>
			</select>
			<!-- select-->
			<!-- select-->
			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>
		<script>
			// username 빈칸검사하기
			function check3() {
				let username3 = document.querySelector("#username3");
				let color  = document.querySelector("#color > option:checked");
				console.log(color.value); 

				if (username3.value == "") {
					alert("빈칸입니다.");
					username3.focus();
					return false;
				}
				if (color.value == "") {
					alert("빈칸입니다"); color.focus();
					return false;
				}

			}
		</script>
	</div>
</body>
</html>		