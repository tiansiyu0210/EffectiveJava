package Item18_Composition_Inheritance.Inheritance;

public class Sub extends Super{

    @Override
    public void m1(){
        System.out.println("in the sub.m1");
        super.m1();
    }

    @Override
    public void m2(){
        System.out.println("in the sub.m2");
        super.m2();
    }
}
