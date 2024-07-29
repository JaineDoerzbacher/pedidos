package com.devsuperior.pedidos.services;

import com.devsuperior.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double netSalary(Order order) {
        double discount = (order.getBasic() * (order.getDiscount() / 100));

        return (order.getBasic() - discount ) + shippingService.shipment(order);
    }

}
