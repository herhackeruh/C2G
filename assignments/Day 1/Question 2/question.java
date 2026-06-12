import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int balance=input.nextInt();
      int packcost=input.nextInt();
      if(balance>=packcost){
        System.out.println("Recharge Successful");
      }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}