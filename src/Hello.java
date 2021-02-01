import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.print("Say your name: ");
//        String name = in.nextLine();
//        System.out.printf("Hello, %s ! \n", name);
//        for (int i = 0; i < args.length; i++) {
//            System.out.printf("Hello, %s ! \n", args[i]);
        for (String s : args){
            System.out.printf("Hello, %s ! \n", s);
        }
    }
    }

