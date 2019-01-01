package Item1_static_factor_method.EX2;

public class Student {
    private static Student onlyStudent = null;

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Student getOnlyStudent(){
        if(onlyStudent == null){
            onlyStudent = new Student();
            onlyStudent.setAge(18);
            onlyStudent.setName("tian");
        }
        return onlyStudent;
    }

}
