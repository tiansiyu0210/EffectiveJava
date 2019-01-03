package Item2_Builder.EX1;

public class Test {
    public static void main(String[] args) {
        Student a =new Student.Builder("tian", 31)
                .gpa(4.0)
                .address("main st")
                .gender("M")
                .isGraduated(true)
                .build();

        System.out.println(a.toString());

        Student b = new Student.Builder("Jhon", 20).build();
        System.out.println(b.toString());

    }
}
