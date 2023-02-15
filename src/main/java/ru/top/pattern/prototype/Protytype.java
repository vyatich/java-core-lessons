package ru.top.pattern.prototype;

public abstract class Protytype {

    protected String name;
    protected String description;

    public abstract Protytype clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String sb = "Protytype{" + "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
        return sb;
    }
}
