package day30_array2;

public class ReverseSentence {
    public static void main(String[] args) {


        String str = "Today is Monday, we learned String methods";
        String [] words = str.split(" ");

        String reversed = "";

        for(int i = words.length - 1; i >= 0; i--){
            reversed += words[i] + " ";
        }
        System.out.println(reversed.trim());

        int z = 5;
        for(int i=5;i>0;i--){
            z+=i;
        }
        System.out.println(z);

    }
}
