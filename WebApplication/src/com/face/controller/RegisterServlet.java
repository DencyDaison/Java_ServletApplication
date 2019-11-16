package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegistrationDAO;
import com.face.util.ConnectionManager;

/**
 * @author Dency
 * Action Servlet implementation class to perfoem user Registration
 * Date -14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec -> action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String mobno=request.getParameter("mobno");
		String uname=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		
		RegisterBO regbo=new RegisterBO();
		
		regbo.setName(name);
		regbo.setAddress(address);
		regbo.setEmail(email);
		regbo.setMobno(mobno);
		regbo.setUname(uname);
		regbo.setPswd(pswd);
		
		
		
		ConnectionManager con=new ConnectionManager();
		try {
		  RegistrationDAO.save(con.getConnection(),regbo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		response.sendRedirect(request.getContextPath()+"/login.jsp");
		
		
		
	}

}
