package com.devsuperior.pedidos.services;

import com.devsuperior.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        int totalFrete;
        if (order.getBasic()< 100) {
            return totalFrete = 20;
        } else if (order.getBasic() < 200 && order.getBasic() > 100) {
            return totalFrete = 12;

        } else
            return totalFrete = 0;
    }
}
