package ru.top.pattern.state;

public class OrderedState implements State {

    @Override
    public void previous(Package pack) {
        System.out.println(pack + " have not previous states");
    }

    @Override
    public void next(Package pack) {
        pack.setState(new ShippingState());
    }

    @Override
    public void current() {
        System.out.println("In ordered state");
    }
}
