import java.util.*;
public class AreaCuadrado 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double l, a;
        System.out.println("Teclee la medida de un lado del cuadrado");
        l = scan.nextDouble();
        l = l * l;
        System.out.println("El area del cuadrado es: " + l);     
        }
}
