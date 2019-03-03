import java.util.Scanner;
class Main
{
  public static int po(int n1, int n2)
{
  int i,r=n1;
  for(i=1;i<n2;i++)
  {
    r=r*n1;
  }
  return r;
}
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=in.nextInt();
    System.out.println(po(n1, n2));
  }
}
