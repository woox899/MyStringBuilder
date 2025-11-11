package org.example;

public class MyStringBuilder {

    private StringBuilder stringBuilder;
    private HistoryClass historyClass;

    public MyStringBuilder(String str) {
        this.stringBuilder = new StringBuilder(str);
        this.historyClass = new HistoryClass();
        saveCurrentState();
    }
    
    public void saveCurrentState() {
        historyClass.saveHistory(stringBuilder.toString());
    }

    public MyStringBuilder append(String string) {
        saveCurrentState();
        stringBuilder.append(string);
        return this;
    }

    public void deleteHistory() {
        historyClass.deleteHistory();
    }

    public boolean undo() {
        MementoClass previousState = historyClass.undo();
        if (previousState != null) {
            stringBuilder.setLength(0);
            stringBuilder.append(previousState.getState());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
