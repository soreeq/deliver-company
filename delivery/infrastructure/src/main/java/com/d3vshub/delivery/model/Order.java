package com.d3vshub.delivery.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Order {
    private int order_id;
    private int customer_id;
    private Date sqlDateField;

    private BigDecimal decimalField;
    private String status;
    private int courier_id;
    private int delivery_id;

    public BigDecimal getDecimalField() {
        return decimalField;
    }

    public void setDecimalField(BigDecimal decimalField) {
        this.decimalField = decimalField;
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

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getSqlDateField() {
        return sqlDateField;
    }

    public void setSqlDateField(Date sqlDateField) {
        this.sqlDateField = sqlDateField;
    }
}
