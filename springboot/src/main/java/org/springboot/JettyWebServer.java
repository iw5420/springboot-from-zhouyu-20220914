package org.springboot;

public class JettyWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("啟動Jetty");
    }
}
