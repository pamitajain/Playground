import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]= new int[n];
    int i,c=0;
    for(i=0; i<n; i++)
      list[i]= in.nextInt();
    int max;
    max= list[0];
    for(i=0; i<n; i++)
    {
      if(max<list[i])
      {
        max=list[i];
        c=i;
      }
    }
        System.out.println(c);
  }
}