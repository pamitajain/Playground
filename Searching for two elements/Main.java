import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner  in= new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]= new int[arr_size]; 
      int idx,count=0;
      for(idx=0; idx < arr_size; idx++)
        arr[idx]= in.nextInt();
      int search_elem_1= in.nextInt();
      int search_elem_2= in.nextInt();
        for( idx=0; idx<arr_size;  idx++)
        {
          if(arr[idx]==search_elem_1)
          {
            System.out.println(idx);
            count=1;
          }
        }
          if(count==0)
            System.out.println("-1");
      count=0;
        for(idx=0; idx<arr_size;idx++)
        {
          if(arr[idx]==search_elem_2)
          {
            System.out.println(idx);
            count=1;
          }
        }
      if(count==0)
        System.out.println("-1");
      
          
      
      }
          
    }
