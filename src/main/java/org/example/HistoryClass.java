package org.example;

import java.util.Stack;

public class HistoryClass {

    private final Stack<MementoClass> history = new Stack<>();

    public void saveHistory(String state) {
        history.push(new MementoClass(state));
    }

    public void deleteHistory() {
        history.clear();
    }

    public int getHistorySize() {
        return history.size();
    }

    public MementoClass undo() {
        if(!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
