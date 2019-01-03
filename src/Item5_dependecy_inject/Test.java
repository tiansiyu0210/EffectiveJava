package Item5_dependecy_inject;

public class Test {

    public static void main(String[] args) {
        Class classForStudentTian = new Class("Java", "bloch");
        Student tian = new Student(classForStudentTian);
        tian.setName("tian");
        System.out.println(tian);
    }
}
