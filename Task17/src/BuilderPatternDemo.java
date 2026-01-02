
public class BuilderPatternDemo {

    public static void main(String[] args) {

        Student student = new Student.StudentBuilder(101, "Rahul")
                .setAge(22)
                .setCity("Pune")
                .build();

        student.show();
    }
}


// Product Class
class Student {

    // Required fields
    private int id;
    private String name;

    // Optional fields
    private int age;
    private String city;

    // Private constructor (only Builder can access)
    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    // Display method
    public void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    // Builder Class
    static class StudentBuilder {

        private int id;
        private String name;
        private int age;
        private String city;

        // Required parameters
        public StudentBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Optional parameters
        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        // Build method
        public Student build() {
            return new Student(this);
        }
    }
}