package org.pomelo.sunyong.fruitworld;

public class Semaphore implements Lock{

    private int count;

    private int license;

    public Semaphore(int num){

        this.count = num;
        this.license = num;

    }

    @Override
    public synchronized void release() {

        if(count<license){
            count ++;
        }
        notify();
    }

    @Override
    public synchronized void acquire() throws InterruptedException {

        while(count == 0){
            wait();
        }
        count --;
    }
}
