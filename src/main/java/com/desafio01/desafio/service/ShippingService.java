package com.desafio01.desafio.service;

import com.desafio01.desafio.enitites.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public static Double Shipment(Order order){
        if (order.getBasic() < 100.00){
            order.setBasic(order.getBasic()+20.00);
        } else if ((order.getBasic() >= 100.00) && (order.getBasic() <= 200.00)) {
            order.setBasic(order.getBasic()+12.00);
        } return order.getBasic();
    }
}
