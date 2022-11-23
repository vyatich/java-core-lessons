package ru.top.practic.oop.practice2;

public class Town {
//    Необходимо хранить в полях класса: название города, название региона, название
//    //страны, количество жителей в городе, почтовый индекс
    private final String name;
    private final String regionName;
    private final String countryName;
    private Long population;
    private Integer index;

    public Town(String name, String regionName, String countryName) {
        this.name = name;
        this.regionName = regionName;
        this.countryName = countryName;
    }

    public Town(String name, String regionName, String countryName, Long population, Integer index) {
        this.name = name;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
