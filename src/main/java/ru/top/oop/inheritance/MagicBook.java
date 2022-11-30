package ru.top.oop.inheritance;

import java.util.Objects;

public class MagicBook extends Book {

    private String magicPhrase;

    public MagicBook(String author, String title, Integer pageCount, String magicPhrase) {
        super(author, title, pageCount);
        Objects.requireNonNull(author, "Author not be null");
        this.magicPhrase = magicPhrase;
    }

    public MagicBook() {
    }

    public String getMagicPhrase() {
        return super.title;
    }

    @Override
    public Integer getPageCount() {
        return pageCount * pageCount;
    }
}
