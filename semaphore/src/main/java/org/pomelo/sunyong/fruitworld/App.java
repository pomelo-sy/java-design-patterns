package org.pomelo.sunyong.fruitworld;

import java.util.UUID;

public class App {
    public static void main(String[] args) {

        FruitShop fs = new FruitShop();

        new Thread(new Customer("人猿泰山", fs), "人猿泰山-t1").start();
        new Thread(new Customer("刘姥姥", fs), "刘姥姥-t2").start();
        new Thread(new Customer("李老师", fs), "李老师-t3").start();
        new Thread(new Customer("张老师", fs), "张老师-t4").start();
        new Thread(new Customer("金灿荣", fs), "金灿荣-t5").start();
        new Thread(new Customer("金一男", fs), "金一男-t6").start();




    }
}
