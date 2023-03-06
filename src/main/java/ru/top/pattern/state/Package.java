package ru.top.pattern.state;

public class Package {

    private State state;

    public Package() {
        this.state = new OrderedState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void previousState() {
        state.previous(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void currentState() {
        state.current();
    }
}
