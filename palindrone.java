import java.util.Scanner;
public class palindrone{
public static void main(String a[]){
    Method1();
}
static void Method1(){
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    int temp,rem,sum=0;
    temp=no;
    while(no>0){
        rem=no%10;
        sum=sum*10+rem;
        no=no/10;
    }
    if(sum==temp)
        System.out.println("Palindrone");
    else
        System.out.println("Not Palindrone");
}
}