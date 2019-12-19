package org.pomelo.sunyong.testSynchorizedonMethod;

public class PrintThread implements Runnable{

    private TestSyn testSyn;

    public PrintThread(TestSyn testSyn){
        this.testSyn = testSyn;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);

            testSyn.print();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
