/**
 * This class allows a custom SQL query to be executed in a MySQL database.
 * Currently, it is running the query: "from Employee s where company='UTIL'".
 *
 * @author Kashif Ahmed
 */

import java.util.List;
import org.hibernate.Session;

public class RunQuery {
	
	public static void runQuery() {
		//Get session object
		Session sesh = GetSessionObj.getCurrentSessionObject();
		
		//Begin transaction
		sesh.beginTransaction();
		
		//Run query and capture Employee object
		System.out.println("\"from Employee s where company='UTIL'\"");
		List<Employee> empList = sesh.createQuery("from Employee s where company='UTIL'").getResultList();
		
		for (Employee e : empList) {
			System.out.println(e.toString());
		}
		//Print Employee results
		
		//Close session
		sesh.close();
	}
}
