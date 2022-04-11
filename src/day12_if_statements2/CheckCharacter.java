package day12_if_statements2;

public class CheckCharacter {
    public static void main(String[] args) {

        char letter = 97;

//        if(letter >= 97 && letter <= 122){
//            System.out.println("lowercase");
//        }

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("Lowercase");
        }

        if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Uppercase");
        }




    }

}
