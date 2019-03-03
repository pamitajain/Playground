import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch= in . next().charAt(0);
      int key=in.nextInt(); 
      int offset;
      if(ch>='a' && ch<='z')
      {
        offset= ch- 'a';
        offset= (offset + 26 - key) % 26;
        ch=(char)(offset + 'a');
      }
      else if(ch>='A' && ch<='Z')
      {
        offset= ch- 'A';
        offset= (offset + 26 - key) % 26;
        ch=(char)(offset + 'A');
      }
      System.out.println(ch);
    }
}