package ru.top.practic.oop.practice5;

public abstract class Device {

    protected final String name;
    protected Long price;

    public Device(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public abstract void sound();
    public abstract void show();
    public abstract void desc();

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Device{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
