package ru.top.pattern.chainofresponsibility;

public class BasicAuthProcessor extends AbstractAuthProcessor {

    public BasicAuthProcessor(AbstractAuthProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void doFilter(Request request) {
        if (request.getUserLogin() == null) {
            throw new RuntimeException("User login is null");
        }
        if (nextProcessor != null) {
            nextProcessor.doFilter(request);
        }
    }
}
