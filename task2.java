interface SmartDevice{
    void turnOn();
    void turnOff();
}
class SmartLight implements SmartDevice{
    public void turnOn(){
        System.out.println("Light is ON");
    }
    public void turnOff(){
        System.out.println("Light is OFF");
    }
}
class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("Fan is ON");
    }
    public void turnOff(){
        System.out.println("Fan is OFF");
    }
}

public class task2 {
    public static void main(String[] args){
        SmartDevice l= new SmartLight();
        SmartDevice f = new SmartFan();
        l.turnOn();
        l.turnOff();
        f.turnOn();
        f.turnOff();
    }
}
