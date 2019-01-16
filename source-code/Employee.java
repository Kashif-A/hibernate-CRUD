import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is the Employee class used for object relational mapping 
 * with hibernate to help perform CRUD operations to the Employee table
 * of hbstudent database.
 * @author Kashif Ahmed
 *
 */


@Entity
@Table(name="employee")
public class Employee {
	
	public Employee() {};
	
	//Private variables with annotations to link them to database
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="company")
	private String company;
	
	//Getters & Setter methods
	public String getfirst_name() {
		return first_name;
	}
	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "\nEmployee"
				+ "\nFirst Name = " + first_name
				+ "\nLast Name = " + last_name
				+ "\nCompany = " + company;
	}
	
	//Constructors
	public Employee(String first_name, String last_name, String company) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.company = company;
	}	
	
	public Employee(int id, String first_name, String last_name, String company) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.company = company;
	}	
	
}
