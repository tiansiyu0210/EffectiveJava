package Item19_Skeletal_Implementation.EX1;

public class HomeComputer extends ComputerService implements Computer{

    //using a different way to in WorkComputer.java
    AbstractComputer abstractComputer = new AbstractComputer() {
        @Override
        public void use() {
            System.out.println("about to use a home computer");
            ComputerService.gaming();
            ComputerService.learn();
        }
    };

    @Override
    public void powerOn() {
        abstractComputer.powerOn();
    }

    @Override
    public void use() {
        abstractComputer.use();
    }

    @Override
    public void turnOff() {
        abstractComputer.turnOff();
    }

    @Override
    public void process() {
        abstractComputer.process();
    }
}
