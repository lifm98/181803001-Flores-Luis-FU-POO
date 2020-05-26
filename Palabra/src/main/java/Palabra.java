import java.util.*;
public class Palabra 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String p;
        int v;
        System.out.print("Teclee una palabra: ");
        p = scan.nextLine();
        scan.nextInt();
        System.out.print("Teclee el numero de veces que quiera que se repita su palabra: ");
        v = scan.nextInt();
        for(int i = 0; i < v; i++)
        {
            System.out.println(p);
        }
    }
}
