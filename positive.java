import java.util.*;
 
class PosNegZero
{
    public static void main(String[] args)
    {
        int num;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);
         
        System.out.print(" ");
        num=sc.nextInt();
         
        //check condition for +ve, -ve and Zero
        if(num>0)
            System.out.println( "positive");
        else if(num<0)
            System.out.println( "negative");
        else
            System.out.println("IT's ZERO.");
         
    }
}

