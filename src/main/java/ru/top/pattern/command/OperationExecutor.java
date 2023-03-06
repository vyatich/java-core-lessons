package ru.top.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class OperationExecutor {

    private final List<TextOperation> textOperationList = new ArrayList<>();

    public String doOperation(TextOperation textOperation) {
        textOperationList.add(textOperation);
        return textOperation.doOperation();
    }
}
