package Item1_static_factor_method.EX2;

public class Test {

    public static void main(String[] args) {
        Student a = Student.getOnlyStudent();
        Student b = Student.getOnlyStudent();
        if(a == b){
            System.out.println("same default student");
            System.out.println(a.getAge() + " " + a.getName());
        }
    }
}
