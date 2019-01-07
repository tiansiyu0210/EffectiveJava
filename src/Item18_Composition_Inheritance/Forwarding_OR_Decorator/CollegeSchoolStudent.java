package Item18_Composition_Inheritance.Forwarding_OR_Decorator;

public class CollegeSchoolStudent extends StudentDeorator{

    public CollegeSchoolStudent(Student student) {
        super(student);
    }

    @Override
    public void learnBusiness(){
        System.out.println("College School student learn Business");
    }
}
