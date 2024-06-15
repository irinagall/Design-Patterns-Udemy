package abstractfactory.pattern;

//the client doesn't know about : NOT ONLY the implementation details for the service but also the factory that it uses

class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client(new DatabaseFactory());
        client1.communicate();

        Client client2 = new Client(new NetworkFactory());
        client2.communicate();
    }

}