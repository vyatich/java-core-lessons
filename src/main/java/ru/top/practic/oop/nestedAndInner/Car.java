package ru.top.practic.oop.nestedAndInner;

public class Car {

    private static Integer speed;
    private Rule rule;

    public Car(Rule rule) {
        this.rule = rule;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public static class Rule {

        private final String msg;

        Rule(String msg) {
            this.msg = msg;
        }

        public void printMsg() {
            System.out.println(msg);
        }

        public static void printSpeed()  {
            System.out.println(speed);
        }
    }
}
