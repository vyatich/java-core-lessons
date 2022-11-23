package ru.top.practic.oop.practice3;

public class Country {

//    Необходимо хранить
////в полях класса: название страны, название континента, количество жителей в стране, телефонный код
////страны, название столицы, название городов страны.
    private String name;
    private Continent continent;
    private Long population;
    private String phoneCode;
    private String capitalName;
    private String[] townName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String[] getTownName() {
        return townName;
    }

    public void setTownName(String[] townName) {
        this.townName = townName;
    }
}
