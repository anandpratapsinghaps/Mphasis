package com.example.proxy;

//proxy
import java.util.Arrays;
import java.util.List;

class InternetProxy implements Internet {

    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites =
            Arrays.asList("facebook.com", "instagram.com");

    public void connectTo(String site) {
        if (bannedSites.contains(site)) {
            System.out.println("ACCESS DENIED: " + site);
        } else {
            realInternet.connectTo(site);
        }
    }
}
