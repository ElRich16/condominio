package condominio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Exception.FieldError;
import condominio.crud.UtenteCRUD;
import condominio.model.Ruolo;
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
		
		Utente u = new Utente ();
		Ruolo r = new Ruolo();
		
		String signin = request.getParameter("do");
		String view = "";
		String err = "";
		if (signin.equals("login")){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			u.setUsername(username);
			u.setPassword(password);
			try {
				uc.findlogin(u);
				if(u.getId_ruolo()== 1);{
					r.setRuolo("admin");
				}
				if(u.getId_ruolo()==2);{
					r.setRuolo("user");
				}
				if(u.getRuolo().getRuolo().equals("admin")) {
					request.getSession().setAttribute("u", u);
					response.sendRedirect("homeadmin.jsp");
					return;
				}
					else {
						request.getSession().setAttribute("u", u);
						response.sendRedirect("home.jsp");
						return;
					}
				}
			 catch (FieldError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}
	}

}
