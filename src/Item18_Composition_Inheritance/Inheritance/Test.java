package Item18_Composition_Inheritance.Inheritance;

public class Test {
    //result:
    //new super
    //new sub
    //in the sub.m2
    //in the sub.m1
    //in the super.m1
    //in the super.m2
    public static void main(String[] args) {
        Sub a = new Sub();
        a.m2();
    }

}
