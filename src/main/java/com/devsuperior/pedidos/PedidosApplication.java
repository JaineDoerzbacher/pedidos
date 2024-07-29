package com.devsuperior.pedidos;

import com.devsuperior.pedidos.entities.Order;
import com.devsuperior.pedidos.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidosApplication implements CommandLineRunner {
    @Autowired
    private OrderService orderService;


    public static void main(String[] args) {


        SpringApplication.run(PedidosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00,20.0);
        System.out.println("Pedido código: " + order.getCode());
        System.out.println("Valor total: " + orderService.netSalary(order));

    }
}
