import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
        
        int hours1Seconds = hours1 * 3600;
        int minutes1Seconds = minutes1 * 60;
        int hours2Seconds = hours2 * 3600;
        int minutes2Seconds = minutes2 * 60;
        int totalSeconds1 = hours1Seconds + minutes1Seconds + seconds1;
        int totalSeconds2 = hours2Seconds + minutes2Seconds + seconds2;
        int timeStamp = totalSeconds2 - totalSeconds1;
        System.out.print(timeStamp);


        // closing the scanner object
        scanner.close();
    }
}