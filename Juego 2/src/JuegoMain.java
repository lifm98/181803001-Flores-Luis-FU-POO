import java.util.*;
public class JuegoMain 
{
    public static void main(String args[])
    {
        int valor;
        Scanner scan = new Scanner(System.in);
        
        Personaje p1 = new Personaje("Luis");
        Personaje p2 = new Personaje();
        
        System.out.println("Jugador 1, qué tipo de arma usarás?\n1.- Bronce\n2.-Plata"
        + "\n3.-Oro\n4.-Diamante\n5.-Adamantium");
        
        valor = scan.nextInt();
        p1.equiparArma(valor);
        
        System.out.println("Jugador 2, qué tipo de arma usarás?\n1.- Bronce\n2.-Plata"
        + "\n3.-Oro\n4.-Diamante\n5.-Adamantium");
        
        valor = scan.nextInt();
        p2.equiparArma(valor);
        
        System.out.println(p1);
        
        System.out.println(p2);
    }
}