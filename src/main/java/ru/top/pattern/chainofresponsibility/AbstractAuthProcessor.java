package ru.top.pattern.chainofresponsibility;

public abstract class AbstractAuthProcessor {

    protected AbstractAuthProcessor nextProcessor;

    public AbstractAuthProcessor(AbstractAuthProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void doFilter(Request request);
}
