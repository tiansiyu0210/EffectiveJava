package Item5_dependecy_inject;

public class Student {

    private final Class classInstance;

    private String name;

    public Student(Class classInfo){
        this.classInstance = classInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int cauculateGpa(){
        return 4;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classInstance=" + classInstance +
                ", name='" + name + '\'' +
                '}';
    }
}
