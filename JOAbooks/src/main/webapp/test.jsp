<%@page import="org.apache.commons.collections4.bag.SynchronizedSortedBag"%>
<%@page import="com.company.domain.BoardVO"%>
<%@page import="com.company.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp" %>

<div class="container card  my-5">
		<h3 class="card-header"> PROJECT (1) 셋팅</h3>
		<ol>
			<li>project 생성</li>
			<li>[inc]-header.jsp/footer.jsp</li>
			<li>[inc]-error404.jsp/error500.jsp , [WEB-INF]-web.xml</li>
			<li> DBCP</li>
		</ol>
		
		<h4>ERROR TEST</h4>
		<%--<a href="no">없는페이지</a>
		<%=null %> --%>
		<h4>DBCP</h4>
		<%@page import="javax.naming.*"%>
		<%@page import="javax.sql.*"%>
		<%@page import="java.sql.Connection"%>
		<%-- <%
		Context initContext = new InitialContext(); // Context 찾겠다 - Resource
		Context envContext  = (Context)initContext.lookup("java:/comp/env");  // 환경Context
		DataSource ds         = (DataSource)envContext.lookup("jdbc/mbasic"); // pool 이름
		Connection conn = ds.getConnection(); // db연동
		out.println("db연동");
		%> --%> 
</div>	<!-- END DIV -->
	
<div class="container card  my-5">
	<h3 class="card-header"> PROJECT (2) MODEL</h3>
	<pre>
	1. Dto :           [com.company.domain]      - BoardVO private
	2. DBManager : [com.company.dbmanager] - DBManager
	3. Dao :          [com.company.dao]           - BoardDao
	</pre>
	<%
	BoardDao dao = new BoardDao();
	//6. delete
	System.out.println(dao.delete(4)); 
	System.out.println(dao.select(4));
	
	//5. update
	/*
	BoardVO vo = new BoardVO();
	vo.setBtitle("제목-new!");
	vo.setBcontent("내용-new");
	vo.setBno(4);
	System.out.println(dao.update(vo)); 
	System.out.println(dao.select(4));
	*/
	// 1
	
	//4. updateHit
	//System.out.println(dao.updateHit(4));
	//3. select
	//System.out.println(dao.select(4)); // 있는번호
	
	//2. insert( BoardVO vo ) -btitle , bcontent ,bname
	/*
	BoardVO vo = new BoardVO();
	vo.setBtitle("첫번째 문의드려요!");
	vo.setBcontent("내용");
	vo.setBname("first");
	System.out.println(dao.insert(vo)); // 1
	*/
	
	//1. selectAll
	System.out.println(dao.selectAll());
	%>
</div> <!-- END DIV -->
<div class="container card  my-5">
	<h3 class="card-header"> PROJECT (3) VIEW</h3>
	<pre>
	[webapp] - [board]
				ㄴ list.jsp
				ㄴ write.jsp
				ㄴ detail.jsp
				ㄴ update.jsp
				
	1. markup
	2. validator - 오류검사
	3. 빈칸검사			
	</pre>
</div>

<%@ include file="inc/footer.jsp"%>