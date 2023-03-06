package ru.top.pattern.chainofresponsibility;

public class Request {

    private String url;
    private String userLogin;

    public Request(String url, String userLogin) {
        this.url = url;
        this.userLogin = userLogin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}
