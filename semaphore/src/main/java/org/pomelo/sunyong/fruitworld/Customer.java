package org.pomelo.sunyong.fruitworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer implements Runnable{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private FruitShop fruitShop;

    private String name;

    private String getName(){
        return name;
    }

    public Customer (String name, FruitShop shop){
        this.name = name;
        this.fruitShop = shop;
    }

    public FruitBowl getFruitBowl() {
        return fruitShop.getBowl();
    }


    @Override
    public void run() {

        while (fruitShop.countFruit() >0){

            FruitBowl bowl = getFruitBowl();
            Fruit fruit = bowl.get();
            if(fruit != null){
                logger.info(getName() + "took fruit : " + fruit.toString());
            }
            fruitShop.releaseBowl(bowl);
        }
    }
}
