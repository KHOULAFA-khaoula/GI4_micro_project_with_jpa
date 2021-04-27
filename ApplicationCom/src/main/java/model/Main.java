package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
 
	public static void main(String[] args) {
	/*	EntityManagerFactory entitymangerfactory = null;
		EntityManager entitymanager = null;
		try {
			entitymangerfactory = Persistence.createEntityManagerFactory("GI4");
			System.out.println("je suis la");
			entitymanager = entitymangerfactory.createEntityManager();
			System.out.println("--Lectyre de tous les étudiants --------------");
			
			List<Client > clients = entitymanager.createQuery("from client",Client.class).getResultList();
		          
			for (Client client : clients) {
				System.out.println( client);
			}
		
			
			// insertion
			EntityTransaction trans = entitymanager.getTransaction();
			trans.begin();
			Client cli = new Client("kh@gmail.com", "Abla", "ablo", "Marrakech", 40000, "kech","01234", "hey1234");
			entitymanager.persist(cli);
			
			
			trans.commit();
		
			//update
		/*	 Student student1 = entitymanager.find(Student.class, 1);

			 entitymanager.getTransaction().begin();
			  student1.setNom("Joe ");
			  entitymanager.getTransaction().commit();
			  
			  */
			  //delete
			/*  Student student2 = entitymanager.find(Student.class, 1);
				 entitymanager.getTransaction().begin();
				  entitymanager.remove(student2);
				  entitymanager.getTransaction().commit();
			*/
	/*	}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		*/
		
	}
}
