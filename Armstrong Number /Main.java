import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int rem,r=0,temp;
      temp=n;
      while(n>0)
      {
        rem=n%10;
        n=n/10;
        r=r+(rem*rem*rem);
      }
      if(temp==r)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
        
	}
