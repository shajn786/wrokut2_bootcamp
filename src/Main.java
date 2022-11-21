import java.util.Scanner;

public class Main {

    static int opt;
    static Scanner sc = new Scanner(System.in);
    static void largest()
    {
        int num1,num2,num3,result;
        System.out.println("enter the three numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();

        result = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println(result);
    }

    static void smallest()
    {
        int num1,num2,num3,result;
        System.out.println("enter the three numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();

        result = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        System.out.println(result);
    }
    public static void main(String[] args) {

        System.out.println("enter the operation\n" +
                "1 : Largest of three\n" +
                "2 : Smmallest of three Numbers");
        opt =sc.nextInt();

        switch(opt)
        {
            case 1:
                largest();

            case 2:
                smallest();
        }

    }
}