package ru.top.pattern.command;

public class Main {

    public static void main(String[] args) {
        OperationExecutor operationExecutor = new OperationExecutor();
        System.out.println(operationExecutor.doOperation(() -> new Text("Java Virtual Machine").show()));
        System.out.println(operationExecutor.doOperation(() -> new Text("Write one run anywhere").modify()));
    }
}
