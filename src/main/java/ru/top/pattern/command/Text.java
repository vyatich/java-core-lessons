package ru.top.pattern.command;

public class Text {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String show() {
        return text;
    }

    public String modify() {
        text += text;
        return text;
    }
}
