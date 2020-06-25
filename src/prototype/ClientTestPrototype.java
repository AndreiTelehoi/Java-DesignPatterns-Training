package prototype;

public class ClientTestPrototype {

    public static void main(String[] args) {

        InterfataPrototypeClient client1 = new Client("Andrei Telehoi", 100);
        InterfataPrototypeClient client2 = client1.clonare();

        System.out.println(client1);
        System.out.println(client2);

    }
}
