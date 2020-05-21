import java.util.*;
public class EdadUsuario 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        int año, edad;
        System.out.println("Teclee su año de nacimiento");
        año = scan.nextInt();
        edad = 2020 - año;
        System.out.println("Su edad actual es " + edad);
    }
}
