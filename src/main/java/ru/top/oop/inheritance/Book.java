package ru.top.oop.inheritance;

import java.util.Objects;

public class Book {

    //инкапсуляция - public, protected, package-private, private
    //наследование - создание классов на базе существующих
    //полиморфизм - за счет перегрузки и переопределеняи методов
    //абстракция - выделенеи основных свойств
    protected String author;
    protected String title;
    protected Integer pageCount;

    public Book(String author, String title, Integer pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public Book() {
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                Objects.equals(pageCount, book.pageCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pageCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("author='").append(author).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", pageCount=").append(pageCount);
        sb.append('}');
        return sb.toString();
    }
}
