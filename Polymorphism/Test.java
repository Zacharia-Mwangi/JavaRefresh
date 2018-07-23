package Polymorphism;

public class Test {
    public static void main (String args []){
        Connection connection = new TCP();
        connection.connect();

        Connection udp = new UDP();
        udp.connect();
    }
}
