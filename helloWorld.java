import java.util.*;
public class helloWorld {
    public static void printHelloWorld(int n){
        if (n>0){
        System.out.println("Hello World:"+n);
        printHelloWorld(n-1);
        }
    }
    public static int sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static int fact(int n){
        int factorial;
        if(n==1){
            return 1;
        }
        factorial=fact(n-1)*n;
        return factorial;
    }
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number num1:");
        int num1=s.nextInt();
        System.out.println("Enter the number num2:");
        int num2=s.nextInt();
        printHelloWorld(num1);
        int add=sum(num1,num2);
        System.out.println("sum of the two number is:"+add);
        int result=fact(num1);
        System.out.println("The factorial of the number is:"+result);
    }
}