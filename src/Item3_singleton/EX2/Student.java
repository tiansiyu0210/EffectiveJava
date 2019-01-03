package Item3_singleton.EX2;

public class Student {

    private static final Student INSTANCE = new Student();

    private int age;

    private Student(){}

    public static Student getInstance(){
        return INSTANCE;
    }

    public void testMethod(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

