package org.example.abs_classes;

public abstract class Payment {

    int amount;
    String from;
    String to;

    void printFrom(){
        System.out.println(from);
    }

    public Payment(int amount, String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }
}

class UpiPayment extends Payment{
    String upiId;
    public UpiPayment(String from, String to, int amount, String upiId){
        super(amount, from, to);
        this.upiId = upiId;
    }
}

class NetbankingPayment extends Payment{
    public NetbankingPayment(int amount, String from, String to) {
        super(amount, from, to);
    }
}
