import java.util.Scanner;
public class LogicPrograms{
    public static void main(String a[]){
        Method1(9);
        Method2();
    }
    static void Method1(int n){
        int num1=0,num2=1;
        int sum=0;
        System.out.print(num1+"    "+num2+"    ");    
        while(sum<=n-2){
            sum=num1+num2;
            System.out.print(sum+"   ");
            num1=num2;
            num2=sum;
        }

    }
    static void Method2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n =sc.nextInt();
        int n1=0,n2=1;
        int sum=0;
        System.out.print(n1+"  "+n2+"   ");
        while(sum<=n-2){
            sum=n1+n2;
            System.out.print(sum+"   ");
            n1=n2;
            n2=sum;

        }
    }
}