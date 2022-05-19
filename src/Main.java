import java.util.Scanner;

/*
Switch 01
Exercise: Switch Statement 1

loop infinite times asking the user to input a number between 1 and 10
print the name of the number (e.g. 5 --> five)
if the user input a number lower than 1 or greater than 10, print Cannot give you the name
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String stringNumber;

        while (true){
            System.out.println("Type a number from 1 to 10 and hit enter");
            number=scanner.nextInt();
            switch (number){
                case 1 -> stringNumber="One";
                case 2 -> stringNumber="Two";
                case 3 -> stringNumber="Three";
                case 4 -> stringNumber="Four";
                case 5 -> stringNumber="Five";
                case 6 -> stringNumber="Six";
                case 7 -> stringNumber="Seven";
                case 8 -> stringNumber="Eight";
                case 9 -> stringNumber="Nine";
                case 10-> stringNumber="Ten";
                default -> stringNumber="Cannot give you the name";
            }
            System.out.println(stringNumber+'\n');
        }
    }
}
