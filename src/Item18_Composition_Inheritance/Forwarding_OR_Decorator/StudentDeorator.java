package Item18_Composition_Inheritance.Forwarding_OR_Decorator;

public class StudentDeorator implements Student{

    protected Student student;

    public StudentDeorator(Student student){};

    @Override
    public void learnMath() {
        System.out.println("learn Math");
    }

    @Override
    public void learnHistory() {
        System.out.println("learn History");
    }

    @Override
    public void learnBusiness() {
        System.out.println("learn Business");
    }

    @Override
    public void learnChinese() {
        System.out.println("learn Chinese");
    }
}
