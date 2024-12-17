package com.example.springboot_grapql;

// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.example.springboot_grapql.entity.Product;
// import com.example.springboot_grapql.repository.ProductRepository;

// import jakarta.annotation.PostConstruct;
@SpringBootApplication
public class SpringbootGrapqlApplication {

	// @Autowired
	// private ProductRepository productRepository;
	// @PostConstruct
	// public void initDB(){
	// 	List<Product> products = Stream.of(
	// 		new Product("Laptop", "Electronics", 89.99f, 123),
	// 		new Product("Mouse", "Electronics", 9.99f, 23),
	// 		new Product("Keyboard", "Electronics", 19.99f, 34),
	// 		new Product("Monitor", "Electronics", 199.99f, 45),
	// 		new Product("T-Shirt", "Fashion", 9.99f, 23),
	// 		new Product("Dress", "Fashion", 49.99f, 23)
	// 	).collect(Collectors.toList());

	// 	productRepository.saveAll(products);
	// }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGrapqlApplication.class, args);
	}

}
