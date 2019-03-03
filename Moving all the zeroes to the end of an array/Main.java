import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int i,z=0,c=0;
      int arr[]= new int[arr_size];
      for(i=0;i<arr_size;i++)
        arr[i]=in.nextInt();
      for(i=0;i<arr_size;i++)
      {
        if(arr[i]==0)
          z++;
        else
        {
          System.out.print(arr[i] + " ");
          c++;
        }
      }
      for(i=c; i<arr_size;i++)
        System.out.print("0 ");
    }
}