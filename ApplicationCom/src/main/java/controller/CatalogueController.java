package controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Article;
import model.Client;

/**
 * Servlet implementation class CatalogueController
 */
@WebServlet("/catalog")
public class CatalogueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	
    public CatalogueController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String categorie = request.getParameter("categorie");
		if(categorie==null) {
			categorie="jazz";
		}

		
		EntityManagerFactory entitymangerfactory = null;
		EntityManager entitymanager ;
		
	
		try {
			entitymangerfactory = Persistence.createEntityManagerFactory("commerce");
			System.out.println("------Entity Manager Factory Created-----");
			entitymanager = entitymangerfactory.createEntityManager();
			System.out.println("----------------");
			
			//Return the Client object where the given password and email
			String selection = "select a from article a where c.categorie=:categorie";
			entitymanager = entitymangerfactory.createEntityManager();
			Query query = entitymanager.createQuery(selection, Article.class);
			
			query.setParameter("categorie", categorie);
		
			
		
			
			
			List<Article> articles = (List<Article>)query.getResultList();
		          
			request.setAttribute("articles", articles);
			request.setAttribute("cat", categorie);
			}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		request.getRequestDispatcher("Catalogue.jsp").forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
