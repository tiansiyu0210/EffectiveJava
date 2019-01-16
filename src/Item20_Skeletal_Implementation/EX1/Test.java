package Item20_Skeletal_Implementation.EX1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    static double a = 4_3.34_3;
    static int b =1_000_000;

    public static void main(String[] args) {

        HomeComputer homeComputer = new HomeComputer();
        homeComputer.process();

        System.out.println("========================================");
        WorkComputer workComputer = new WorkComputer();
        workComputer.process();
        System.out.println(a);
        System.out.println(b);
        final List<Integer> a = new ArrayList<>();
        a.add(new Integer(4));
        a.add(new Integer(5));
        System.out.println(a);
        Set<ComputerService> s = new HashSet<>();
    }
}
