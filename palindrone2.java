//this code is to generate palindrone numbers in given range
import java.util.Scanner;

public class palindrone2{

	public static void main(String a[]){
		System.out.println("Enter starting Range");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("Enter the ending range");
		int e=sc.nextInt();
		sc.close();
		System.out.println("Given range");
		for(int i=s;i<=e;i++){
			if(palin(i))
			System.out.println(i);
		} 

	}
	static boolean palin(int n){
	
	int r,s=0,t;
	t=n;
	while(t>0){
		r=t%10;
		s=s*10+r;
		t=t/10;
	}
	return s==n;
	}
}
