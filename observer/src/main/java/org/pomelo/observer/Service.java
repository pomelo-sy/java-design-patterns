package org.pomelo.observer;

public class Service {

    public static ResponseResult getResponse(Object object){
        return new ResponseResult();
    }

    public void test(function1 f){
        System.out.println("11111111111");
        f.call(1);
        System.out.println("22222222222");
    }


//    public static Object getResponse(Object o) {
//        System.out.println("1121");
//        return new Object();
//    }
}
