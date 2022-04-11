package saim_array;

public class Gradebook {
    public static void main(String[] args) {
        /*
        Gradebook
Declare three arrays:
1. String array which will hold names for the students (give values)
2. Int array which has the score of the student got in the quiz (give values)
3. Char array which will have some letter grade based on the score (empty)
4. Output the gradebook at the end with all the information

         */
        String [] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int [] scores = {80, 54, 100, 66, 94};
        char [] grades = {'B', 'D', 'A', 'C', 'A'};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);

        }
    }
}
