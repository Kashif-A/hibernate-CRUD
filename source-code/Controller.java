/**
 * This app uses hibernate CRUD opations to create, read,
 * update and delete Employee objects that are mapped to
 * an employee table.
 * @author Kashif Ahmed
 */
public class Controller {

	public static void main(String[] args) {
		//CREATE
		CreateEmployee.createEmployee(new Employee("Kashif","Ahmed","DEV"));
		
		//READ - change ID to read specific employee
		//Currently reading employee with ID of 2
		ReadEmployee.readEmployee(2); 
		
		//DELETE - change ID to delete specific employee
		//Currently deleting employee with ID of 5
		DeleteEmployee.deleteEmp(7);
		
		//SQL Query
		//UPDATE (dependent on query).
		RunQuery.runQuery();
	}

}
