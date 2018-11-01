package com.wbg.swager.entitys;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

public class Order {

    @NotBlank
    @Max(11)
    @Min(5)
    private String orderId;

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", product=" + product +
                '}';
    }

    @NotBlank
    private String customer;

    @Email
    private String email;

   @Pattern(regexp = "^[0-9]{11}$")
    private String telephone;

   @NotBlank
    private String address;

    @Pattern(regexp = "(create|paid|shipped|closed)")
    private String status;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past
    private Date createDate;

    @NotNull
    @Valid
    private Product product;

    public Order(String orderId, String customer, String email, String telephone, String address, String status, Date createDate, Product product) {
        this.orderId = orderId;
        this.customer = customer;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.status = status;
       this.createDate = createDate;
        this.product = product;
    }

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

  public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
