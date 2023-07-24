package com.desafio01.desafio.service;

import com.desafio01.desafio.enitites.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public static Double total(Order order) {
        order.setBasic(order.getBasic() - ((order.getBasic() * order.getDiscount()) / 100));
        var total = ShippingService.Shipment(order);
        return total;
    }

}
