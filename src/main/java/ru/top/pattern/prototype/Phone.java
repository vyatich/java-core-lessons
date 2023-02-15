package ru.top.pattern.prototype;

import java.math.BigDecimal;

public class Phone extends Protytype implements Cloneable {

    private BigDecimal price;
    private String model;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Protytype clonePrototype() {
        Phone phone = new Phone();
        phone.setName(this.getName());
        phone.setModel(this.getModel());
        phone.setDescription(this.getDescription());
        phone.setPrice(this.getPrice());
        return phone;
    }

    @Override
    public String toString() {
        String sb = "Phone{" + "price=" + price +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
        return sb;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
