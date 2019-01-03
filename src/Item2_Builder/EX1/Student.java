package Item2_Builder.EX1;

public class Student {

    private final String name;  //required
    private final int age;      //required
    private final String address;   //optional
    private final String gender;    //optional
    private final boolean isGraduated;//optional
    private final double gpa;     //optional

    public static class Builder {
        //required params
        private final String name;  //required
        private final int age;  //required

        //optional params
        private  String address = "N/A";   //optional
        private  String gender = "M/FM";    //optional
        private  boolean isGraduated = false;//optional
        private  double gpa = 0.0;     //optional

        public Builder(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Builder address(String val){
            address = val;
            return this;
        }

        public Builder gender(String val){
            gender = val;
            return this;
        }

        public Builder isGraduated(boolean val){
            isGraduated = val;
            return this;
        }

        public Builder gpa(double val){
            gpa = val;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    private Student(Builder builder){
        name = builder.name;
        age = builder.age;
        address = builder.address;
        gender = builder.gender;
        isGraduated = builder.isGraduated;
        gpa = builder.gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", isGraduated=" + isGraduated +
                ", gpa=" + gpa +
                '}';
    }
}
