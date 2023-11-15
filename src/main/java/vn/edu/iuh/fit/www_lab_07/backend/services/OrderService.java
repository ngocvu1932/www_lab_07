package vn.edu.iuh.fit.www_lab_07.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_07.backend.models.Order;
import vn.edu.iuh.fit.www_lab_07.backend.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void saveProduct (Order order) {
        orderRepository.save(order);
    }

    public Optional<Order> findOrder(Long id) {
        return orderRepository.findById(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

}
