package ru.top.oop.example;

public class MainContext {

    private String text;
    private String comment;

    private void generateMainContext() {
        this.text = "dfsdfsdf";
        this.comment = "no comment";
    }

    public String getText() {
        return text;
    }

    public String getComment() {
        return comment;
    }
}
