package com.wbg.swager.entitys;

import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Price;

public class Product {

    @NotEmpty
    private String name;

    @Price
    private Float price;

    public Product() {

    }

    public Product(String name, @Range(max = 100000, min = 10) Float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
