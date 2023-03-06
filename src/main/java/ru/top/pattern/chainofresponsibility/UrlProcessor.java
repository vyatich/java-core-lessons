package ru.top.pattern.chainofresponsibility;

public class UrlProcessor extends AbstractAuthProcessor {

    public UrlProcessor(AbstractAuthProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void doFilter(Request request) {
        if (request.getUrl().length() < 5) {
            throw new RuntimeException("Url length must be greater than 5 symbols");
        }
        if (nextProcessor != null) {
            nextProcessor.doFilter(request);
        }
    }
}
