import java.util.Scanner;

public class Reading_Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
