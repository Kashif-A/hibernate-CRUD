/**
 * This class allows the retrieval of an Employee from
 * the employee table using MySQL database.
 *
 * @author Kashif Ahmed
 */

import org.hibernate.Session;

public class ReadEmployee {
	
	public static void readEmployee(int id) {
		
		//Get Session object
		Session sesh = GetSessionObj.getCurrentSessionObject();
		
		//Begin transaction
		sesh.beginTransaction();
		
		//Get Employee
		Employee emp = sesh.get(Employee.class, id);
		
		//Print information on Employee
		System.out.println(emp.toString());
		
		//Complete
		sesh.close();
	}
}
