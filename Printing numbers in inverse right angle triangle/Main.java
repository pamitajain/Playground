import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n;
      for(int row=1; row<=n; row++)
      {
    
        for(int col=1; col<=n-(row-1); col++)
        {
          System.out.print(num);
          num--;
        }
        System.out.println();
        num=n-row;
      }
	}
}