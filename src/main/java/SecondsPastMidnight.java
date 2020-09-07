import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int secondsPast = scanner.nextInt();

        //Your code goes here
        int minutesPast = secondsPast / 60;
        int hoursPast = secondsPast / 3600;

        System.out.print(minutesPast + " " + hoursPast);

        // closing the scanner object
        scanner.close();
    }
    
}