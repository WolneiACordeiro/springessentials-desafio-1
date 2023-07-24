package com.desafio01.desafio;

import com.desafio01.desafio.enitites.Order;
import com.desafio01.desafio.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println("Código:"+ order1.getCode());
		System.out.println("R$:"+orderService.total(order1)+"\n");

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Código:"+ order2.getCode());
		System.out.println("R$:"+orderService.total(order2)+"\n");

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Código:"+ order3.getCode());
		System.out.println("R$:"+orderService.total(order3)+"\n");
	}
}
