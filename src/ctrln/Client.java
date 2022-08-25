package ctrln;

import java.util.Objects;

public class Client extends Person {

    public Client(){}

    public Client(String cnp){//Apeleaza contructorul Person din clasa parinte Prson(sau cu vintul cheie "super")
        super (cnp);
    }
    public Client(String clientName,int clientId,String cnp){
        super(cnp);
        this.clientName = clientName;
        this.clientId = clientId;
    }
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