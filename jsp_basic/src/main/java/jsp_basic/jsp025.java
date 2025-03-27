package jsp_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user_join")
public class jsp025 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public jsp025() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("name");
			String pass = request.getParameter("pass");
			int result = -1;
			DBManager db= new DBManager();
			Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
			String sql = "select count(*) 'cnt' from member where name=? and pass=?";
			try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);    System.out.println(2);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {result= rset.getInt("cnt");}
											System.out.println(3);
			if(result ==1) {
				HttpSession session = request.getSession();
				session.setAttribute("username", name);
				//response.sendRedirect("jsp025_my.jsp");
				out.println("<script>alert('로그인성공!'); location.href='jsp025_my.jsp'; </script>");
			}else {
				out.println("<script>alert('정보를 확인해주세요!'); history.go(-1);</script>");
			}
			
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			}catch(Exception e) {
			}finally {
				if(rset != null) {try {rset.close();} catch(SQLException e) {e.printStackTrace();}}
				if(pstmt != null) {try {pstmt.close();} catch(SQLException e) {e.printStackTrace();}}
				if(conn != null) {try {conn.close();} catch(SQLException e) {e.printStackTrace();}}
			}
			
		
	}
}
