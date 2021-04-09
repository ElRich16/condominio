package condominio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import condominio.crud.UtenteCRUD;
import condominio.model.Utente;

/**
 * Servlet implementation class MyServlet
 
// @WebServlet ("/MyServlet")
*/


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UtenteCRUD uc = new UtenteCRUD();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String signin = request.getParameter("do");
		String view = "";
		String err = "";
		if (signin.equals("login")){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Utente u = new Utente ();
			u.setUsername(username);
			u.setPassword(password);
			uc.findlogin(u);
			
			
			
			
			
		}
	}

}
