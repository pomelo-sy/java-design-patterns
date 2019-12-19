package org.pomelo.sunyong.testSynchorizedonMethod;

public class GetThread implements Runnable{

    private TestSyn testSyn;

    public GetThread(TestSyn testSyn){
        this.testSyn = testSyn;
    }


    @Override
    public void run() {

        try {

//            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+"---------run get count: "+testSyn.get());

        } catch (Exception e) {
            e.printStackTrace();
        }
        testSyn.setCount();
    }
}
