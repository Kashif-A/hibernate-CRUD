import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSessionObj {
	public static Session getCurrentSessionObject() {
		//Create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		//Create session
		Session session = factory.getCurrentSession();
		
		//Return session object
		return session;
	}
}
