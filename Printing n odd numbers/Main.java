import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,c=1;
      for(i=1;c<=n;i++)
      {
        if(i%2 != 0)
        {
          System.out.println(i);
          c=c+1;
        }
	}
}
}