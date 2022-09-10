import java.util.Scanner;

public class OOP04 {
    public static void main(String[] args) {
        System.out.println("enter 3 num:");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int a=in.nextInt();
        int s = x + y + a /3;
        System.out.println(s);
    }
}
