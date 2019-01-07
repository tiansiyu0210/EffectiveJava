package Item18_Composition_Inheritance.Forwarding_OR_Decorator;

public class Test {

    public static void main(String[] args) {
        HighSchoolStudent hs = new HighSchoolStudent(new StudentImpl());
        hs.learnHistory();
        hs.learnMath();
        hs.learnBusiness();

        CollegeSchoolStudent cs = new CollegeSchoolStudent(new StudentImpl());
        cs.learnBusiness();
        cs.learnChinese();

    }

}
