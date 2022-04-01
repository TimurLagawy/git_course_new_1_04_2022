import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("Input a number: ");
        int num=in.nextInt();

        System.out.println("Your number is  " +num);
        in.close();
        *//*Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number: ");
        int num=scanner.nextInt();

        System.out.println("Your number is  " +num);
        scanner.close();
        */

    Scanner scanner=new Scanner(System.in);
    System.out.println("Input name: ");
    String name=scanner.nextLine();
    System.out.println("Input age: ");
    int age= scanner.nextInt();
    System.out.println("Input height: ");
    float height=scanner.nextFloat();
    System.out.printf("Name: %s Age: %d Height: %.2f \n", name,age,height);
}//при вводе дробного числа использовать запятую!!!
}

