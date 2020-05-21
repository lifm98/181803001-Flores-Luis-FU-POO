import java.util.*;
public class DistanciaPuntos 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double x1, y11 , x2, y22, d;
        System.out.println("Teclee la cordenada del punto 1 sobre el eje x");
        x1 = scan.nextDouble();
        System.out.println("Teclee la coordenada del punto 1 sobre el eje y");
        y11 = scan.nextDouble();
        System.out.println("Teclee la coordenada del punto 2 sobre el eje x");
        x2 = scan.nextDouble();
        System.out.println("Teclee la coordenada del punto 2 sobre el eje y");
        y22 = scan.nextDouble();
        d = Math.sqrt((Math.pow((x2 - x1) , 2)) + (Math.pow((y22 - y11), 2)));
        System.out.println("La distancia entre los dos puntos es: " + d);
    }
}
