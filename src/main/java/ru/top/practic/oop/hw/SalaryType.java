package ru.top.practic.oop.hw;

public enum SalaryType {

    BET("ставка"),
    HOUR("почасовая");

    private final String desc;

    SalaryType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public static SalaryType fromName(String name) {
        SalaryType[] values = SalaryType.values();
        for (SalaryType value : values) {
            if (value.name().equals(name)) {
                return value;
            }
        }
        return null;
    }
}
