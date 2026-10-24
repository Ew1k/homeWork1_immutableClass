package org.example;

public class ImmutableClass {
    private final MachineName name;

    public ImmutableClass( MachineName name) {
        this.name = new MachineName(name.getModel(), name.getNumber());

    }
    public MachineName getName() {
        return new MachineName(name.getModel(), name.getNumber());
    }
}
