package com.d3vshub.delivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    private int customer_id;
    private String first_name;
    private String last_name;
    private String email;

    public Customer() {
    }

    public Customer(int i, String name, String secondname, String email) {
        this.customer_id = i;
        this.first_name = name;
        this.last_name = secondname;
        this.email = email;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
