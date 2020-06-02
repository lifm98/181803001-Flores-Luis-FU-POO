import java.util.*;
public class MainTarjeta 
{
    public static void main(String args[])
    {    
        Tarjeta tarjeta = new Tarjeta();
        Scanner scan = new Scanner(System.in);
        int nCuenta, NIP;
        System.out.print("Número de cuenta: ");
        nCuenta = scan.nextInt();
        System.out.print("NIP: ");
        NIP = scan.nextInt();
        tarjeta.verificarCuenta(nCuenta, NIP);
        
        System.out.println("\n" + tarjeta.nombre);
    }
}
