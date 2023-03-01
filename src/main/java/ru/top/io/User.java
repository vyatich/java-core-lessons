package ru.top.io;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -5535492477842437924L;

    private Long id;
    private String name;
    private transient String password;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        String sb = "User{" + "id=" + id +
                ", name='" + name + '\'' +
                '}';
        return sb;
    }
}
