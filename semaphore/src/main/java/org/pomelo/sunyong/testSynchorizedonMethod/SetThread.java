package org.pomelo.sunyong.testSynchorizedonMethod;

public class SetThread implements Runnable {

    private TestSyn testSyn;

    public SetThread(TestSyn testSyn){
        this.testSyn = testSyn;
    }

    @Override
    public void run() {

        try {
//            Thread.sleep(6000);

            System.out.println(Thread.currentThread().getName()+"--------------------setCount start");
            testSyn.setCount();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
