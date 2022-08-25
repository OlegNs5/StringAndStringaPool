package ctrln;

import java.util.Objects;

public class Client {
    private String clientName;
    private int clientId;

    public String getClientName() {
        return this.clientName;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientId=" + clientId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && clientName.equals(client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientId);
    }
    protected void finalize() throws Throwable{
        System.out.println("Reciclarea memoriei pentru obieactul " + this);
    }
}