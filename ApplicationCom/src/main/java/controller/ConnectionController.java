package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 * Servlet implementation class ConnexionController
 */

@WebServlet("/connection") // This is the URL of the servlet.

public class ConnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnectionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManagerFactory entitymangerfactory = null;
		EntityManager entitymanager ;
		
	
		try {
			entitymangerfactory = Persistence.createEntityManagerFactory("commerce");
			System.out.println("------Entity Manager Factory Created-----");
			entitymanager = entitymangerfactory.createEntityManager();
			System.out.println("----------------");
			
			//Return the Client object where the given password and email
			String selection = "Select c from Client c where c.email=:mail and c.motDePasse =:password";
			entitymanager = entitymangerfactory.createEntityManager();
			Query query = entitymanager.createQuery(selection, Client.class);
			
			query.setParameter("password", request.getParameter("password"));
			query.setParameter("mail", request.getParameter("email"));
			
		
			
			
			Client client = (Client)query.getSingleResult();
		          
			request.setAttribute("client", client);
		}
			
			catch(Exception e) {
				e.printStackTrace();
				
			}
		request.getRequestDispatcher("Menu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
