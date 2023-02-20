package ru.top.pattern.adapter;

public class Adapter implements AdapterInterface {

    private final SourceInterface sourceInterface;

    public Adapter(SourceInterface sourceInterface) {
        this.sourceInterface = sourceInterface;
    }

    @Override
    public boolean isGood(int radius) {
        int width = sourceInterface.getWidth();
        double diameter = Math.pow(Math.pow(width, 2) * 2, 0.5);

        return !(diameter / 2 > radius);
    }
}
