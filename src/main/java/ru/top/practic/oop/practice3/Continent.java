package ru.top.practic.oop.practice3;

public enum Continent {

    AUSTRALIA("Австралия"),
    NORTH_AMERICA("Северная Америка"),

    SOUTH_AMERICA("Южная Америка"),
    AFRICA("Африка"),
    EURASIA("Евразия"),
    ANTARCTIC("Антарктида");

    private final String rusDescription;

    Continent(String rusDescription) {
        this.rusDescription = rusDescription;
    }

    public static Continent getByRusDescription(String rusDescription) {
        Continent[] values = Continent.values();
        for (Continent value : values) {
            if (value.getRusDescription().equals(rusDescription)) {
                return value;
            }
        }
        return null;
    }

    public String getRusDescription() {
        return rusDescription;
    }
}
