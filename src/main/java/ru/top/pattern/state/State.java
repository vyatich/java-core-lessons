package ru.top.pattern.state;

public interface State {

    void previous(Package pack);

    void next(Package pack);

    void current();
}
