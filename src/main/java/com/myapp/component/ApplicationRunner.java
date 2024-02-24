package main.java.com.myapp.component;

public class ApplicationRunner {

    private final EntityRegister register = new EntityRegister();
    public void run() {
        if (Authenticator.auth()) {
            register.registerClients();
        }

    }


}
