package org.pomelo.sunyong.fruitworld;

import java.util.ArrayList;
import java.util.List;

public class FruitBowl {

    private List<Fruit> fruits;

    public FruitBowl(){
        fruits = new ArrayList<Fruit>();
    }

    public void put(Fruit fruit){

        fruits.add(fruit);
    }

    public Fruit get(){
        if (size() >0){
            return fruits.remove(0);
        }
        return null;
    }

    public int size(){
        return fruits.size();
    }
}
