package Ex4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex4/RegisterServlet")
public class RegisterServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RegisterServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("Server at: ").append(req.getContextPath());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String birthday = req.getParameter("birthday");
		String birthtime = req.getParameter("birthtime");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		String[] favorite_ide = req.getParameterValues("favorite_ide[]");
		String toeic = req.getParameter("toeic");
		String message = req.getParameter("message");
		
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.setAttribute("birthday", birthday);
		req.setAttribute("birthtime", birthtime);
		req.setAttribute("country", country);
		req.setAttribute("gender", gender);
		req.setAttribute("favorite_ide", favorite_ide);
		req.setAttribute("toeic", toeic);
		req.setAttribute("message", message);
		
		resp.setContentType("text/html;charset=UFT-8");
		req.setCharacterEncoding("utf-8");
		req.getRequestDispatcher("profile.jsp").forward(req, resp);
		
		
	}
}
