package Item1_static_factor_method.EX1;

public class Student {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static Student newStudent(int age){
        if(age >18){
            System.out.println("college student");
            return new CollegeStudent();
        }else{
            System.out.println("high school student");
            return new HighSchoolStudent();
        }

    }
}
