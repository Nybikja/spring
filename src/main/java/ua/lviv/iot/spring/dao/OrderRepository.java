package ua.lviv.iot.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
