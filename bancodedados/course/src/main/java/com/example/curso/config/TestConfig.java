package com.example.curso.config;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.curso.entities.Category;
import com.example.curso.entities.Order;
import com.example.curso.entities.User;
import com.example.curso.entities.enums.OrderStatus;
import com.example.curso.repositories.CategoryRepository;
import com.example.curso.repositories.OrderRepository;
import com.example.curso.repositories.UserRepository;

import ch.qos.logback.core.util.Duration;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "988888888", "123456");
		User u2 = new User(null, "Alex Green",  "977777777", "123456");
		
	 	Order o1 = new Order(null, Instant.now(), u1, OrderStatus.DELIVERED);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.PAID);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.WAITING_PAYMENT);
		
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		
		
		
		LocalDate iInicial = LocalDate.now();
		LocalDate localDateAntigo = LocalDate.of(2019, 12, 12);
		Period periodo = Period.between(localDateAntigo, iInicial);
		System.out.println(periodo);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	 

}
