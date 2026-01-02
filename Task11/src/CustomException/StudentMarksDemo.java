package CustomException;


public class StudentMarksDemo {

    static void validateMarks(int marks) throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {

        int marks = 150; // Invalid marks

        try {
            validateMarks(marks);
        }
        catch (InvalidMarksException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
