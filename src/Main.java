import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 - 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if(inputtedNum < 5){
            System.out.println("You will Receive a lot of wealth in the near future");
        }
        else{
            System.out.println("You will receive fame as long as you never give up on your dreams");
        }
    }
}
