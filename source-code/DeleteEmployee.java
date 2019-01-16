/**
* Class to delete an Employee from employee table of a MySQL database.
*
* @author Kashif Ahmed
*/

import org.hibernate.Session;

public class DeleteEmployee {
	public static void deleteEmp(int id) {
		
		//Get session object
		Session sesh = GetSessionObj.getCurrentSessionObject();
		
		//Begin transaction
		sesh.beginTransaction();
		
		//Delete based on ID
		Employee empToDelete = sesh.get(Employee.class, id);
		sesh.delete(empToDelete);
		
		//Commit transaction
		sesh.getTransaction().commit();
		System.out.println("Done!");
		
		//Close session
		sesh.close();
	}
	
}
