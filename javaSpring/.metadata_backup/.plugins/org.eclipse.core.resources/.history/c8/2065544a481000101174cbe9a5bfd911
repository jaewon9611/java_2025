<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring 유용한기능</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="container card">
		<h3 class="card-header bg-success text-white"> USERS </h3>
		<!-- for(UserDto u : list){} -->
		<c:forEach var="u" items ="${list}"   varStatus= "status" >
		<div class="alert alert-warning my-3">
			NO : ${u.no} - NAME : ${u.name } -  AGE : ${u.age}
		</div>
		</c:forEach>
	</div>
	<div>
	<!-- 빈칸검사 -->
	      <form method="post" 
             action="insert.users"   id="userInsert">
           <fieldset> 
           <legend>유저입력폼</legend>
            <div class="form-group"> 
               <label for="name">이름</label>
               <input type="text" name="name"   id="name"   class="form-control"/>
            </div>   
          <div class="form-group"> 
               <label for="age">나이</label>
               <input type="number" name="age"   id="age"   class="form-control"/>
            </div>           
            <div class="form-group">
               <input type="submit" value="전송"  class="btn  btn-danger"/>
            </div>
         </fieldset>      
      </form> 
	   <script>
   function form(){  
      let name = document.getElementById("bname");
      let title = document.getElementById("btitle");
      let content = document.getElementById("bcontent");
   
      if(name.value ==""){alert("빈칸입니다");   bname.focus();  return false; }
      if(title.value ==""){alert("빈칸입니다");   btitle.focus();  return false; }
      if(content.value ==""){alert("빈칸입니다");   bcontent.focus();  return false; }
   }
   </script>
	
	</div>
</body>
</html>