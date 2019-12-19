package org.pomelo.command;

public enum Size {

    SMALL("small") , NORMAL("normal"), BIG("big");

    private String value;

    Size(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
