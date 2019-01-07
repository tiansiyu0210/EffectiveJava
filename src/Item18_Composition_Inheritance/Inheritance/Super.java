package Item18_Composition_Inheritance.Inheritance;

public class Super {

    public void m1(){
        System.out.println("in the super.m1");
    }


    public void m2(){
        m1();
        System.out.println("in the super.m2");
    }
}
