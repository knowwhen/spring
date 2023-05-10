package org.when.demo.jpa.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.when.demo.jpa.employee.Employee;
import org.when.demo.jpa.employee.EmployeeRepository;
import org.when.demo.jpa.order.Order;
import org.when.demo.jpa.order.OrderRepository;
import org.when.demo.jpa.order.OrderStatus;

@Slf4j
@Configuration
public class LoadData {
    @Bean
    public CommandLineRunner initData(EmployeeRepository repository, OrderRepository orderRepository) {
        return args -> {
            Employee employee;
            for (int i = 0; i < 5; i++) {
                employee = new Employee("Employee" + i, "Role" + i);
                log.info("Preloading " + repository.save(employee));
            }

            orderRepository.save(new Order("MacBook Pro", OrderStatus.COMPLETED));
            orderRepository.save(new Order("iPhone", OrderStatus.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });

        };
    }
}
