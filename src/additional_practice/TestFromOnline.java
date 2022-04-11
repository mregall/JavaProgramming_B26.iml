package additional_practice;

public class TestFromOnline {
    public static void main(String[] args) {
        String word = "Counting up the spaces in the sentence";
        int i = 0, spaceCount = 1;

        while( i < word.length() ){
            if( word.charAt(i) == ' ' ) {
                spaceCount++;
            }
            i++;
        }

        System.out.println("Words in string: "+spaceCount);
    }
}
