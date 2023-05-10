package org.when.demo.jpa.order;

import org.when.demo.jpa.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer_order")
public class Order extends BaseEntity {
    @Column(name = "status")
    private OrderStatus status;
    @Column(name = "description")
    private String description;

    public Order() {
    }

    public Order(String description, OrderStatus status) {
        this.description = description;
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", description='" + description + '\'' +
                '}';
    }
}
