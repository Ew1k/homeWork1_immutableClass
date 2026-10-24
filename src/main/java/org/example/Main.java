
package org.example;

public class Main {
    public static void main(String[] args) {
        MachineName name = new MachineName("Tesla", "x123sd");
        ImmutableClass immutable = new ImmutableClass(name);

        name.setModel("Volga");

        System.out.println(immutable.getName().getModel());

        MachineName copy = immutable.getName();

        copy.setNumber("q321qwe");

        System.out.println(immutable.getName().getNumber());
        System.out.println(name.getModel());
        System.out.println(name.getNumber());
    }
}
