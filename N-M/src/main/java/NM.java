import java.util.*;
public class NM 
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Teclee el número con el que desea que comience la numeración: ");
        a = scan.nextInt();
        System.out.print("Teclee el numero con el que desea que termine la numeración: ");
        b = scan.nextInt();
        while(a <= b)
        {
            System.out.println(a);
            a++;
        }
    }
}
