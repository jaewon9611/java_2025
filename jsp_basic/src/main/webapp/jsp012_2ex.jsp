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
		<h3 class="card-header"> Statement </h3>
		<pre class="alert alert-warning">
		1. userinfo 테이블 가져오기
		</pre>
		<%@page import="java.sql.*"%>
		<%
		Connection conn = null; PreparedStatement pstmt = null;  ResultSet rset = null;
		try{
			//1. 드라이버연동
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. DB연동  - 끊기까지 처리
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic" , "root","1234");
			//3. PreparedStatement 로 sql처리
			pstmt = conn.prepareStatement("select * from userinfo");
			
			//4. 결과물
			rset = pstmt.executeQuery();
			while(rset.next()){
				out.println(rset.getInt("no") + "/"+ rset.getString("name") + "/" + rset.getInt("age") + "<br/>");				
			}
		}catch(Exception e){ e.printStackTrace();
		}finally{
			if(rset != null) { rset.close();}
			if(pstmt != null) { pstmt.close();}
			if(conn != null) { conn.close();}
		}
		%>
	</div>
</body>
</html>		