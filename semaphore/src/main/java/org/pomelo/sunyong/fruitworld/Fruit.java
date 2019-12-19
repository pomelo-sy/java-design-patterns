package org.pomelo.sunyong.fruitworld;

public class Fruit {

    public enum FruitType{
        APPLE,ORANGE,BANANA
    }

    private FruitType type;

    public Fruit(FruitType fruitType){
        this.type = fruitType;
    }

    public String toString(){
        return type.toString();
    }
}

