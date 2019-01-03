package Item3_singleton.EX2;

public class Test {

    public static void main(String[] args) {
        Student a = Student.getInstance();
        Student b = Student.getInstance();

        if(a == b){
            System.out.println("same student");
        }else{
            System.out.println("different student");
        }

        a.setAge(15);
        b.setAge(20);
        System.out.println("student a age: " + a.getAge());
    }
}
