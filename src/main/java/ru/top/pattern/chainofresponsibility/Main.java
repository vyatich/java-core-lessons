package ru.top.pattern.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        BasicAuthProcessor basicAuthProcessor = new BasicAuthProcessor(null);
        AbstractAuthProcessor authProcessor = new UrlProcessor(basicAuthProcessor);

        Request request = new Request("123456", "null");
        authProcessor.doFilter(request);
    }
}
