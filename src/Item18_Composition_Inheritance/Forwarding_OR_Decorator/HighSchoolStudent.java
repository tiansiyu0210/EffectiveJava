package Item18_Composition_Inheritance.Forwarding_OR_Decorator;

public class HighSchoolStudent extends StudentDeorator{

    public HighSchoolStudent(Student student) {
        super(student);
    }

    @Override
    public void learnMath(){
        System.out.println("High School student learn math");
    };

    @Override
    public void learnHistory(){
        System.out.println("High School student learn History");
    }
}
