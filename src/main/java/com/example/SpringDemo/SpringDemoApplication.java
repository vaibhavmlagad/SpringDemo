package com.example.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDemoApplication.class, args);

		BulbService bulbService = ctx.getBean(BulbService.class);
		System.out.println(bulbService.askBulb());
		// System.out.println(ctx.getBean(LgBulb.class));
		// System.out.println(ctx.getBean(SuryaBulb.class));
		// System.out.println(ctx.getBean(SuryaBulb.class));
		// System.out.println(ctx.getBean(BulbService.class));
	}

}
