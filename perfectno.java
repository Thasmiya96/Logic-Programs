import java.util.Scanner;
public class perfectno{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        boolean b=perf(no);
        if(b)
            System.out.println(no+" is a perfect Number");
        else
            System.out.println(no+" is not a perfect Number");
    }
    public static boolean perf(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum += i;
        }
        if(n==sum)
            return true;
        
        return false;

    }
}