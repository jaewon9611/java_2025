<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-3">
		<h3 class="card-header  my-5">Milk Menu</h3>
		<table class="table table-bordered table-striped">
			<caption>메뉴판</caption>
			<thead>
				<tr>
					<th scope="col">no</th>
					<th scope="col">name</th>
					<th scope="col">price</th>
				</tr>
			</thead>
			<tbody>
			<%@page import="java.sql.*"%>
				<%
				Connection conn = null; PreparedStatement pstmt = null;  ResultSet rset = null;
				try{
					//1. Driver 연동
				Class.forName("com.mysql.cj.jdbc.Driver");
				//2. db연동
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root","1234");
				//3. PreparedStatement 로 sql실행
				pstmt = conn.prepareStatement("select * from milk");
				//4. 결과물처리
				rset = pstmt.executeQuery();
				while(rset.next()){
					out.println(rset.getInt("mno")+ "/" + rset.getString("mname") + "/"+ rset.getInt("mprice") + "<br/>");
					}
				}catch(Exception e) { e.printStackTrace();
				}finally{
					if(rset != null) {rset.close();}
					if(pstmt != null) {pstmt.close();}
					if(conn != null) {conn.close();}
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>
