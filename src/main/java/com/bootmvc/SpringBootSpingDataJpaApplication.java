package com.bootmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bootmvc.entities.ContactsMasterEntity;
import com.bootmvc.repositories.ContactsMasterRepo;

@SpringBootApplication
public class SpringBootSpingDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootSpingDataJpaApplication.class, args);

		ContactsMasterRepo bean = ctx.getBean(ContactsMasterRepo.class);
		System.out.println("Spring get bean class name is:::"+bean.getClass().getName());

		ContactsMasterEntity entity = new ContactsMasterEntity();
		entity.setContactId(444);
		entity.setContactName("Vinay");
		entity.setContactNumber(701349);
		
		System.out.println("Save entity details"+entity);

		bean.save(entity);
		ctx.close();
	}

}
