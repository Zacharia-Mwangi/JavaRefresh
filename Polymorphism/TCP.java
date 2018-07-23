package Polymorphism;

public class TCP extends Connection {
    @Override
    public void connect(){
        System.out.println("Connection reliably but slow ...");
    }
}
