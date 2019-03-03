import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      for(int rowno=1; rowno<=n; rowno++)
      {
        for(int space=1; space<=(n-rowno); space++)
        {
          System.out.print(" ");
        }
        for(int colno=1; colno<=(2*rowno-1); colno++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}