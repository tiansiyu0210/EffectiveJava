package Item19_Skeletal_Implementation.EX1;

public class WorkComputer extends ComputerService implements Computer{

    //using a different way to in HomeComputer.java
    private class AbstractComputerDelegator extends AbstractComputer{

        @Override
        public void use() {
            System.out.println("about to use a home computer");
            ComputerService.work();
            ComputerService.learn();
        }
    }

    AbstractComputerDelegator abstractComputerDelegator = new AbstractComputerDelegator();


    @Override
    public void powerOn() {
        abstractComputerDelegator.powerOn();
    }

    @Override
    public void use() {
        abstractComputerDelegator.use();
    }

    @Override
    public void turnOff() {
        abstractComputerDelegator.turnOff();
    }

    @Override
    public void process() {
        abstractComputerDelegator.process();
    }


}
