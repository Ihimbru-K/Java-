

public class SwitchStatement {
    public static void main(String[] args) {
        int Score = 85;
        String Grade;

        // Use a switch statement to assign a letter grade based on the value of Score/10
        switch (Score/10) {
            case 8:
            case 9:
                Grade = "A";
                break;
            case 7:
            case 6:
                Grade = "B";
                break;
            case 5:
                Grade = "C";
                break;
            case 4:
                Grade = "D";
                break;
            case 3:
            case 2:
            case 1:
                Grade = "F";
                break;
            default:
                Grade = "other";
                break;
        }

        // Print the letter grade
        System.out.println("Your grade is " + Grade);
    }
}