import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in= new Scanner(System.in);
      int arr_size= in.nextInt();
      int big,i;
      int arr[]= new int[arr_size];
      for( i=0; i<arr_size; i++)
        arr[i]= in.nextInt();
      
      big= arr[0];
      for(i=0;  i<arr_size; i++)
      {
        if(big< arr[i])
        {
          big = arr[i];
        }
      }
      System.out.println(big);
    }
}