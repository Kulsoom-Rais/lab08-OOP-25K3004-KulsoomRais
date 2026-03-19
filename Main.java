interface Payment{
     void processPayment();
}
class CreditCard implements Payment{
    public void processPayment(){
        System.out.println("credit card is used");
    }
}
class PayPal implements Payment{
    public void processPayment(){
        System.out.println("pay pal is used");
    }
}
class BankTransfer implements Payment{
    public void processPayment(){
        System.out.println("bank transfer is used");
    }
}

public class Main {
    public static void main(String[] args){
        Payment c = new CreditCard();
        Payment p = new PayPal();
        Payment b = new BankTransfer();
        c.processPayment();
        p.processPayment();
        b.processPayment();
    }
}
