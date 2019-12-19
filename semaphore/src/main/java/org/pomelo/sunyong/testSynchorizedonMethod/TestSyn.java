package org.pomelo.sunyong.testSynchorizedonMethod;

/**
 * 验证 当一个类中不同方法加上synchronized修饰时候 会将锁加在一个共有的位置上 形成同步 同时只能进一个synchronized修饰的方法中
 * 通过延时执行， 没有修饰的情况下会准时执行 而当有修饰时候 则会等到前一个sync释放了才会进入执行（前一个线程加了断点）
 *
 */
public class TestSyn {

    private int count = 7;


    synchronized int get(){
        return count;
    }

    synchronized void setCount(){
        count++;
    }

    void print(){

//        synchronized (this){
            System.out.println("print......................");
//        }


    }

    public static void main(String[] args) {

        TestSyn t1 = new TestSyn();
        new Thread(new PrintThread(t1),"thread----printThread").start();
        new Thread(new GetThread(t1),"thread----getThread").start();
        new Thread(new SetThread(t1),"thread----setThread").start();

    }

}
