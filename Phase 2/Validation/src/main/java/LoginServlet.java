

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
         
        
        if(user.equals("admin")&& pwd.equals("admin123") ) {
        	//HttpSession session=request.getSession(); 
        	//session.setAttribute("userid",user);
        	pw.println("Login Successfull");
        	response.setContentType("text/html");
        	RequestDispatcher rd=request.getRequestDispatcher("dashboard.html");
        	rd.include(request, response);
        	
        }else {
        	pw.print("Invalid Credentials");
        	response.setContentType("text/html");
        	RequestDispatcher rd=request.getRequestDispatcher("index.html");
        	rd.include(request, response);
        }
                 
	}

}
