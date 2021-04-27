package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EntranceController
 */
@WebServlet("/enter") // This is the URL of the servlet.

public class EntranceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

    public EntranceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String url="Inscription.jsp";
		
		if(request.getParameter("link").equals("seConnecter"))
		{
			url="Connection.jsp";
		//out.print("heeey you there , you are connecting ");
		}
		
		
			//out.print("heeey you there , you are registring ");
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
