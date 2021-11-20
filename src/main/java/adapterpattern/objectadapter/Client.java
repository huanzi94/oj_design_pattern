package adapterpattern.objectadapter;

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone(new PhonePharger());
        phone.chargeWith5V();
    }
}
