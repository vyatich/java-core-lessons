package ru.top.practic.oop.practice1;

import java.util.Date;

//Задание 1
//К уже реализованному классу «Человек» добавьте
//необходимые конструкторы, а также необходимые перегруженные методы
public class Human {
    //в полях класса: ФИО, дату рождения, контактный телефон, город, страну, домашний адрес.
    private String fio;
    private Date birthday;
    private String phone;
    private String town;
    private String country;
    private String address;

    public Human(String fio, Date birthday) {
        this.fio = fio;
        this.birthday = birthday;
    }

    public Human(String fio, Date birthday, String phone, String town, String country, String address) {
        this.fio = fio;
        this.birthday = birthday;
        this.phone = phone;
        this.town = town;
        this.country = country;
        this.address = address;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
