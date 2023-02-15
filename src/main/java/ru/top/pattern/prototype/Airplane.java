package ru.top.pattern.prototype;

public class Airplane extends Protytype {

    @Override
    public Protytype clone() {
        Airplane phone = new Airplane();
        phone.setName(this.getName());
        phone.setDescription(this.getDescription());
        return phone;
    }
}
