package org.example;

public class MachineName {
    private String model;
    private String number;

    public MachineName(String model, String number) {
        this.model = model;
        this.number = number;

    }

    public String getModel() {
        return model;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
