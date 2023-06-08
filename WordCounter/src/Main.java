import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int arraySize = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Type a complete sentence here -> ");
        String userInput = input.nextLine();


        String inputSentence = userInput.toString();
        String[] sentenceArray = inputSentence.split(" ");

        for(String a : sentenceArray){
            arraySize++;
        }

        System.out.println("Word count: " + arraySize);

    }
}