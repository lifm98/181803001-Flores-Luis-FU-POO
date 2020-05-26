import java.util.*;
public class NumeroMayor 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("Teclee un numero");
        a = scan.nextDouble();
        System.out.print("Teclee otro numero");
        b = scan.nextDouble();
        if(a > b)
            System.out.print(a + " es mayor que " + b);
        else
            System.out.print(b + " es mayor que " + a);
    }
}
