import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();


        /*
         *  your code goes here
         */

        int deskA = classA / 2;
        if (deskA % 2 != 0)
        {
          deskA = deskA + 1;
        }
        
        int deskB = classB / 2;
        if (deskB % 2 != 0){
          deskB = deskB + 1;
        }
        int deskC = classC / 2;
        if (deskC % 2 != 0){
          deskC = deskC + 1;
        }
        
        int totalDesks = deskA + deskB + deskC;
        System.out.print(totalDesks);
        // closing the scanner object
        scanner.close();
    }
}