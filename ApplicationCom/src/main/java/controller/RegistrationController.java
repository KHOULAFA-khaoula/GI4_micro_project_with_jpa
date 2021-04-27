package controller;

import java.io.IOException;
import java.io.PrintWriter;

import model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Servlet implementation class RegistrationController
 */

@WebServlet("/registration") // This is the URL of the servlet.

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 EntityManagerFactory entitymangerfactory = null;
		 EntityManager entitymanager ;
	     
				String email=request.getParameter("email");
				String nom=request.getParameter("nom");
				String prenom=request.getParameter("prenom");
				String adresse=request.getParameter("adresse");
				int code_postal=Integer.parseInt(request.getParameter("codepostal"));
				String ville=request.getParameter("ville");
				String tel=request.getParameter("tel");
				String motDePasse=request.getParameter("password");
				System.out.print("email = "+email+"nom ="+ nom +"prenom = " + prenom+"adresse "+adresse+"ville = " + ville+"tel = "+tel+"motDePasse = " +motDePasse);		
	try {
				entitymangerfactory = Persistence.createEntityManagerFactory("commerce");
				System.out.println("persistence link is build");
				entitymanager = entitymangerfactory.createEntityManager();
				System.out.println("------------------");
		    // insertion
				 EntityTransaction trans = entitymanager.getTransaction();
				trans.begin();
				
				Client client=new Client(email,nom,prenom,adresse,code_postal,ville,tel,motDePasse);
				entitymanager.persist(client);
				
				trans.commit();
				request.setAttribute("client", client);

	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("heeey");
		System.out.print("psst");*/
		
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
