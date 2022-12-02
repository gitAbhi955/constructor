package com.hospitalRegistration.cotroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hospitalapp.model.HospitalServiceImp;
import com.hospitalapp.model.hospitalService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		
		hospitalService service=new HospitalServiceImp();
		service.connectDB();
		boolean vr = service.verifyLogin(email, password);
		
		if(vr==true)
		{
			//request.setAttribute("msg", "LOgin Success");
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/create_registration.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "Invalid username/password");
			//request.setAttribute("msg", "LOgin Success");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}

}
