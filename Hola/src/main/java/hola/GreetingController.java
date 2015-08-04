package hola;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;


@Controller

public class GreetingController{
	
	@RequestMapping("/greeting")
	public String greeting() {
		//Configuration hiberconfiguration = new Configuration();  
        //hiberconfiguration.configure("hibernate.cfg.xml");  
		
        SessionFactory sessionFactory;

		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		
		
		Session session = sessionFactory.openSession();
		
		
		return "index";
	}
}