package Polymorphism;

public class UDP extends Connection {

    @Override
    public void connect(){
        System.out.println("Connecting fast but no guarantee of delivery");
    }
}
