abstract class Appliance{
    abstract void start();
}
interface RemoteControl{
    void controlRemotely();
}
class SmartWashingMachine extends Appliance implements RemoteControl{
    public void start(){
        System.out.println("Smart Washing Machine started ");
    }
    public void controlRemotely(){
    System.out.println("Smart Washing Machine is controlled with a remote");}

}
public class Task5 {
    public static void main(String[] args){
        SmartWashingMachine w = new SmartWashingMachine();
        w.start();
        w.controlRemotely();
    }
}
