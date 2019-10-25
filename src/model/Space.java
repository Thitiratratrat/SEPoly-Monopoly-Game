package model;

public abstract class Space {
    protected int number;
    protected String name;
    protected String action;

    Space(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getAction() {
        return action;
    }
}
