package org.pomelo.observer;

public class App {
    public static void main(String[] args) {
        Service service = new Service();
        service.test(Service::getResponse);

    }
}
