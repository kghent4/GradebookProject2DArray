public class Gradebook {

    String[] labels = { "Last", "First", "Test1", "Test2", "Quiz1", "Quiz2", "Homework1", "Homework2", "Homework3",
            "Homework4", "Homework5", "Homework6", "Homework7", "Homework8", "Homework9", "Homework10" };

    String[][] book;

    public Gradebook(String[][] b) {
        if (b.length > 0 && b[0].length == 16) {
            book = b;
        }

        else {
            System.out.println("Gradebook is not the right size. Ensure that formatting is correct.");
            book = new String[1][16];
        }
    }

    public boolean changeGrade(String lastName, String assnName, int newGrade) {
        // Your code here
        return false;
    }

    public double findAssignmentAverage(String assnName) {
        // Your code here
        return -1;
    }

    public double findStudentAverage(String lastName) {
        // Your code here
        return -1;
    }

    public void printStudentInfo(String lastName) {
        // Your code here
    }

}
