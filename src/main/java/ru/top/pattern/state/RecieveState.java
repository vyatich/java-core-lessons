package ru.top.pattern.state;

public class RecieveState implements State {

    @Override
    public void previous(Package pack) {
        pack.setState(new ShippingState());
    }

    @Override
    public void next(Package pack) {
        System.out.println("Haven't next state");
    }

    @Override
    public void current() {
        System.out.println("Package is received");
    }
}
