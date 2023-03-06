package ru.top.pattern.state;

public class ShippingState implements State {

    @Override
    public void previous(Package pack) {
        pack.setState(new OrderedState());
    }

    @Override
    public void next(Package pack) {
        pack.setState(new RecieveState());
    }

    @Override
    public void current() {
        System.out.println("Package is shipping");
    }
}
