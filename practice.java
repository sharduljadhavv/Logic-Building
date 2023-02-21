//a program that prints the table of a number that is input by the user.
import java.util.*;
public class practice
{
 public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter The Input Number:"); 
    int a = sc.nextInt();
    for(int i=1;i<=10;i++)
    {
        int table = a*i;
        System.out.println(table);
    }
       
 }
}