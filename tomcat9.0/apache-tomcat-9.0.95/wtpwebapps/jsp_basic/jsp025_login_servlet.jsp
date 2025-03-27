<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@
include file="jsp022_header.jsp"
 %>

<!-- navbar -->
<!-- navbar -->
<div class="container card  my-5">
		<h3 class="card-header"> LOGIN </h3>
		<pre class="my-3"> 
		</pre>
		<!-- Q 이미지를 중앙으로 -->
		<p style="text-align:center"><img src="images/login.png" alt="login"/></p>  
		<form action="user_login"  method="post" onsubmit="return login()">
			<div class="my-3">
				<label for="name"   class="form-label">Email : </label>
				<input type="text"  class="form-control"  id="name"  name="name" />      
			</div>
			<div class="my-3">
				<label for="pass"       class="form-label">Password : </label>
				<input type="password"  class="form-control"  id="pass"  name="pass" />      
			</div>		
			<div class="my-3">
				<label for="check"       class="form-label">Remember : </label>
				<input type="checkbox"   id="check"  name="remember" />      
			</div>	
			<div class="my-3"> 
				<input type="submit"    title="login 하러가기"
				       class="btn btn-danger"  id="check"  name="remember" />      
			</div>								
		</form>
		<script>
			function login() {
				let name = document.querySelector("#name");
				let pass =  document.querySelector("#pass");
				if (name.value =="") {
					alert("Email칸을 입력해주세요");
					name.focus();
					return false;
				}
				if (pass.value =="") {
					alert("Password칸을 입력해주세요"); 
					pass.focus();
					return false;
				}
			}
		</script> 
</div>
	<!-- login.jsp -->
	<!-- login.jsp -->
	
	<!-- footer.jsp -->
	<!-- footer.jsp -->
	<!-- 파일분리 : jsp022_footer.js -->
	
	
</body>
</html>