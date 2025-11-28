package com.example.proxy;
//real object
class RealInternet implements Internet {
    public void connectTo(String site) {
        System.out.println("Connecting to " + site);
    }
}
