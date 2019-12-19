package org.pomelo.sunyong.fruitworld;

public interface Lock {

    void release();

    void acquire() throws InterruptedException;
}
