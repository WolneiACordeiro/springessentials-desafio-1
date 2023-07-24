package com.desafio01.desafio.service;

import com.desafio01.desafio.enitites.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        order.setBasic(order.getBasic() - ((order.getBasic() * order.getDiscount()) / 100));
        var total = shippingService.Shipment(order);
        return total;
    }

}
