package Item19_Skeletal_Implementation.EX1;

public class Test {

    public static void main(String[] args) {

        HomeComputer homeComputer = new HomeComputer();
        homeComputer.process();

        System.out.println("========================================");
        WorkComputer workComputer = new WorkComputer();
        workComputer.process();
    }
}
