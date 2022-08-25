package ctrln;

public class PersonUsage {
    public static void main(String[] args) {
        Client newClient = new Client("1234567891234");
        newClient.setClientName("John");
        System.out.println(newClient);
        System.gc();
    }
}
