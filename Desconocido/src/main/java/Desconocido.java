import java.util.*;
public class Desconocido 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n, a, i = 0;
        System.out.print("Teclee el numero desconocido: ");
        n = scan.nextInt();
        System.out.print("Teclee el número que crea que es el desconocido: ");
        a = scan.nextInt();
        do
        {
            if(a < n)
            {
                System.out.print("El número que tecleaste es menor al desconocido, teclea otro: ");
                a = scan.nextInt();
                i++;
            }
            if(a > n)
            {
                System.out.print("El número que tecleaste es mayor al desconocido, telcea otro ");
                a = scan.nextInt();
                i++;
            }
        }while(a != n);
        System.out.println("Felicidades, encontraste el número desconocido. El número desconocido era: " + n);
        System.out.print("Número de intentos: " + i );
    }
}