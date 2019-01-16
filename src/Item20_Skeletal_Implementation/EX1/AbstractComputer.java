package Item20_Skeletal_Implementation.EX1;

public abstract class AbstractComputer implements Computer {

    @Override
    public void powerOn(){
        System.out.println("power on this computer");
    }

    @Override
    public void turnOff(){
        System.out.println("turn off this computer");
    }

    @Override
    public void process(){
        powerOn();
        use();
        turnOff();
    }

}
