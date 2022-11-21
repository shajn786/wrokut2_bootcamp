import java.util.Scanner;

public class Main {

    static int num1,num2,num3,result;
    static int opt;
    static Scanner sc = new Scanner(System.in);
    static void largest()
    {

        System.out.println("enter the three numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();

        result = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Largest number is"+result);
    }

    static void smallest()
    {

        System.out.println("enter the three numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();

        result = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        System.out.println("Smallest number is"+result);
    }

    static void prime()
    {
        int num,count=0;
        System.out.println("enter the number to check prime or not");
        num =sc.nextInt();

        for(int i =2 ;i<=num-1;i++)
        {
            if(num%i== 0)
            {
                count++;
            }
        }

        if(count == 0)

            System.out.println("Number is prime");
        else
            System.out.println(" Number is not prime");

    }

    static void Evenornot()
    {
        int num;
        System.out.println("enter the number");
        num =sc.nextInt();
        if(num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is not even");


    }

    static  void reverse()
    {
        int rev=0,rem=0,num;
        System.out.println("enter the number to find reverse");
        num =sc.nextInt();

        while(num>0)
        {
            rem =num%10;
            rev =rev*10+rem;
            num = num/10;
        }

        System.out.println("Reverse of the number is "+rev);

    }
    public static void main(String[] args) {

        while(true) {

            System.out.println("enter the operation\n" +
                    "1 : Largest of three\n" +
                    "2 : Smallest of three Numbers\n" +
                    "3 : Prime of a number\n" +
                    "4 : Even or Not\n" +
                    "5 : Reverse of number\n" +
                    "enter 0 to exit");
            opt = sc.nextInt();
            if(opt ==0)
            {
                break;
            }

            switch (opt) {
                case 1:
                    largest();
                    break;

                case 2:
                    smallest();
                    break;

                case 3:
                    prime();
                    break;

                case 4:
                    Evenornot();
                    break;

                case 5:
                    reverse();
                    break;

                default:
                    System.out.println("enter correct option");
            }
        }

    }
}