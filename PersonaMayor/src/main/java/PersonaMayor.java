import java.util.*;
public class PersonaMayor 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int edad;
        System.out.print("Teclee su edad: ");
        edad = scan.nextInt();
        if(edad > 18)
            System.out.println("Usted es mayor de edad");
        else
            System.out.println("Usted no es mayor de edad");
    }
}
