package ru.top.pattern.decorator;

public class TreeDecorator extends Decorator {

    public TreeDecorator(Decoratable decoratable) {
        super(decoratable);
    }

    @Override
    public String decorate() {
        return super.decorate() + getTree();
    }

    private String getTree() {
        return " and add Tree";
    }
}
