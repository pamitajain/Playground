import java.util.Scanner;
class Main{
  public static int greatest( int a, int b)
  {
    int big=0;
    if(a>=b)
      big=a;
    else
      big=b;
    return big;
  }
	public static void main (String[] args){
	    // Type your code here
	Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int large,l;
      large= greatest(n1,n2);
      l=greatest(large,n3);
      System.out.println(l);
    }
}