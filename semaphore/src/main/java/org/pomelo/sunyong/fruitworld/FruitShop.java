package org.pomelo.sunyong.fruitworld;

public class FruitShop {

    private FruitBowl[] bowls = new FruitBowl[]{
            new FruitBowl(),
            new FruitBowl(),
            new FruitBowl()
    };

    private Semaphore semaphore;

    private Boolean flag[] = new Boolean[]{
            Boolean.TRUE, Boolean.TRUE, Boolean.TRUE
    };

    public FruitShop(){

        for(int i = 0;i < 100; i ++){
            bowls[0].put(new Fruit(Fruit.FruitType.APPLE));
            bowls[1].put(new Fruit(Fruit.FruitType.ORANGE));
            bowls[2].put(new Fruit(Fruit.FruitType.BANANA));
        }

        semaphore = new Semaphore(3);

    }

    public synchronized int countFruit(){
        return bowls[0].size() + bowls[1].size() + bowls[2].size();
    }

    public synchronized FruitBowl getBowl(){

        FruitBowl bowl = null;


        try {

            semaphore.acquire();

            if (flag[0]){
                flag[0] = false;
                bowl = bowls[0];
            }else if(flag[1]){
                flag[1] = false;
                bowl = bowls[1];
            }else if(flag[2]){
                flag[2] = false;
                bowl = bowls[2];
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return bowl;
    }

    public synchronized void releaseBowl(FruitBowl bowl){

        for(int i = 0; i<3; i++){
            if (bowl == bowls[i]){
                flag[i] = true;
            }
        }

    }
}


