package com.d3vshub.delivery.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name="Orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private int id;
    private int customer_id;
    private Date order_date;

    private BigDecimal total;
    private String status;
    private int courier_id;
    private int delivery_id;

    public Order() {
    }

    public Order(int order_id, Customer customer, Date localDate, BigDecimal decimal, String status, Courier courier, Delivery delivery) {
        this.id = order_id;
        this.customer_id = customer.getId();
        this.order_date = localDate;
        this.total = decimal;
        this.status = status;
        this.courier_id = courier.getId();
        this.delivery_id = delivery.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCourier_id() {
        return courier_id;
    }

    public void setCourier_id(int courier_id) {
        this.courier_id = courier_id;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }
}
