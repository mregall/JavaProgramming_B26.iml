package day13_if_statements3;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a language: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French");
        int option = input.nextInt();
        String message;

        if(option == 1){
            message = "hello, thank for your call";
        } else if (option == 2){
            message = "hola, gracias para llamar";
        } else if (option == 3){
            message = "merhaba, aradiginiz icin tesekkurler";
        } else if (option == 4){
            message = "privet, spasibo za vash zvonok";
        } else if(option == 5){
            message = "Merci ,pour votre appel";
        } else {
            message = "We will use English by default";
        }

        System.out.println(message);
    }
}
