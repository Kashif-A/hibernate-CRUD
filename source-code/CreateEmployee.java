import org.hibernate.Session;

/**
 * This Class allows creation of Employee object which is
 * then mapped to the database. Database gets a new
 * Employee added to it.
 * @author Kashif Ahmed
 */
public class CreateEmployee {
		public static void createEmployee(Employee emp) {
		//Get current session
		Session session = GetSessionObj.getCurrentSessionObject();
	
		try {
			
			//Use session object to save object
			//Create object
			System.out.println("Creating and saving Employee");
			
			//Start transaction
			session.beginTransaction();
			
			//Save Employee object
			session.save(new Employee("David", "Foster", "KFL"));
			
			//Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Success! Mark was added to the database");
			
		} finally {
			session.close();
		}
	}
}