package com.example.javaspringbootfullstack;

import com.example.javaspringbootfullstack.product.Product;
import com.example.javaspringbootfullstack.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.UUID;

@SpringBootApplication
public class JavaSpringbootFullStackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringbootFullStackApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            ProductRepository productRepository) {
        return args -> {
            Product product1 = new Product();
            product1.setName("Macbook Pro");
            product1.setDescription("Macbook Pro M4");
            product1.setPrice(new BigDecimal(3000));
            product1.setId(UUID.fromString(
                    "d95062e6-9f0b-4224-bc9d-d0723949848f")
            );
            product1.setStockLevel(100);
            productRepository.save(product1);

            Product product2 = new Product();
            product2.setId(UUID.fromString(
                    "94d2cc8a-ad09-4902-a321-a6bf658e2463"
            ));
            product2.setName("Mouse");
            product2.setDescription("LG Mouse");
            product2.setPrice(new BigDecimal(78));
            product2.setStockLevel(1000);

            productRepository.save(product2);
        };
    }
}
