import java.util.Scanner;

public class thanks_giving_message_method {
    public static void main(String[] args) {
    thanks_giving_message();

    }

    static void thanks_giving_message( ){
        Scanner input  =  new Scanner(System.in);
        System.out.println("Enter the name of the Person whom you want to give a thanks giving message:");
        String name = input.nextLine();
        System.out.printf("Thank You %s,\nI wish all your dreams come true!! ", name);
        input.close();

    }

}

